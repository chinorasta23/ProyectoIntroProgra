/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dooha
 */
public class VerEventos extends javax.swing.JFrame {
    EventoManagement eventoManagement = new EventoManagement();
    private List<Evento> eventos;
    
    public VerEventos() {
        initComponents();
        model = (DefaultTableModel) tabla.getModel();
        eventos = eventoManagement.getEventos();
        llenarTabla();
    }
    
    DefaultTableModel model;

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        for (Evento evento : eventos) {
            Object[] fila = {
                evento.getEventoId(), evento.getEventoNombre(), evento.getCiudad(),
                evento.getDireccion(), evento.getCategoria(), evento.getFecha(),
                evento.getCapacidad(), evento.getAsientosVendidos(), evento.getEdadMinima()
            };
            model.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        BorrarBtn = new javax.swing.JButton();
        RegresarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EVENTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Universidad Fidélitas - SC 202");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 590, 70));

        tabla.setBackground(new java.awt.Color(153, 153, 153));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Ciudad", "Direccion", "Categoria", "Fecha", "Capacidad", "Asientos Vendidos", "Edad Minima"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 230));

        BorrarBtn.setBackground(new java.awt.Color(102, 0, 102));
        BorrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        BorrarBtn.setText("BORRAR");
        BorrarBtn.setBorder(null);
        BorrarBtn.setBorderPainted(false);
        BorrarBtn.setFocusPainted(false);
        BorrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BorrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 140, 40));

        RegresarBtn.setBackground(new java.awt.Color(102, 0, 102));
        RegresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegresarBtn.setText("REGRESAR");
        RegresarBtn.setBorder(null);
        RegresarBtn.setBorderPainted(false);
        RegresarBtn.setFocusPainted(false);
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBtnActionPerformed
        int x = tabla.getSelectedRow();
        System.out.println(x);
        
        if (x >= 0){
            Evento eventoBorrar = eventos.get(x);
            eventoManagement.borrarEvento(eventoBorrar);
            model.removeRow(x);  
        }
        
    }//GEN-LAST:event_BorrarBtnActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        new GestorEventos().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_RegresarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarBtn;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
