/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author and03
 */
public class JfRegistrar extends javax.swing.JFrame {

    private AlmacenamientoUsuarios almacenamiento;
    
    public JfRegistrar() {
        //Patrón Singleton.
        almacenamiento = AlmacenamientoUsuarios.getInstance();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        chckEstado = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRARSE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 600, 60));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, 590, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 167, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 140, 590, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 167, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 200, 590, -1));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 167, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 260, 590, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 167, -1));

        chckEstado.setBackground(new java.awt.Color(102, 102, 102));
        chckEstado.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        chckEstado.setForeground(new java.awt.Color(255, 255, 255));
        chckEstado.setText("Activo");
        jPanel1.add(chckEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, 30));

        btnRegistrar.setBackground(new java.awt.Color(102, 0, 102));
        btnRegistrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 170, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 320, 580, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 167, -1));

        btnVolver.setBackground(new java.awt.Color(102, 0, 102));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("<");
        btnVolver.setBorder(null);
        btnVolver.setFocusPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Universidad Fidélitas - SC 202");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 600, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String usuario = txtUsername.getText();
        String password = txtPassword.getText();
        boolean estado = chckEstado.isSelected();
        String correo = txtCorreo.getText();

        Usuarios nuevoUsuario = new Usuarios(nombre, apellido, usuario, password, estado, correo, false);
        almacenamiento.agregarUsuario(nuevoUsuario);

        JOptionPane.showMessageDialog(JfRegistrar.this, "Usuario creado exitosamente.");
        Clean();
        
        JfInicio vInicio = new JfInicio();
        this.setVisible(false);
        vInicio.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        JfInicio vInicio = new JfInicio();
        this.setVisible(false);
        vInicio.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void Clean() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        chckEstado.setSelected(false);
        txtCorreo.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chckEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
