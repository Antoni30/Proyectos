package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class UsuarioDAO extends Conexion {
     
    public boolean registrar(UsuarioVO usr) {
        Conexion cone= new Conexion();
        PreparedStatement ps = null;
        Connection con = cone.getObtener();
        String sql = "INSERT INTO usuarios (username, pass, nombre, direccion, telefono,id) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUser());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getDireccion());
            ps.setString(5, usr.getTelefono());
            ps.setInt(6, usr.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean login(UsuarioVO usr) {
        PreparedStatement ps = null;
        Conexion cone= new Conexion();
        ResultSet rs = null;
        Connection con = cone.getObtener();

        String sql = "SELECT id, username, pass, nombre, direccion FROM usuarios WHERE username = ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUser());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(3))) {
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setDireccion(rs.getString(5));
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
            
            }
        }
    }

    public int existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion cone= new Conexion();
        Connection con = cone.getObtener();

        String sql = "SELECT count(id) FROM usuarios WHERE username = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
     public ListaUsuario mostrarCliente()
    {
        Conexion cone= new Conexion();
        ListaUsuario list= new ListaUsuario();
        UsuarioVO cli;
        try {
            Connection acceso = cone.getObtener();
            PreparedStatement ps = acceso.prepareStatement("SELECT * from usuarios");
            ResultSet sr = ps.executeQuery();
            while(sr.next())
            {
                cli = new UsuarioVO();
                cli.setUser(sr.getString(1));
                cli.setNombre(sr.getString(3));
                cli.setDireccion(sr.getString(4));
                cli.setTelefono(sr.getString(5));
                list.agregar(cli);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
