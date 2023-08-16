/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dooha
 */
public class Reservaciones extends javax.swing.JFrame {
    EventoManagement eventoManagement = new EventoManagement();
    Facturar facturar = new Facturar();
    
    private List<Evento> eventos;
    
    public Reservaciones() {
        initComponents();
        model = (DefaultTableModel) tabla.getModel();
        eventos = eventoManagement.getEventos();
        agregarElementos();
    }
    DefaultTableModel model;
    private void agregarElementos(){
        for (Evento evento : eventos){
            Object[] fila = {
                evento.getEventoId(), evento.getEventoNombre(), evento.getCapacidad(), evento.getAsientosVendidos(), evento.getEdadMinima()
            };
            model.addRow(fila);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();
        ReservarBTN = new javax.swing.JButton();
        CantidadAsientosText = new javax.swing.JTextField();
        AsientosLABEL = new javax.swing.JLabel();
        EdadText = new javax.swing.JTextField();
        EdadLabel = new javax.swing.JLabel();
        FechaText = new javax.swing.JTextField();
        ApellidoLabel = new javax.swing.JLabel();
        ApellidoText = new javax.swing.JTextField();
        NombreText = new javax.swing.JTextField();
        NombreLabel = new javax.swing.JLabel();
        FechaLabel1 = new javax.swing.JLabel();
        MontoLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PrecioLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(102, 102, 102));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 70));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 70));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Universidad Fidélitas - SC 202");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 60));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 890, 60));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Capacidad", "Asientos Vendidos", "Edad Minima"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 510, 380));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SELECCIONAR EVENTO");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 510, 40));

        REGRESAR.setBackground(new java.awt.Color(102, 0, 102));
        REGRESAR.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        REGRESAR.setForeground(new java.awt.Color(255, 255, 255));
        REGRESAR.setText("<");
        REGRESAR.setBorder(null);
        REGRESAR.setFocusPainted(false);
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        bg.add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 30));

        ReservarBTN.setBackground(new java.awt.Color(102, 0, 102));
        ReservarBTN.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ReservarBTN.setForeground(new java.awt.Color(255, 255, 255));
        ReservarBTN.setText("RESERVAR");
        ReservarBTN.setBorder(null);
        ReservarBTN.setFocusPainted(false);
        ReservarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarBTNActionPerformed(evt);
            }
        });
        bg.add(ReservarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 190, 60));

        CantidadAsientosText.setBackground(new java.awt.Color(255, 255, 255));
        CantidadAsientosText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CantidadAsientosText.setForeground(new java.awt.Color(0, 0, 0));
        CantidadAsientosText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadAsientosTextActionPerformed(evt);
            }
        });
        bg.add(CantidadAsientosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 160, 30));

        AsientosLABEL.setBackground(new java.awt.Color(255, 255, 255));
        AsientosLABEL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        AsientosLABEL.setForeground(new java.awt.Color(255, 255, 255));
        AsientosLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AsientosLABEL.setText("CANTIDAD ASIENTOS");
        bg.add(AsientosLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 160, 30));

        EdadText.setBackground(new java.awt.Color(255, 255, 255));
        EdadText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EdadText.setForeground(new java.awt.Color(0, 0, 0));
        EdadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadTextActionPerformed(evt);
            }
        });
        bg.add(EdadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 160, 30));

        EdadLabel.setBackground(new java.awt.Color(255, 255, 255));
        EdadLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EdadLabel.setForeground(new java.awt.Color(255, 255, 255));
        EdadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EdadLabel.setText("EDAD");
        bg.add(EdadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 160, 30));

        FechaText.setBackground(new java.awt.Color(255, 255, 255));
        FechaText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        FechaText.setForeground(new java.awt.Color(0, 0, 0));
        FechaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaTextActionPerformed(evt);
            }
        });
        bg.add(FechaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 160, 30));

        ApellidoLabel.setBackground(new java.awt.Color(255, 255, 255));
        ApellidoLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ApellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ApellidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApellidoLabel.setText("APELLIDO");
        bg.add(ApellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 160, 30));

        ApellidoText.setBackground(new java.awt.Color(255, 255, 255));
        ApellidoText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ApellidoText.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTextActionPerformed(evt);
            }
        });
        bg.add(ApellidoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 160, 30));

        NombreText.setBackground(new java.awt.Color(255, 255, 255));
        NombreText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreText.setForeground(new java.awt.Color(0, 0, 0));
        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });
        bg.add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 160, 30));

        NombreLabel.setBackground(new java.awt.Color(255, 255, 255));
        NombreLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        NombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreLabel.setText("NOMBRE");
        bg.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 160, 30));

        FechaLabel1.setBackground(new java.awt.Color(255, 255, 255));
        FechaLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        FechaLabel1.setForeground(new java.awt.Color(255, 255, 255));
        FechaLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaLabel1.setText("FECHA");
        bg.add(FechaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 160, 30));

        MontoLabel.setBackground(new java.awt.Color(255, 255, 255));
        MontoLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MontoLabel.setForeground(new java.awt.Color(255, 255, 255));
        MontoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MontoLabel.setText("Total:");
        bg.add(MontoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 150, 30));

        TotalLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalLabel.setText("100$");
        bg.add(TotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 50, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio Asiento:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 150, 30));

        PrecioLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        PrecioLabel1.setForeground(new java.awt.Color(255, 255, 255));
        PrecioLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrecioLabel1.setText("100$");
        bg.add(PrecioLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void ReservarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarBTNActionPerformed
        int x = tabla.getSelectedRow();
        String NOMBRE = NombreText.getText();
        String APELLIDO = ApellidoText.getText();
        String FECHA = FechaText.getText();
        String SCantidadAsientos = CantidadAsientosText.getText();
        String SEdad = EdadText.getText();
        Evento eventoGet = eventos.get(x);
        int AsientosVendidos = eventoGet.getAsientosVendidos();
        int Edad = Integer.parseInt(SEdad);
        int EdadMinima = eventoGet.getEdadMinima();
        int CapacidadAsientos = eventoGet.getCapacidad();
        int CantidadAsientos = Integer.parseInt(SCantidadAsientos);
        int PrecioAsiento = 100;
        int AsientosDisponibles = CapacidadAsientos - AsientosVendidos;
        int MONTO = CantidadAsientos * PrecioAsiento;
        TotalLabel.setText(String.valueOf(MONTO));
        
            if(CantidadAsientos < AsientosDisponibles){
                if (Edad >= EdadMinima){
                    Facturas factura = new Facturas(NOMBRE, APELLIDO, FECHA, MONTO);
                    facturar.agregarFactura(factura);
                    JOptionPane.showMessageDialog(null, "¡Se ha reservado correctamente!");
                    AsientosVendidos += CantidadAsientos;
                    eventoGet.setAsientosVendidos(AsientosVendidos);
                    setVisible(false);
                    new Reservaciones().setVisible(true);
                }else{
                   JOptionPane.showMessageDialog(null, "ERROR: No cumple con la edad requerida");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Error: No hay asientos disponibles");
            }     


        

    
        
    }//GEN-LAST:event_ReservarBTNActionPerformed

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void ApellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTextActionPerformed

    private void FechaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaTextActionPerformed

    private void EdadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadTextActionPerformed

    private void CantidadAsientosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadAsientosTextActionPerformed

    }//GEN-LAST:event_CantidadAsientosTextActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        new MenuAdmin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_REGRESARActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JTextField ApellidoText;
    private javax.swing.JLabel AsientosLABEL;
    private javax.swing.JTextField CantidadAsientosText;
    private javax.swing.JLabel EdadLabel;
    private javax.swing.JTextField EdadText;
    private javax.swing.JLabel FechaLabel1;
    private javax.swing.JTextField FechaText;
    private javax.swing.JLabel MontoLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel PrecioLabel1;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton ReservarBTN;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
