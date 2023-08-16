/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

/**
 *
 * @author dooha
 */
public class Facturacion extends javax.swing.JFrame { 
    Facturar facturar = new Facturar();
    
    public Facturacion() {
        initComponents();
    }
    
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(102, 102, 102));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verFacturas.setBackground(new java.awt.Color(102, 0, 102));
        verFacturas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        verFacturas.setForeground(new java.awt.Color(255, 255, 255));
        verFacturas.setText("VER");
        verFacturas.setToolTipText("");
        verFacturas.setBorder(null);
        verFacturas.setBorderPainted(false);
        verFacturas.setFocusPainted(false);
        verFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFacturasActionPerformed(evt);
            }
        });
        bg.add(verFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 190, 40));

        regresarBtn.setBackground(new java.awt.Color(102, 0, 102));
        regresarBtn.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("<");
        regresarBtn.setBorder(null);
        regresarBtn.setFocusPainted(false);
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        bg.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 30, 30));

        crearFacturaBtn.setBackground(new java.awt.Color(102, 0, 102));
        crearFacturaBtn.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        crearFacturaBtn.setForeground(new java.awt.Color(255, 255, 255));
        crearFacturaBtn.setText("FACTURAR");
        crearFacturaBtn.setToolTipText("");
        crearFacturaBtn.setBorder(null);
        crearFacturaBtn.setBorderPainted(false);
        crearFacturaBtn.setFocusPainted(false);
        crearFacturaBtn.setHideActionText(true);
        crearFacturaBtn.setName(""); // NOI18N
        crearFacturaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFacturaBtnActionPerformed(evt);
            }
        });
        bg.add(crearFacturaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 190, 90));

        montoFactura.setBackground(new java.awt.Color(204, 204, 204));
        montoFactura.setForeground(new java.awt.Color(102, 102, 102));
        montoFactura.setText("Monto...");
        bg.add(montoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 190, 30));

        fechaFactura.setBackground(new java.awt.Color(204, 204, 204));
        fechaFactura.setForeground(new java.awt.Color(102, 102, 102));
        fechaFactura.setText("01/12/2023");
        bg.add(fechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 190, 30));

        apellidoFactura.setBackground(new java.awt.Color(204, 204, 204));
        apellidoFactura.setForeground(new java.awt.Color(102, 102, 102));
        apellidoFactura.setText("Apellido...");
        bg.add(apellidoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, 30));

        nombreFactura.setBackground(new java.awt.Color(204, 204, 204));
        nombreFactura.setForeground(new java.awt.Color(102, 102, 102));
        nombreFactura.setText("Nombre...");
        nombreFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFacturaActionPerformed(evt);
            }
        });
        bg.add(nombreFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 190, 30));

        Title.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 153, 153));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("FACTURAR");
        Title.setToolTipText("");
        bg.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 80));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 80));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Universidad Fidélitas - SC 202");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 430, 60));

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
    //Darle un valor a los atributos
    String nombre = nombreFactura.getText();
    String apellido = apellidoFactura.getText();
    String fecha = fechaFactura.getText();
    double monto = Double.parseDouble(montoFactura.getText());

    // Crear factura
    Facturas factura = new Facturas(nombre, apellido, fecha, monto);
    
    //Agrega la factura al arreglo
    facturar.agregarFactura(factura);

    nombreFactura.setText("Nombre...");
    apellidoFactura.setText("Apellido...");
    fechaFactura.setText("Fecha...");
    montoFactura.setText("Monto...");

    }//GEN-LAST:event_crearFacturaBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        // Regresar al menu
        new MenuAdmin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void verFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFacturasActionPerformed
        new FacturasViewer().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_verFacturasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField apellidoFactura;
    private javax.swing.JPanel bg;
    private javax.swing.JButton crearFacturaBtn;
    private javax.swing.JTextField fechaFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField montoFactura;
    private javax.swing.JTextField nombreFactura;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JButton verFacturas;
    // End of variables declaration//GEN-END:variables
}
