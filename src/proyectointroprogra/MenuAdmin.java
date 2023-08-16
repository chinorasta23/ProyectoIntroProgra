/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

/**
 *
 * @author dooha
 */
public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        EventosBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        facturarBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EventosBtn.setBackground(new java.awt.Color(102, 0, 102));
        EventosBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        EventosBtn.setForeground(new java.awt.Color(255, 255, 255));
        EventosBtn.setText("EVENTOS");
        EventosBtn.setBorder(null);
        EventosBtn.setFocusPainted(false);
        EventosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosBtnActionPerformed(evt);
            }
        });
        jPanel2.add(EventosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 470, 60));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RESERVAR");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 470, 60));

        salirBtn.setBackground(new java.awt.Color(102, 0, 102));
        salirBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(255, 255, 255));
        salirBtn.setText("<");
        salirBtn.setBorder(null);
        salirBtn.setFocusPainted(false);
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel2.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 30, 30));

        facturarBtn.setBackground(new java.awt.Color(102, 0, 102));
        facturarBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        facturarBtn.setForeground(new java.awt.Color(255, 255, 255));
        facturarBtn.setText("FACTURACIÓN");
        facturarBtn.setBorder(null);
        facturarBtn.setBorderPainted(false);
        facturarBtn.setFocusPainted(false);
        facturarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(facturarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 470, 60));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Universidad Fidélitas - SC 202");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 550, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facturarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_facturarBtnActionPerformed
        new Facturacion().setVisible(true);
        this.setVisible(false);

    }// GEN-LAST:event_facturarBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:
        new JfInicio().setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_salirBtnActionPerformed

    private void EventosBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EventosBtnActionPerformed
        new GestorEventos().setVisible(true);
        setVisible(false);

    }// GEN-LAST:event_EventosBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        new Reservaciones().setVisible(true);
        setVisible(false);
    }// GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EventosBtn;
    private javax.swing.JButton facturarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
