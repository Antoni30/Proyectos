
package vista;

public class JFChurute extends javax.swing.JFrame {


    public JFChurute() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/Imagenes/churutefondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto1, "src/Imagenes/churute1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto2, "src/Imagenes/churute2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto3, "src/Imagenes/churute3.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(foto4, "src/Imagenes/churute4.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnatras = new javax.swing.JButton();
        NOMBRE = new javax.swing.JLabel();
        foto3 = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto4 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        infor = new javax.swing.JScrollPane();
        info1 = new javax.swing.JTextArea();
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
        NOMBRE.setText("RESERVA ECOLOGICA MANGLARES-CHURUTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
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
        getContentPane().add(foto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 230, 140));
        getContentPane().add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 230, 140));
        getContentPane().add(foto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 230, 140));
        getContentPane().add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 140));

        info1.setColumns(20);
        info1.setRows(5);
        info1.setText("En el golfo de Guayaquil confluyen el agua dulce de \nlos ríos que descienden de la cordillera y el agua \nsalina que viene del mar; al juntarse forman la zona\ndel estuario más extenso de la costa pacífica de toda\nAmérica del Sur, donde se encuentra también la mayor \nextensión de manglares del Ecuador.\nDentro de esta región, hacia el sur, se localiza \nManglares-Churute, la primera área protegida de manglar\nde la costa continental ecuatoriana.\nAdemás de los manglares, la reserva también protege un\ngrupo de ecosistemas secos y de neblina que se encuentran \nen los cerros de la cordillera de Churute.\nLa reserva es refugio para muchas especies de fauna, \nalgunas de ellas amenazadas, como el canclón, un ave \nacuática que habita en la laguna del mismo nombre, y el \ncocodrilo de la costa, que ya ha desaparecido en otras \nzonas del litoral.\nPor la diversidad y gran extensión de ambientes acuáticos que \nprotege la reserva, en el año 1990 fue declarada como sitio \nRamsar, un reconocimiento internacional para humedales de gran \nimportancia.");
        infor.setViewportView(info1);

        getContentPane().add(infor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 320, 180));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        JFRecreativo r= new JFRecreativo();
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
            java.util.logging.Logger.getLogger(JFChurute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFChurute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFChurute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFChurute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFChurute().setVisible(true);
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
    private javax.swing.JTextArea info1;
    private javax.swing.JScrollPane infor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
