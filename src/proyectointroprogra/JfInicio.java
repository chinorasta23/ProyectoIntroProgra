/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointroprogra;

/**
 *
 * @author and03
 */
public class JfInicio extends javax.swing.JFrame {

    private AlmacenamientoUsuarios almacenamiento;
    
    public JfInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        almacenamiento = AlmacenamientoUsuarios.getInstance();
        //Crear usuario administrador
        Usuarios nuevoUsuario = new Usuarios("Administrador", "Administrador", "admin", "admin", true, "Administrador@ufide.ac.cr", true);
        almacenamiento.agregarUsuario(nuevoUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        TITLE = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        FooterText = new javax.swing.JLabel();
        btnRegistrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));
        mainPanel.setForeground(new java.awt.Color(102, 102, 102));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(102, 0, 102));
        btnLogin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        mainPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 140, 40));

        btnSalir.setBackground(new java.awt.Color(102, 0, 102));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        mainPanel.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 140, 40));

        Header.setBackground(new java.awt.Color(0, 0, 0));

        TITLE.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        TITLE.setForeground(new java.awt.Color(153, 153, 153));
        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("BIENVENIDO");
        TITLE.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 70));

        Footer.setBackground(new java.awt.Color(0, 0, 0));

        FooterText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        FooterText.setForeground(new java.awt.Color(153, 153, 153));
        FooterText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FooterText.setText("Universidad Fidélitas - SC 202");
        FooterText.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FooterText, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FooterText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        mainPanel.add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 610, 60));

        btnRegistrar1.setBackground(new java.awt.Color(102, 0, 102));
        btnRegistrar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setText("REGISTRARSE");
        btnRegistrar1.setBorder(null);
        btnRegistrar1.setFocusPainted(false);
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        mainPanel.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //El boton al ser registrado abrira la ventana JFLogin y cerrara esta ventana
        JfLogin vLogin = new JfLogin();
        vLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        //El boton al ser registrado abrira la ventana JFRegistrar y cerrara esta ventana
        JfRegistrar vRegistrar = new JfRegistrar();
        vRegistrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JfInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JLabel FooterText;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TITLE;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
