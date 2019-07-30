
package vista;

public class JFRutaNarizDiablo extends javax.swing.JFrame {
  
    public JFRutaNarizDiablo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnatras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
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
        jLabel2.setText("NARIZ DEL DIABLO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 307, Short.MAX_VALUE)
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

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("PARADAS");
        jTextField8.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 80, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("El obstáculo más grande al que se\nenfrentó la obra del ferrocarril \ntransandino fue la Nariz del Dia\nblo, una montaña con paredes casi\nperpendiculares. Para salvar este\nobstáculo se construyó una vía en\nzig-zag que supera un desnivel de\n500 metros en apenas 12,5 km de \nvertiginosa subida o bajada, y \nque sigue siendo hoy en día una \nimpresionante obra de ingeniería.\nAdemás, descubriremos la hoya del\nrío Chanchán y las tradiciones y \ncosmovisión de los Puruhuas en \nSibambe");
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea2.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 250));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Aluasi", "Simbambe", "Aluasi" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 80, 90));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Salida");
        jTextField9.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 60, -1));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Horarios");
        jTextField10.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 60, -1));

        jTextField11.setEditable(false);
        jTextField11.setText("Frecuencia 1 08:00 a 10:30 | Frecuencia 2 11:00 a 13:30 ");
        jTextField11.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 320, -1));

        jTextField12.setEditable(false);
        jTextField12.setText("Martes a Domingo y Feriados");
        jTextField12.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 320, 30));

        jTextField13.setEditable(false);
        jTextField13.setText("$33.00");
        jTextField13.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 50, -1));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Tarifa Estandar");
        jTextField14.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 100, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondonarizdeldiablo.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
       JFRutas m = new JFRutas();
       m.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnatrasActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

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
            java.util.logging.Logger.getLogger(JFRutaNarizDiablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRutaNarizDiablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRutaNarizDiablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRutaNarizDiablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRutaNarizDiablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatras;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
