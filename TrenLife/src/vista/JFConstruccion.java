
package vista;



public class JFConstruccion extends javax.swing.JFrame {

    public JFConstruccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/Imagenes/fondoconstruccion.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(fotohistoria, "src/Imagenes/fotoconstruccion.png");
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
        NOMBRE.setText("CONSTRUCCION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
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
        getContentPane().add(fotohistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 320, 180));

        info.setColumns(20);
        info.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        info.setRows(5);
        info.setText("La construcción del ferrocarril, también \nconocido como Ferrocarril del Sur, se \ninició en 1872, durante la segunda presi\ndencia de Gabriel García Moreno. La pri\nmera locomotora rodó el 18 de julio de \n1873 desde la estación de Yaguachi; en el\naño siguiente, el 1 de mayo, empezó a fun\ncionar el primer servicio regular, entre \nYaguachi y Milagro, ambas poblaciones de \nla provincia del Guayas. Después de años \nde pocos avances, la construcción se \naceleró cuando el general Eloy Alfaro lle\ngó a la presidencia en 1895.\n\nEste presidente se propuso retomar y llevar\na término el viejo proyecto del ferroca\nrril del puerto de Guayaquil a Quito. \nPero había una tenaz campaña de oposición \nprotagonizada tanto por conservadores como \npor liberales. Mucha gente de aquel tiempo \npensó que los Andes no se podrían conquis\ntar por medio del ferrocarril.\n\nEl 17 de junio de 1897, el gobierno firmó \nun acuerdo sobre la construcción del llamado\n\"ferrocarril más difícil del mundo\" con los \ncontratistas norteamericanos Archer Harman \ny Edward Morely. Al fin del año, se conformo \nen Nueva Jersey la Guayaquil y Quito Railway \nCompany y comenzó la construcción en el año \n1899. Amenazaban el progreso de los trabajos \nla frecuente actividad sísmica, las fuertes \nprecipitaciones que a menudo provocaban inun\ndaciones, las enfermedades o las picaduras \nde serpientes. Ante semejantes desgracias, \nlos obreros desertaban o paralizaban los \ntrabajos en demanda de mejores condiciones. \nCuatro mil trabajadores jamaicanos partici\nparon en la construcción del ferrocarril. \nPero los jamaicanos eran cruelmente afectados \npor la altura, las enfermedades y pestes. \nEl propio hermano de Archer Harman, el mayor \nJohn Harman, ingeniero jefe de la obra, y su \nayudante George Davis, murieron víctimas de \nlas enfermedades. Los carriles llegaron final\nmente a un enorme obstáculo: una pared de roca \ncasi vertical llamada \"La Nariz del Diablo\". \nMuchas vidas se perdieron en la construcción \nde lo que se considera como una obra maestra \nde ingeniería: un zig-zag cavado en la roca, \nque permite al tren, avanzando y retrocedien\ndo sucesivamente, alcanzar la altura necesaria \nhasta Alausí.\nSe dice que Harman, el ingeniero constructor \nde la línea, se detuvo maravillado ante la for\nmidable masa pétrea, ante la que pronunció las \npalabras que habían de quedar grabadas en la \nhistoria de este ferrocarril: \"En la Nariz del \nDiablo quedará inmortalizado mi nombre\". \nSin embargo, a lo largo de las obras de este \ntramo, se multiplicaron los problemas de todo \ntipo. Durante una visita del general Alfaro, el \ningeniero le expuso las tremendas dificultades \nque suponía la construcción de este tramo del \nferrocarril. Alfaro, hombre metódico y frío, le \ncontestó: \"Primero tomaremos un whisky, después, \nvenceremos al diablo\".\n​");
        infoconstruccion.setViewportView(info);

        getContentPane().add(infoconstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 300));

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
        getContentPane().add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 40));
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
            java.util.logging.Logger.getLogger(JFConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new JFConstruccion().setVisible(true);
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
