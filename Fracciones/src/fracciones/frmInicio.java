package fracciones;

import java.awt.Color;
import javax.swing.JOptionPane;

public class frmInicio extends javax.swing.JFrame {

    public frmInicio() {
        initComponents();
        this.getContentPane().setBackground(Color.darkGray);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnConvertir = new javax.swing.JButton();
        rbMiIm = new javax.swing.JRadioButton();
        rbImMi = new javax.swing.JRadioButton();
        txtNumerador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDenominador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEntero = new javax.swing.JTextArea();
        txtNumerador2 = new javax.swing.JTextField();
        txtDenominador2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        jScrollPane1.setPreferredSize(new java.awt.Dimension(36, 36));

        jTextArea1.setColumns(5);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONVERSION");
        setResizable(false);

        rbMiIm.setForeground(new java.awt.Color(255, 255, 255));
        rbMiIm.setText("Mixta -----> Imp.");
        rbMiIm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMiImActionPerformed(evt);
            }
        });

        rbImMi.setForeground(new java.awt.Color(255, 255, 255));
        rbImMi.setText("Imp. -----> Mixta");
        rbImMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbImMiActionPerformed(evt);
            }
        });

        jLabel1.setText("------");

        jLabel2.setText("------");

        txtEntero.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        txtEntero.setTabSize(2);
        jScrollPane2.setViewportView(txtEntero);

        txtNumerador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerador2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Conversion");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rbMiIm)
                                        .addGap(55, 55, 55))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNumerador)
                                            .addComponent(txtDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(87, 87, 87)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbImMi)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNumerador2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDenominador2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnLimpiar)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMiIm)
                    .addComponent(rbImMi))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumerador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDenominador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMiImActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMiImActionPerformed
        try {
            int numerador1 = Integer.parseInt(txtNumerador.getText());
            int denominador1 = Integer.parseInt(txtDenominador.getText());
            txtNumerador2.setText(String.valueOf(numerador1 / denominador1));
            txtDenominador2.setText(String.valueOf(denominador1));
            txtEntero.setText(String.valueOf(numerador1 / denominador1));
            rbImMi.setEnabled(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERROR, ingrese un numero");
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_rbMiImActionPerformed

    private void rbImMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbImMiActionPerformed
        try {
            int nm2 = Integer.parseInt(txtNumerador2.getText());
            int dm2 = Integer.parseInt(txtDenominador2.getText());
            int e = Integer.parseInt(txtEntero.getText());
            txtNumerador.setText(String.valueOf((e * dm2) + nm2));
            txtDenominador.setText(String.valueOf(dm2));
            rbMiIm.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR, ingrese un numero");
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_rbImMiActionPerformed


    private void txtNumerador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerador2ActionPerformed

    }//GEN-LAST:event_txtNumerador2ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed


    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNumerador.setText("");
        txtDenominador.setText("");
        txtEntero.setText("");
        txtDenominador2.setText("");
        txtNumerador2.setText("");
        rbImMi.setEnabled(true);
        rbMiIm.setEnabled(true);
        rbImMi.setSelected(false);
        rbMiIm.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rbImMi;
    private javax.swing.JRadioButton rbMiIm;
    private javax.swing.JTextField txtDenominador;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextArea txtEntero;
    private javax.swing.JTextField txtNumerador;
    private javax.swing.JTextField txtNumerador2;
    // End of variables declaration//GEN-END:variables
}
