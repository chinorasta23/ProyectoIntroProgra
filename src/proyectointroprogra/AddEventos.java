/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author dooha
 */
public class AddEventos extends javax.swing.JFrame {
    EventoManagement eventoManagement = new EventoManagement();
    
    public AddEventos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CATEGORIATEXT = new javax.swing.JTextField();
        EDADMINIMATEXT = new javax.swing.JTextField();
        CIUDADTEXT = new javax.swing.JTextField();
        NOMBRETEXT = new javax.swing.JTextField();
        DIRECCIONTEXT = new javax.swing.JTextField();
        IDTEXT = new javax.swing.JTextField();
        FECHATEXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AgregarEvento = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Eventos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Universidad Fidélitas - SC 202");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 650, 70));

        CATEGORIATEXT.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(CATEGORIATEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 230, 30));

        EDADMINIMATEXT.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(EDADMINIMATEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 230, 30));

        CIUDADTEXT.setBackground(new java.awt.Color(204, 204, 204));
        CIUDADTEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIUDADTEXTActionPerformed(evt);
            }
        });
        jPanel1.add(CIUDADTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 230, 30));

        NOMBRETEXT.setBackground(new java.awt.Color(204, 204, 204));
        NOMBRETEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRETEXTActionPerformed(evt);
            }
        });
        jPanel1.add(NOMBRETEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, 30));

        DIRECCIONTEXT.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(DIRECCIONTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 230, 30));

        IDTEXT.setBackground(new java.awt.Color(204, 204, 204));
        IDTEXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(IDTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 30));

        FECHATEXT.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(FECHATEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 230, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDAD MINIMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 230, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CIUDAD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 230, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DIRECCIÓN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CATEGORIA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 230, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, -1));

        AgregarEvento.setBackground(new java.awt.Color(102, 0, 102));
        AgregarEvento.setForeground(new java.awt.Color(255, 255, 255));
        AgregarEvento.setText("AGREGAR");
        AgregarEvento.setBorder(null);
        AgregarEvento.setBorderPainted(false);
        AgregarEvento.setFocusPainted(false);
        AgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 230, 40));

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CIUDADTEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIUDADTEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIUDADTEXTActionPerformed

    private void NOMBRETEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRETEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBRETEXTActionPerformed

    private void AgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEventoActionPerformed

        String ID = IDTEXT.getText();
        int IDN = Integer.parseInt(ID);
        String Nombre = NOMBRETEXT.getText();
        String Ciudad = CIUDADTEXT.getText();
        String Direccion = DIRECCIONTEXT.getText();
        String Categoria = CATEGORIATEXT.getText();
        String Fecha = FECHATEXT.getText();
        String EdadMinima = EDADMINIMATEXT.getText();
        int EdadMinimaN = Integer.parseInt(EdadMinima);
        
        Evento evento = new Evento(IDN, Nombre, Ciudad, Direccion, Categoria, Fecha, 35, 0, EdadMinimaN);
        eventoManagement.agregarEvento(evento);
        
        JOptionPane.showMessageDialog(null,"Se agregó el evento correctamente...");
        
        IDTEXT.setText("");
        NOMBRETEXT.setText("");
        CIUDADTEXT.setText("");
        DIRECCIONTEXT.setText("");
        CATEGORIATEXT.setText("");
        FECHATEXT.setText("");
        EDADMINIMATEXT.setText("");
    }//GEN-LAST:event_AgregarEventoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new GestorEventos().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarEvento;
    private javax.swing.JTextField CATEGORIATEXT;
    private javax.swing.JTextField CIUDADTEXT;
    private javax.swing.JTextField DIRECCIONTEXT;
    private javax.swing.JTextField EDADMINIMATEXT;
    private javax.swing.JTextField FECHATEXT;
    private javax.swing.JTextField IDTEXT;
    private javax.swing.JTextField NOMBRETEXT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
