
package vista;

public class JFGastronomica extends javax.swing.JFrame {

public JFGastronomica() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/Imagenes/fondogastronomia.png");
        info.setVisible(false);
        infogastronomia.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnatras = new javax.swing.JButton();
        Titilo = new javax.swing.JLabel();
        btnsierra = new javax.swing.JButton();
        btncosta = new javax.swing.JButton();
        infogastronomia = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        fotogastronomia = new javax.swing.JLabel();
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

        Titilo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titilo.setForeground(new java.awt.Color(255, 255, 255));
        Titilo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titilo.setText("GASTRONOMIA");
        Titilo.setToolTipText("");
        Titilo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Titilo.setFocusable(false);
        Titilo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 201, Short.MAX_VALUE)
                .addComponent(Titilo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(btnatras))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnatras)
                    .addComponent(Titilo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        btnsierra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsierra.setForeground(new java.awt.Color(255, 255, 255));
        btnsierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnsierraNULL.png"))); // NOI18N
        btnsierra.setText("SIERRA");
        btnsierra.setBorderPainted(false);
        btnsierra.setContentAreaFilled(false);
        btnsierra.setFocusPainted(false);
        btnsierra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsierra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnsierra.png"))); // NOI18N
        btnsierra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsierra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsierraActionPerformed(evt);
            }
        });
        getContentPane().add(btnsierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 100));

        btncosta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncosta.setForeground(new java.awt.Color(255, 255, 255));
        btncosta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncostaNULL.png"))); // NOI18N
        btncosta.setText("COSTA");
        btncosta.setBorderPainted(false);
        btncosta.setContentAreaFilled(false);
        btncosta.setFocusPainted(false);
        btncosta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncosta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncosta.png"))); // NOI18N
        btncosta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncosta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncostaActionPerformed(evt);
            }
        });
        getContentPane().add(btncosta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 100));

        info.setColumns(20);
        info.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        info.setRows(5);
        info.setText("La gastronomía tradicional andina ofrece una mezcla de \ndiferentes productos nativos como papas, maíz, frijoles, \narroz y vegetales que acompañan variedad de carnes o \npescado de río. Deliciosas y nutritivas sopas son también \nmuy populares en la región así como, los refrescantes \njugos de frutas, servidos con cada comida");
        info.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        info.setEnabled(false);
        infogastronomia.setViewportView(info);

        getContentPane().add(infogastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 340, 120));
        getContentPane().add(fotogastronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 340, 170));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 720, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        JFActividades a= new JFActividades();
        a.setVisible(true);
        info.setVisible(false);
        infogastronomia.setVisible(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, null);
        this.dispose();
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btncostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncostaActionPerformed
        if(!this.btncosta.isSelected()){
            info.setText("La gastronomía de la costa ecuatoriana se caracteriza \npor la combinación de mariscos y pescados con coco, \nbanana, banana verde, que otorgan un sabor muy \noriginal, diferente  de la cocina de otras regiones del \nEcuador.");
            info.setVisible(true);
        infogastronomia.setVisible(true);
        rsscalelabel.RSScaleLabel.setScaleLabel(fotogastronomia, "src/Imagenes/fotocosta.png");   
        }
    }//GEN-LAST:event_btncostaActionPerformed

    private void btnsierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsierraActionPerformed
        if(!this.btnsierra.isSelected()){
        info.setText("La gastronomía tradicional andina ofrece una mezcla de \ndiferentes productos nativos como papas, maíz, frijoles, \narroz y vegetales que acompañan variedad de carnes o \npescado de río. Deliciosas y nutritivas sopas son también \nmuy populares en la región así como, los refrescantes \njugos de frutas, servidos con cada comida");
        info.setVisible(true);
        infogastronomia.setVisible(true);
         rsscalelabel.RSScaleLabel.setScaleLabel(fotogastronomia, "src/Imagenes/fotosierra.png");   
        }
    }//GEN-LAST:event_btnsierraActionPerformed

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
            java.util.logging.Logger.getLogger(JFGastronomica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGastronomica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGastronomica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGastronomica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGastronomica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titilo;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btncosta;
    private javax.swing.JButton btnsierra;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fotogastronomia;
    private javax.swing.JTextArea info;
    private javax.swing.JScrollPane infogastronomia;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
