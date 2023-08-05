/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dooha
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        salirBtn = new javax.swing.JButton();
        reservar = new javax.swing.JButton();
        verFacturas = new javax.swing.JButton();
        facturarBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirBtn.setBackground(new java.awt.Color(0, 153, 153));
        salirBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(255, 255, 255));
        salirBtn.setText("SALIR");
        salirBtn.setBorder(null);
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel2.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 40));

        reservar.setBackground(new java.awt.Color(0, 153, 153));
        reservar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        reservar.setForeground(new java.awt.Color(255, 255, 255));
        reservar.setText("RESERVAR");
        reservar.setBorder(null);
        jPanel2.add(reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 120, 120));

        verFacturas.setBackground(new java.awt.Color(0, 153, 153));
        verFacturas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        verFacturas.setForeground(new java.awt.Color(255, 255, 255));
        verFacturas.setText("VER FACTURAS");
        verFacturas.setBorder(null);
        verFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFacturasActionPerformed(evt);
            }
        });
        jPanel2.add(verFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 120, 120));

        facturarBtn.setBackground(new java.awt.Color(0, 153, 153));
        facturarBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        facturarBtn.setForeground(new java.awt.Color(255, 255, 255));
        facturarBtn.setText("FACTURAR");
        facturarBtn.setBorder(null);
        facturarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(facturarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 120));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        background.setText("bac");
        jPanel2.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facturarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarBtnActionPerformed
        new facturacion().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_facturarBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:
        new JfInicio().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_salirBtnActionPerformed

    private void verFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFacturasActionPerformed
        List<Facturas> listaFacturas = new ArrayList<>();
        // Aquí deberías tener algún código para obtener la lista de facturas que deseas mostrar

        verFacturas verFacturasFrame = new verFacturas(listaFacturas);
        verFacturasFrame.setVisible(true);
    }//GEN-LAST:event_verFacturasActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton facturarBtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reservar;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton verFacturas;
    // End of variables declaration//GEN-END:variables
}
