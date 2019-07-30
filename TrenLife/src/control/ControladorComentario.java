
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.GestorArchivoExperiencia;
import modelo.ListaExperiencia;
import modelo.UsuarioExperiencia;
import vista.JFExperiencias;


public class ControladorComentario implements ActionListener{
    JFExperiencias e;
    public ControladorComentario(JFExperiencias e)
    {
        this.e=e;
        this.e.btnActulizar.addActionListener(this);
        this.e.btnAgregar.addActionListener(this);
       this.e.Comentario.setLineWrap(true);
       this.e.Comentario.setWrapStyleWord(true);
       this.e.mostrar.setLineWrap(true);
       this.e.mostrar.setWrapStyleWord(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.e.btnActulizar) {
            ListaExperiencia li = new ListaExperiencia();
        GestorArchivoExperiencia a = new GestorArchivoExperiencia();
        li= a.obtenerLista();
        String m=" ";
        for (int i = 0; i < li.size(); i++) {
            m=li.obtener(i)+"\n\n\n"+m;
        }
            this.e.mostrar.setText(m);
        }
        else if (e.getSource()==this.e.btnAgregar) {
            GestorArchivoExperiencia g = new GestorArchivoExperiencia();
            UsuarioExperiencia u = new UsuarioExperiencia(this.e.txtUsuario.getText(),this.e.Comentario.getText());
            g.AgregarExperiencia(u);
            this.e.Comentario.setText(null);
            JOptionPane.showMessageDialog(null,"Comentario Agregado");
        }
    }
    
}
