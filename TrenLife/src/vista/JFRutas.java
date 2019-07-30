
package vista;

public class JFRutas extends javax.swing.JFrame {


    public JFRutas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titilo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnvolcanes = new javax.swing.JButton();
        btnhieloI = new javax.swing.JButton();
        btnnariz = new javax.swing.JButton();
        btnhieloII = new javax.swing.JButton();
        btnlibertad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titilo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titilo.setForeground(new java.awt.Color(255, 255, 255));
        Titilo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titilo.setText("RUTAS");
        Titilo.setToolTipText("");
        Titilo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Titilo.setFocusable(false);
        Titilo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(Titilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 760, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregresar.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        btnvolcanes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnvolcanes.setForeground(new java.awt.Color(255, 255, 255));
        btnvolcanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrutas_volcanesNULL.png"))); // NOI18N
        btnvolcanes.setText("Tren de los Volcanes");
        btnvolcanes.setBorderPainted(false);
        btnvolcanes.setContentAreaFilled(false);
        btnvolcanes.setFocusPainted(false);
        btnvolcanes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnvolcanes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrutas_volcanes.png"))); // NOI18N
        btnvolcanes.setVerifyInputWhenFocusTarget(false);
        btnvolcanes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnvolcanes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnvolcanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolcanesActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolcanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 35, 350, -1));

        btnhieloI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhieloI.setForeground(new java.awt.Color(255, 255, 255));
        btnhieloI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnruta_hieloNULL.png"))); // NOI18N
        btnhieloI.setText("Tren del Hielo I");
        btnhieloI.setBorderPainted(false);
        btnhieloI.setContentAreaFilled(false);
        btnhieloI.setFocusPainted(false);
        btnhieloI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhieloI.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnruta_hielo.png"))); // NOI18N
        btnhieloI.setVerifyInputWhenFocusTarget(false);
        btnhieloI.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnhieloI.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhieloI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhieloIActionPerformed(evt);
            }
        });
        getContentPane().add(btnhieloI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 350, 150));

        btnnariz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnariz.setForeground(new java.awt.Color(255, 255, 255));
        btnnariz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnruta_narizdeldiabloNULL.png"))); // NOI18N
        btnnariz.setText("Nariz del Diablo");
        btnnariz.setBorderPainted(false);
        btnnariz.setContentAreaFilled(false);
        btnnariz.setFocusPainted(false);
        btnnariz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnariz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrua_narizdeldiablo.png"))); // NOI18N
        btnnariz.setVerifyInputWhenFocusTarget(false);
        btnnariz.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnnariz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnarizActionPerformed(evt);
            }
        });
        getContentPane().add(btnnariz, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 350, 150));

        btnhieloII.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhieloII.setForeground(new java.awt.Color(255, 255, 255));
        btnhieloII.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnruta_hielo2NULL.png"))); // NOI18N
        btnhieloII.setText("Tren del Hielo II");
        btnhieloII.setBorderPainted(false);
        btnhieloII.setContentAreaFilled(false);
        btnhieloII.setFocusPainted(false);
        btnhieloII.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhieloII.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnruta_hielo2.png"))); // NOI18N
        btnhieloII.setVerifyInputWhenFocusTarget(false);
        btnhieloII.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnhieloII.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhieloII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhieloIIActionPerformed(evt);
            }
        });
        getContentPane().add(btnhieloII, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 350, 150));

        btnlibertad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlibertad.setForeground(new java.awt.Color(255, 255, 255));
        btnlibertad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnruta_trenilbertadNULL.png"))); // NOI18N
        btnlibertad.setText("Tren de la Libertad ");
        btnlibertad.setBorderPainted(false);
        btnlibertad.setContentAreaFilled(false);
        btnlibertad.setFocusPainted(false);
        btnlibertad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlibertad.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnruta_trenlibertad.png"))); // NOI18N
        btnlibertad.setVerifyInputWhenFocusTarget(false);
        btnlibertad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnlibertad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlibertad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlibertadActionPerformed(evt);
            }
        });
        getContentPane().add(btnlibertad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 350, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorutas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
              this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnlibertadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlibertadActionPerformed
        JFRutaLibertad l= new JFRutaLibertad();
                l.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnlibertadActionPerformed

    private void btnvolcanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolcanesActionPerformed
        JFRutaVolcanes v= new JFRutaVolcanes();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolcanesActionPerformed

    private void btnnarizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnarizActionPerformed
        JFRutaNarizDiablo n= new JFRutaNarizDiablo();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnarizActionPerformed

    private void btnhieloIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhieloIActionPerformed
        JFRutaHieloI h= new JFRutaHieloI();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnhieloIActionPerformed

    private void btnhieloIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhieloIIActionPerformed
        JFRutaHieloII h = new  JFRutaHieloII();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnhieloIIActionPerformed

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
            java.util.logging.Logger.getLogger(JFRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titilo;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnhieloI;
    public javax.swing.JButton btnhieloII;
    public javax.swing.JButton btnlibertad;
    public javax.swing.JButton btnnariz;
    public javax.swing.JButton btnvolcanes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
