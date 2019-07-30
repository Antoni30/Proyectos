
package vista;

public class JFAños extends javax.swing.JFrame {

    public JFAños() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/Imagenes/fondoaños.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(fotohistoria, "src/Imagenes/fotoaños.png");
        infoconstruccion.setVisible(false);
        fotohistoria.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        NOMBRE = new javax.swing.JLabel();
        fotohistoria = new javax.swing.JLabel();
        infoconstruccion = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        btnver = new javax.swing.JButton();
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
        NOMBRE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        NOMBRE.setText("PRIMEROS AÑOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
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
        getContentPane().add(fotohistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 410, 220));

        info.setColumns(20);
        info.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        info.setRows(5);
        info.setText("El ferrocarril estuvo trabajando con bene\nficios solo unos pocos años. En 1925, la \nGuayaquil & Quito Railway Company, vendió \nfinalmente su participación mayoritaria \nen el Ecuador. El mantenimiento de la pla\ntaforma era muy caro, sobre todo por la \nlluvia, los deslizamientos de tierra y las \ninundaciones, especialmente en la región \nandina, interrumpiendo el tráfico con fre\ncuencia. Los daños fueron resueltos a menu\ndo solo de forma provisional y hubo que \nhacer reformas básicas durante décadas.\n\nCon la nacionalización de la G & Q Railway, \nel Estado tomó la administración de los fe\nrrocarriles ecuatorianos,cuestión que inci\ndió en la paulatina decadencia que este me\ndio de transporte fue generando a través \ndel tiempo.\n\nAunque el viaje era arduo y los coches a \nmenudo estaban repletos, el ferrocarril fue \nmuy importante para el transporte de mercan\ncías y mano de obra. Hasta entonces, las mer\ncancías se transportaban principalmente me\ndiante burros, pero también con caballos, \nmulas y llamas. El ferrocarril se constituyó \nen el principal medio de transporte de gran\ndes distancias en el país, hasta que el par\nque automotor creció con la construcción de \ncarreteras y los recursos provenientes de los \nauges bananero y petrolero de los años 50 y \n70 del siglo XX.");
        infoconstruccion.setViewportView(info);

        getContentPane().add(infoconstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, 330));

        btnver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnverNULL.png"))); // NOI18N
        btnver.setBorderPainted(false);
        btnver.setContentAreaFilled(false);
        btnver.setFocusPainted(false);
        btnver.setFocusable(false);
        btnver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnver.png"))); // NOI18N
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        getContentPane().add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 720, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFHistoria h=new JFHistoria();
        h.setVisible(true);
        infoconstruccion.setVisible(false);
           fotohistoria.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        if(!this.btnver.isSelected()){
            infoconstruccion.setVisible(true);
            fotohistoria.setVisible(true);
        }
    }//GEN-LAST:event_btnverActionPerformed

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
            java.util.logging.Logger.getLogger(JFAños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JButton btnver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fotohistoria;
    private javax.swing.JTextArea info;
    private javax.swing.JScrollPane infoconstruccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
