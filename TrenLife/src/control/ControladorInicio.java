
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ListaUsuario;
import modelo.UsuarioDAO;
import vista.JFActividades;
import vista.JFBoleto;
import vista.JFExperiencias;
import vista.JFHistoria;
import vista.JFInicio;
import vista.JFLogin;
import vista.JFRegistro;
import vista.JFRutas;


public class ControladorInicio implements ActionListener {
    JFInicio i ;
   public ControladorInicio(JFInicio i)
   {
      this.i=i;
      this.i.btnLogin.addActionListener(this);
      this.i.btnRegistro.addActionListener(this);
      this.i.btnactividades.addActionListener(this);
      this.i.btncomentario.addActionListener(this);
      this.i.btncomprar.addActionListener(this);
      this.i.btnhistoria1.addActionListener(this);
      this.i.btnrutas.addActionListener(this);
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==i.btnLogin) {
            JFLogin l= new JFLogin();
            ControlLogin c= new ControlLogin(l);
            l.setVisible(true);
            i.sonido.stop();
        }
        else if (e.getSource()==i.btnRegistro) {
            JFRegistro r=new JFRegistro();
            ControlUsuario u= new ControlUsuario(r);
            r.setVisible(true);
            i.sonido.stop();
        }
        else if (e.getSource()==i.btnactividades) {
            JFActividades a= new JFActividades();
            a.setVisible(true);
        }
        else if (e.getSource()==i.btncomentario) {
            JFExperiencias r = new JFExperiencias();
            ListaUsuario l = new ListaUsuario();
            UsuarioDAO u= new UsuarioDAO();
            l=u.mostrarCliente();
            for (int j = 0; j < l.size(); j++) {
                if (this.i.User.getText() == null ? l.obtener(j).getUser() == null : this.i.User.getText().equals(l.obtener(j).getUser())) {
                    r.txtUsuario.setText(l.obtener(j).getNombre());
                }
            }
            ControladorComentario c = new ControladorComentario(r);
            r.setVisible(true);
        }
        else if (e.getSource()==i.btncomprar) {
            JFBoleto b = new JFBoleto();
            ControladorCompra c = new ControladorCompra(b);
            UsuarioDAO u = new UsuarioDAO();
            ListaUsuario l = new ListaUsuario();
            l=u.mostrarCliente();
            for (int j = 0; j < l.size(); j++) {
                if (this.i.User.getText() == null ? l.obtener(j).getUser() == null : this.i.User.getText().equals(l.obtener(j).getUser())) {
                   b.n.setText(l.obtener(j).getNombre());
                   b.d.setText(l.obtener(j).getDireccion());
                   b.t.setText(l.obtener(j).getTelefono());
                }
            }
            b.setVisible(true);
        }
        else if (e.getSource()==i.btnhistoria1) {
             JFHistoria h= new JFHistoria();
               h.setVisible(true);
        }else if (e.getSource()==i.btnrutas) {
            JFRutas r= new JFRutas();
            r.setVisible(true);
        }
        
    }
}
