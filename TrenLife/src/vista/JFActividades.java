
package vista;

public class JFActividades extends javax.swing.JFrame {

    public JFActividades() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondoactividades, "src/Imagenes/fondoactividades.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        Titilo = new javax.swing.JLabel();
        btngastronomia = new javax.swing.JButton();
        btnrecreatva = new javax.swing.JButton();
        btncultural = new javax.swing.JButton();
        fondoactividades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregresar.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setFocusable(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        Titilo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titilo.setForeground(new java.awt.Color(255, 255, 255));
        Titilo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titilo.setText("ACTIVIDADES");
        Titilo.setToolTipText("");
        Titilo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Titilo.setFocusable(false);
        Titilo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(Titilo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(btnRegresar))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titilo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        btngastronomia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btngastronomia.setForeground(new java.awt.Color(255, 255, 255));
        btngastronomia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btngastronomiaNULL.png"))); // NOI18N
        btngastronomia.setText("Gastronomia");
        btngastronomia.setBorderPainted(false);
        btngastronomia.setContentAreaFilled(false);
        btngastronomia.setFocusPainted(false);
        btngastronomia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btngastronomia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btngastronomia.png"))); // NOI18N
        btngastronomia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btngastronomia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btngastronomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngastronomiaActionPerformed(evt);
            }
        });
        getContentPane().add(btngastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, 130));

        btnrecreatva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrecreatva.setForeground(new java.awt.Color(255, 255, 255));
        btnrecreatva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrecreativaNULL.png"))); // NOI18N
        btnrecreatva.setText("Recreacion");
        btnrecreatva.setBorderPainted(false);
        btnrecreatva.setContentAreaFilled(false);
        btnrecreatva.setFocusPainted(false);
        btnrecreatva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrecreatva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnrecreativa.png"))); // NOI18N
        btnrecreatva.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnrecreatva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnrecreatva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecreatvaActionPerformed(evt);
            }
        });
        getContentPane().add(btnrecreatva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, 120));

        btncultural.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncultural.setForeground(new java.awt.Color(255, 255, 255));
        btncultural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnculturalNULL.png"))); // NOI18N
        btncultural.setText("Culturales");
        btncultural.setBorderPainted(false);
        btncultural.setContentAreaFilled(false);
        btncultural.setFocusPainted(false);
        btncultural.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncultural.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncultural.png"))); // NOI18N
        btncultural.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncultural.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnculturalActionPerformed(evt);
            }
        });
        getContentPane().add(btncultural, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 120));
        getContentPane().add(fondoactividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 750, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngastronomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngastronomiaActionPerformed
        JFGastronomica i= new JFGastronomica();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btngastronomiaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnrecreatvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecreatvaActionPerformed
        JFRecreativo i= new JFRecreativo();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrecreatvaActionPerformed

    private void btnculturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnculturalActionPerformed
        JFCultural c= new JFCultural();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnculturalActionPerformed

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
            java.util.logging.Logger.getLogger(JFActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titilo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btncultural;
    private javax.swing.JButton btngastronomia;
    private javax.swing.JButton btnrecreatva;
    private javax.swing.JLabel fondoactividades;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
