
package vista;

public class JFDecadencia extends javax.swing.JFrame {

    public JFDecadencia() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fotohistoria, "src/Imagenes/fondodecadencia.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/Imagenes/fotodecadencia.png");
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
        NOMBRE.setText("DECADENCIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
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
        getContentPane().add(fotohistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 310, 160));

        info.setColumns(20);
        info.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        info.setRows(5);
        info.setText("La construcción de importantes redes de \ncarreteras que se efectuaron entre los \naños 1950 a 1980, el incremento del par\nque automotor y la operación de rutas \naéreas entre las principales ciudades \ndel país, fueron relegando la importan\ncia del ferrocarril como medio de trans\nporte nacional. Durante la presidencia \nde Rodrigo Borja Cevallos se adquirieron \nlocomotoras electrodiesel, acción que \nconstituyó el último impulso para los \nferrocarriles ecuatorianos. A partir de \nese momento, la Empresa Nacional de Ferro\ncarriles Ecuatorianos fue abandonada a su \nsuerte, cuestión que se tradujo en el rápi\ndo deterioro de las vías férreas, el aban\ndono de las instalaciones ferroviarias y \ndestrucción del material rodante.\n\nA finales del siglo XX, gran parte de la \nlínea estaba en mal estado o inutilizable; \nsolamente los tramos Quito-Latacunga (que \nrecorre el Parque Nacional Cotopaxi, ubi\ncado a las faldas del volcán del mismo nom\nbre, el Cotopaxi, con 5.897 m de altura) y \nRiobamba-Alausí-Sibambe continuaban operando \ncon fines turísticos. El trayecto Ibarra - San\nLorenzo continuó funcionando hasta fines de \nla década de 1990, época en la que se culminó \nla carretera principal.\n\nLa línea de ferrocarril quedó severamente daña\nda en 1998 por las intensas precipitaciones pro\nvocadas por la corriente de El Niño, por lo que\nya no se puede recorrer por completo. A diferen\ncia de otros países, el ferrocarril no fue aban\ndonado o desmontado por completo, consevándose \nen operación pequeñas secciones que han quedado \nen las rutas turísticas.");
        infoconstruccion.setViewportView(info);

        getContentPane().add(infoconstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 300));

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
            java.util.logging.Logger.getLogger(JFDecadencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDecadencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDecadencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDecadencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFDecadencia().setVisible(true);
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
