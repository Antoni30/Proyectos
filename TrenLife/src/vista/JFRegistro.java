
package vista;

import modelo.Hash;
import javax.swing.JOptionPane;
import modelo.UsuarioDAO;
import modelo.UsuarioVO;


public class JFRegistro extends javax.swing.JFrame {


    public JFRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondoregistro, "src/Imagenes/fondoregistro.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmaPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        fondoregistro = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 168, 200, -1));

        txtdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 209, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 47, -1, -1));

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 44, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 88, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>Confirmar Password:</html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 125, 71, 32));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 171, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 212, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 85, 200, -1));

        txtConfirmaPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtConfirmaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 121, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 253, -1, -1));

        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 250, 200, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRO");

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregresar.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAtras)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrar.setText("Registrar");
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));
        getContentPane().add(fondoregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    }//GEN-LAST:event_formWindowClosing

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char c= evt.getKeyChar();
        if((c<'0'||c>'9'))evt.consume();
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'A'||c>'Z') && (c<' '||c>' '))evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel fondoregistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txtConfirmaPassword;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUser;
    public javax.swing.JTextField txtdireccion;
    public javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
