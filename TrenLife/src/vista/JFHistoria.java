
package vista;



public class JFHistoria extends javax.swing.JFrame {

    public JFHistoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/Imagenes/fondohistoria.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        NOMBRE = new javax.swing.JLabel();
        btnaños = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btndecadencia = new javax.swing.JButton();
        btnrehabilitacion = new javax.swing.JButton();
        btnconstruccion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregresar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NOMBRE.setBackground(new java.awt.Color(0, 0, 0));
        NOMBRE.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        NOMBRE.setText("HISTORIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(NOMBRE)
                .addGap(272, 272, 272)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        btnaños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren4NULL.png"))); // NOI18N
        btnaños.setBorderPainted(false);
        btnaños.setContentAreaFilled(false);
        btnaños.setFocusPainted(false);
        btnaños.setFocusable(false);
        btnaños.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren4.png"))); // NOI18N
        btnaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañosActionPerformed(evt);
            }
        });
        getContentPane().add(btnaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 80, 130));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren2.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 130));

        btndecadencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren5NULL.png"))); // NOI18N
        btndecadencia.setBorderPainted(false);
        btndecadencia.setContentAreaFilled(false);
        btndecadencia.setFocusPainted(false);
        btndecadencia.setFocusable(false);
        btndecadencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren5.png"))); // NOI18N
        btndecadencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndecadenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btndecadencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 80, 130));

        btnrehabilitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren6NULL.png"))); // NOI18N
        btnrehabilitacion.setBorderPainted(false);
        btnrehabilitacion.setContentAreaFilled(false);
        btnrehabilitacion.setFocusPainted(false);
        btnrehabilitacion.setFocusable(false);
        btnrehabilitacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren6.png"))); // NOI18N
        btnrehabilitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrehabilitacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnrehabilitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 80, 130));

        btnconstruccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren3NULL.png"))); // NOI18N
        btnconstruccion.setBorderPainted(false);
        btnconstruccion.setContentAreaFilled(false);
        btnconstruccion.setFocusPainted(false);
        btnconstruccion.setFocusable(false);
        btnconstruccion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btntren3.png"))); // NOI18N
        btnconstruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconstruccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnconstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 80, 130));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 720, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnconstruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconstruccionActionPerformed
        JFConstruccion c= new JFConstruccion();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnconstruccionActionPerformed

    private void btnañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañosActionPerformed
        JFAños a= new JFAños();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnañosActionPerformed

    private void btndecadenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndecadenciaActionPerformed
        JFDecadencia d= new JFDecadencia();
                d.setVisible(true);
                this.dispose();
                
    }//GEN-LAST:event_btndecadenciaActionPerformed

    private void btnrehabilitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrehabilitacionActionPerformed
        JFReabilitacion r= new JFReabilitacion();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrehabilitacionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFHistoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JButton btnaños;
    private javax.swing.JButton btnconstruccion;
    private javax.swing.JButton btndecadencia;
    private javax.swing.JButton btnrehabilitacion;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
