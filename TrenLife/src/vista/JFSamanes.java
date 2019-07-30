
package vista;

public class JFSamanes extends javax.swing.JFrame {

    public JFSamanes() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/Imagenes/samanes1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto1, "src/Imagenes/samanesfondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto2, "src/Imagenes/samanes2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto3, "src/Imagenes/samanes3.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto4, "src/Imagenes/samanes4.png");
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnatras = new javax.swing.JButton();
        NOMBRE = new javax.swing.JLabel();
        infogastronomia = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        foto3 = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto4 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregresar.png"))); // NOI18N
        btnatras.setBorderPainted(false);
        btnatras.setContentAreaFilled(false);
        btnatras.setFocusPainted(false);
        btnatras.setFocusable(false);
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        NOMBRE.setBackground(new java.awt.Color(0, 0, 0));
        NOMBRE.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        NOMBRE.setText("AREA NACIONAL DE RECREACION LOS SAMANES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(btnatras))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnatras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        info.setColumns(20);
        info.setRows(5);
        info.setText("Esta área protegida se encuentra ubicada en la zona \nnorte de Guayaquil y dentro de su perímetro urbano. \nEl objetivo de su creación es recuperar la vegetación \nnativa y la vida silvestre que existía en esta zona, \ny brindar un espacio de recreación familiar. Un aspecto\nque caracteriza a esta área es que posee 2,4 kilómetros\nde ribera frente en los márgenes del río Daule, lo que \ntambién será aprovechado con fines recreativos y turís\nticos.\nEn el interior de esta área todavía existen algunos rema\nnentes de bosque seco del litoral y de la llanura inun\ndable característica de la cuenca del río Guayas. Desde \nsu creación como área protegida, se han desarrollo varias\nfacilidades para promover prácticas deportivas y el espar\ncimiento de la población.");
        infogastronomia.setViewportView(info);

        getContentPane().add(infogastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 320, 180));
        getContentPane().add(foto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 230, 140));
        getContentPane().add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 230, 140));
        getContentPane().add(foto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 230, 140));
        getContentPane().add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 140));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        JFRecreativo r=new JFRecreativo();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatrasActionPerformed

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
            java.util.logging.Logger.getLogger(JFSamanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSamanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSamanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSamanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSamanes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JButton btnatras;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JTextArea info;
    private javax.swing.JScrollPane infogastronomia;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
