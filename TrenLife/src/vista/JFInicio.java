
package vista;

import control.ControlLogin;
import control.ControlUsuario;
import java.applet.AudioClip;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JFInicio extends javax.swing.JFrame {

    public static JFRegistro frmReg;
    public static JFLogin frmLog;
    public AudioClip sonido;
    public JFInicio() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondoinicio, "src/Imagenes/fondoinicio.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(video, "src/Imagenes/AKTIVA PUBLICIDAD[1].gif");
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/vista/AKTIVA PUBLICIDAD[1].wav"));
        sonido.play();
        txtUsuario.setVisible(false);
        User.setVisible(false);
       btncomprar.setVisible(false);
       btncomentario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        Titilo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btncomentario = new javax.swing.JButton();
        btnactividades = new javax.swing.JButton();
        btnrutas = new javax.swing.JButton();
        btnhistoria1 = new javax.swing.JButton();
        btncomprar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        video = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fondoinicio = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 580));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Titilo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titilo.setForeground(new java.awt.Color(255, 255, 255));
        Titilo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titilo.setText("TREN LIFE");
        Titilo.setToolTipText("");
        Titilo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Titilo.setFocusable(false);
        Titilo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnsalir.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Titilo, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titilo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        btnRegistro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregistrarNULL.png"))); // NOI18N
        btnRegistro.setText("Registro");
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.setFocusPainted(false);
        btnRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregistrar.png"))); // NOI18N
        btnRegistro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnloginNULL.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnlogin.png"))); // NOI18N
        btnLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        btncomentario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncomentario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncomentarioNULL.png"))); // NOI18N
        btncomentario.setText("Comentarios");
        btncomentario.setBorderPainted(false);
        btncomentario.setContentAreaFilled(false);
        btncomentario.setFocusPainted(false);
        btncomentario.setFocusable(false);
        btncomentario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncomentario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncomentario.png"))); // NOI18N
        btncomentario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncomentarioBIG.png"))); // NOI18N
        btncomentario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncomentario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btncomentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        btnactividades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnactividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnactividesNULL.png"))); // NOI18N
        btnactividades.setText("Actividades");
        btnactividades.setBorderPainted(false);
        btnactividades.setContentAreaFilled(false);
        btnactividades.setDoubleBuffered(true);
        btnactividades.setFocusPainted(false);
        btnactividades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactividades.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnactividesdes.png"))); // NOI18N
        btnactividades.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnactividadesBIG.png"))); // NOI18N
        btnactividades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnactividades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactividadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnactividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        btnrutas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrutasNULL.png"))); // NOI18N
        btnrutas.setText("Mirar Rutas");
        btnrutas.setBorderPainted(false);
        btnrutas.setContentAreaFilled(false);
        btnrutas.setFocusPainted(false);
        btnrutas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrutas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrutas.png"))); // NOI18N
        btnrutas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrutasBIG.png"))); // NOI18N
        btnrutas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnrutas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrutasActionPerformed(evt);
            }
        });
        getContentPane().add(btnrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        btnhistoria1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhistoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnhistoriaNULL.png"))); // NOI18N
        btnhistoria1.setText("Historia");
        btnhistoria1.setBorderPainted(false);
        btnhistoria1.setContentAreaFilled(false);
        btnhistoria1.setFocusPainted(false);
        btnhistoria1.setFocusable(false);
        btnhistoria1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhistoria1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnHistoria.png"))); // NOI18N
        btnhistoria1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnhistoriaBIG.png"))); // NOI18N
        btnhistoria1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnhistoria1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhistoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistoria1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnhistoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        btncomprar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncomprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncomprarNULL.png"))); // NOI18N
        btncomprar.setText("Comprar Boletos");
        btncomprar.setBorderPainted(false);
        btncomprar.setContentAreaFilled(false);
        btncomprar.setFocusPainted(false);
        btncomprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncomprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncomprar.png"))); // NOI18N
        btncomprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncomprarBIG.png"))); // NOI18N
        btncomprar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncomprar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btncomprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        User.setEnabled(false);
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, -1));

        video.setText("jLabel1");
        getContentPane().add(video, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 480, 320));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/browser_internet_network_6248.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 50, 50));

        fondoinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoinicio.png"))); // NOI18N
        fondoinicio.setMaximumSize(new java.awt.Dimension(1080, 722));
        fondoinicio.setMinimumSize(new java.awt.Dimension(1080, 722));
        fondoinicio.setPreferredSize(new java.awt.Dimension(1080, 722));
        getContentPane().add(fondoinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 880, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        

    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrutasActionPerformed
        
    }//GEN-LAST:event_btnrutasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sonido.stop();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnactividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactividadesActionPerformed
        
    }//GEN-LAST:event_btnactividadesActionPerformed

    private void btnhistoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistoria1ActionPerformed
       
    }//GEN-LAST:event_btnhistoria1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    String w="http://trenecuador.com/es/inicio/";
                    java.net.URI a = new java.net.URI(w);
                   desktop.browse(a);
                } catch (IOException ex) {
                    
                } catch (URISyntaxException ex) {
                    Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    String w="https://www.facebook.com/TrenEcuador/";
                    java.net.URI a = new java.net.URI(w);
                   desktop.browse(a);
                } catch (IOException ex) {
                    
                } catch (URISyntaxException ex) {
                    Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titilo;
    public javax.swing.JTextField User;
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnRegistro;
    public javax.swing.JButton btnactividades;
    public javax.swing.JButton btncomentario;
    public javax.swing.JButton btncomprar;
    public javax.swing.JButton btnhistoria1;
    public javax.swing.JButton btnrutas;
    private javax.swing.JLabel fondoinicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel video;
    // End of variables declaration//GEN-END:variables
}
