/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author dooha
 */
public class facturacion extends javax.swing.JFrame { 

    public facturacion() {
        initComponents();
    }
    
   private List<Facturas> listaFacturas = new ArrayList<>();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        verFacturas = new javax.swing.JButton();
        regresarBtn = new javax.swing.JButton();
        crearFacturaBtn = new javax.swing.JButton();
        montoFactura = new javax.swing.JTextField();
        fechaFactura = new javax.swing.JTextField();
        apellidoFactura = new javax.swing.JTextField();
        nombreFactura = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verFacturas.setBackground(new java.awt.Color(0, 153, 153));
        verFacturas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        verFacturas.setForeground(new java.awt.Color(255, 255, 255));
        verFacturas.setText("VER");
        verFacturas.setToolTipText("");
        verFacturas.setBorder(null);
        verFacturas.setBorderPainted(false);
        verFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFacturasActionPerformed(evt);
            }
        });
        bg.add(verFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 190, 40));

        regresarBtn.setBackground(new java.awt.Color(0, 153, 153));
        regresarBtn.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("<");
        regresarBtn.setBorder(null);
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        bg.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 40));

        crearFacturaBtn.setBackground(new java.awt.Color(0, 153, 153));
        crearFacturaBtn.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        crearFacturaBtn.setForeground(new java.awt.Color(255, 255, 255));
        crearFacturaBtn.setText("FACTURAR");
        crearFacturaBtn.setToolTipText("");
        crearFacturaBtn.setBorder(null);
        crearFacturaBtn.setBorderPainted(false);
        crearFacturaBtn.setHideActionText(true);
        crearFacturaBtn.setName(""); // NOI18N
        crearFacturaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFacturaBtnActionPerformed(evt);
            }
        });
        bg.add(crearFacturaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 190, 90));

        montoFactura.setBackground(new java.awt.Color(204, 204, 204));
        montoFactura.setForeground(new java.awt.Color(102, 102, 102));
        montoFactura.setText("Monto...");
        bg.add(montoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 190, 30));

        fechaFactura.setBackground(new java.awt.Color(204, 204, 204));
        fechaFactura.setForeground(new java.awt.Color(102, 102, 102));
        fechaFactura.setText("01/12/2023");
        bg.add(fechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 190, 30));

        apellidoFactura.setBackground(new java.awt.Color(204, 204, 204));
        apellidoFactura.setForeground(new java.awt.Color(102, 102, 102));
        apellidoFactura.setText("Apellido...");
        bg.add(apellidoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 190, 30));

        nombreFactura.setBackground(new java.awt.Color(204, 204, 204));
        nombreFactura.setForeground(new java.awt.Color(102, 102, 102));
        nombreFactura.setText("Nombre...");
        nombreFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFacturaActionPerformed(evt);
            }
        });
        bg.add(nombreFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 30));

        Title.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 153, 153));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("FACTURAR");
        Title.setToolTipText("");
        bg.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 430, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFacturaActionPerformed

 
    private void crearFacturaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFacturaBtnActionPerformed
    // Obtener los valores de los campos de texto
    String nombre = nombreFactura.getText();
    String apellido = apellidoFactura.getText();
    String fecha = fechaFactura.getText();
    double monto = Double.parseDouble(montoFactura.getText());

    // Crear una nueva instancia de Facturas
    Facturas factura = new Facturas(nombre, apellido, fecha, monto);

    listaFacturas.add(factura);

    nombreFactura.setText("Nombre...");
    apellidoFactura.setText("Apellido...");
    fechaFactura.setText("Fecha...");
    montoFactura.setText("Monto...");

    }//GEN-LAST:event_crearFacturaBtnActionPerformed

    //Getter para la lista
    public List<Facturas> getListaFacturas() {
        return listaFacturas;
    }
        
    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        // TODO add your handling code here:
        new main().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void verFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFacturasActionPerformed
        new facturasViewer(listaFacturas).setVisible(true);
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
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturacion().setVisible(true);
            }
        });
    }
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField apellidoFactura;
    private javax.swing.JPanel bg;
    private javax.swing.JButton crearFacturaBtn;
    private javax.swing.JTextField fechaFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField montoFactura;
    private javax.swing.JTextField nombreFactura;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JButton verFacturas;
    // End of variables declaration//GEN-END:variables
}
