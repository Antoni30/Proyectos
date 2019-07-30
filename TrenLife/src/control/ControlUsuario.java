
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Hash;
import modelo.UsuarioDAO;
import modelo.UsuarioVO;
import vista.JFInicio;
import vista.JFRegistro;

public class ControlUsuario implements ActionListener{
    private JFRegistro r;
    UsuarioDAO uDAO = new UsuarioDAO();
    UsuarioVO uVO = new UsuarioVO();
    
    public ControlUsuario(JFRegistro r){
        this.r=r;
        this.r.btnRegistrar.addActionListener(this);
        this.r.btnAtras.addActionListener(this);
    }
    
    private void limpiar() {
        r.txtUser.setText("");
        r.txtPassword.setText("");
        r.txtConfirmaPassword.setText("");
        r.txtNombre.setText("");
        r.txtdireccion.setText("");
        r.txttelefono.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== r.btnRegistrar){
            String pass = new String(r.txtPassword.getPassword());
            String passC = new String(r.txtConfirmaPassword.getPassword());

        if (r.txtUser.getText().equals("") || pass.equals("") || passC.equals("") || 
            r.txtNombre.getText().equals("") || r.txtdireccion.getText().equals("")|| r.txttelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {

            if (pass.equals(passC)) {

                if (uDAO.existeUsuario(r.txtUser.getText()) == 0) {

                        String nuevoPass = Hash.sha1(pass);

                        uVO.setUser(r.txtUser.getText());
                        uVO.setPassword(nuevoPass);
                        uVO.setNombre(r.txtNombre.getText());
                        uVO.setDireccion(r.txtdireccion.getText());
                        uVO.setTelefono(r.txttelefono.getText());

                        if (uDAO.registrar(uVO)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                            limpiar();
                        }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
        }else if(e.getSource()== r.btnAtras){
            this.r.dispose();
        }
    }
    
}
