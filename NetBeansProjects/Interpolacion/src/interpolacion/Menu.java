
package interpolacion;


public class Menu extends javax.swing.JFrame {
    private String[] args;

    
    public Menu() {
        args = null;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        btnNewton = new javax.swing.JButton();
        btnLagrange = new javax.swing.JButton();
        btnSegmentaria = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblIntegrantes = new javax.swing.JLabel();
        lblTomas = new javax.swing.JLabel();
        lblJonathan = new javax.swing.JLabel();
        lblManuel = new javax.swing.JLabel();
        lblRoiner = new javax.swing.JLabel();
        lblStalin = new javax.swing.JLabel();
        lblCIRoiner = new javax.swing.JLabel();
        lblCIManuel = new javax.swing.JLabel();
        lblCIStalin = new javax.swing.JLabel();
        lblCIJonathan = new javax.swing.JLabel();
        lblCITomas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(51, 102, 255));

        lbltitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbltitulo.setText("Métodos de Interpolación");

        btnNewton.setText("Polinomios interpolantes de Newton");
        btnNewton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewtonMouseClicked(evt);
            }
        });

        btnLagrange.setText("Polinomios interpolantes de Lagrange");
        btnLagrange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLagrangeMouseClicked(evt);
            }
        });

        btnSegmentaria.setText("Interpolación segmentaria");
        btnSegmentaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSegmentariaMouseClicked(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        lblIntegrantes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIntegrantes.setText("Integrantes:");

        lblTomas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTomas.setText("Carrasco Tomás");

        lblJonathan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblJonathan.setText("Cuotto Jonathan");

        lblManuel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblManuel.setText("Hernandez Manuel");

        lblRoiner.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRoiner.setText("Hernandez Roiner");

        lblStalin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblStalin.setText("Sanchez Stalin ");

        lblCIRoiner.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCIRoiner.setText("21.250.667");

        lblCIManuel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCIManuel.setText("24.847.109");

        lblCIStalin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCIStalin.setText("24.183.684");

        lblCIJonathan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCIJonathan.setText("21.249.788");

        lblCITomas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCITomas.setText("23.506.608");

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltitulo))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoLayout.createSequentialGroup()
                                .addComponent(lblManuel)
                                .addGap(65, 65, 65))
                            .addGroup(jpFondoLayout.createSequentialGroup()
                                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIntegrantes)
                                    .addComponent(lblCIManuel))
                                .addGap(93, 93, 93)))
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTomas)
                            .addComponent(lblRoiner)
                            .addComponent(lblCITomas)
                            .addComponent(lblCIRoiner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJonathan)
                            .addComponent(lblStalin)
                            .addComponent(lblCIJonathan)
                            .addComponent(lblCIStalin)))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLagrange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSegmentaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewton)
                .addGap(25, 25, 25)
                .addComponent(btnLagrange)
                .addGap(25, 25, 25)
                .addComponent(btnSegmentaria)
                .addGap(25, 25, 25)
                .addComponent(btnSalir)
                .addGap(27, 27, 27)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIntegrantes)
                    .addComponent(lblTomas)
                    .addComponent(lblJonathan))
                .addGap(4, 4, 4)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCITomas)
                    .addComponent(lblCIJonathan))
                .addGap(18, 18, 18)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManuel)
                    .addComponent(lblRoiner)
                    .addComponent(lblStalin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCIRoiner)
                    .addComponent(lblCIStalin)
                    .addComponent(lblCIManuel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnNewtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewtonMouseClicked
        Newton.main(args);
        this.dispose();
    }//GEN-LAST:event_btnNewtonMouseClicked

    private void btnLagrangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLagrangeMouseClicked
        Lagrange.main(args);
        this.dispose();
    }//GEN-LAST:event_btnLagrangeMouseClicked

    private void btnSegmentariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSegmentariaMouseClicked
        Segmentaria.main(args);
        this.dispose();
    }//GEN-LAST:event_btnSegmentariaMouseClicked

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLagrange;
    private javax.swing.JButton btnNewton;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSegmentaria;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblCIJonathan;
    private javax.swing.JLabel lblCIManuel;
    private javax.swing.JLabel lblCIRoiner;
    private javax.swing.JLabel lblCIStalin;
    private javax.swing.JLabel lblCITomas;
    private javax.swing.JLabel lblIntegrantes;
    private javax.swing.JLabel lblJonathan;
    private javax.swing.JLabel lblManuel;
    private javax.swing.JLabel lblRoiner;
    private javax.swing.JLabel lblStalin;
    private javax.swing.JLabel lblTomas;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
