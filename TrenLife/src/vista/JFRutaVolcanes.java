
package vista;

public class JFRutaVolcanes extends javax.swing.JFrame {
  
    public JFRutaVolcanes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnatras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnregresar.png"))); // NOI18N
        btnatras.setBorderPainted(false);
        btnatras.setContentAreaFilled(false);
        btnatras.setFocusPainted(false);
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TREN DE LOS VOLCANES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 262, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(261, 261, 261)
                .addComponent(btnatras))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnatras)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("La aventura inicia en la estación Eloy Alfaro \nde Chimbacalle, de donde partimos hacia la \n“Avenida de los Volcanes”.\nPichincha, Atacazo, Pasochoa, la Viudita, \nRumiñahui acompañan al tren en su ruta.\n La vía desciende por las “Selvas de Panza\nleo” que prestaron madera para las iglesias \nde Quito, atravesando pastizales, cultivos \ny haciendas.");
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 160));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("PARADAS");
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 70, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Tarifa Estandar");
        jTextField2.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 100, -1));

        jTextField3.setEditable(false);
        jTextField3.setText("$39.00");
        jTextField3.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 50, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Quito", "El Boliche", "Machachi", "Quito" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, 100));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Salida");
        jTextField4.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Horarios");
        jTextField5.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 60, -1));

        jTextField6.setEditable(false);
        jTextField6.setText("08:00 a 17:30 - presentarse 60 min antes");
        jTextField6.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 280, -1));

        jTextField7.setEditable(false);
        jTextField7.setText("Jueves (Julio/Agosto) Viernes - Sábado - Domingo");
        jTextField7.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 280, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondovolcanes.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
       JFRutas m = new JFRutas();
       m.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnatrasActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFRutaVolcanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRutaVolcanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRutaVolcanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRutaVolcanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRutaVolcanes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatras;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
