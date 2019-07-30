package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Hash;
import modelo.UsuarioDAO;
import modelo.UsuarioVO;
import vista.JFInicio;
import vista.JFLogin;

public class ControlLogin implements ActionListener {

    private final JFLogin l;
    UsuarioDAO uDAO = new UsuarioDAO();
    UsuarioVO uVO = new UsuarioVO();

    public ControlLogin(JFLogin l) {
        this.l = l;
        this.l.btnEntrar.addActionListener(this);
        this.l.btnAtras.addActionListener(this);
    }

    private void limpiar() {
        l.txtUser.setText("");
        l.txtPass.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == l.btnEntrar) {
            String pass = new String(l.txtPass.getPassword());

            if (!l.txtUser.getText().equals("") && !pass.equals("")) {

                String nuevoPass = Hash.sha1(pass);

                uVO.setUser(l.txtUser.getText());
                uVO.setPassword(nuevoPass);

                if (uDAO.login(uVO)) {
                    JFInicio p = new JFInicio();
                    ControladorInicio s = new ControladorInicio(p);
                    String nombre = l.txtUser.getText();
                    p.User.setText(nombre);
                    p.txtUsuario.setVisible(true);
                    p.User.setVisible(true);
                    p.btnLogin.setVisible(false);
                    p.btnRegistro.setVisible(false);
                    p.setVisible(true);
                    p.btncomentario.setVisible(true);
                    p.btncomprar.setVisible(true);
                    this.l.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                    limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
            }

        } else if (e.getSource() == l.btnAtras) {
            this.l.dispose();
        }
    }
}
