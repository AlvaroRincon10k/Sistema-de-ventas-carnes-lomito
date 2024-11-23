package vista;

import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class FrmLogin extends javax.swing.JFrame {

    FrmMenu frmMenu; // Referencia de FrmMenu.

    public FrmLogin(FrmMenu menu) {
        this.frmMenu = menu;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setSize(new Dimension(500, 560));
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo_principal.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_IniciarSesion = new javax.swing.JButton();
        jLabel_Create_Account = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARNES LOMITO");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("®Productos Carnicos de Alta Calidad");

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user 1.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bloqueado (1).png"))); // NOI18N

        jButton_IniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        jButton_IniciarSesion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_IniciarSesion.setText("Iniciar Sesión");
        jButton_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IniciarSesionActionPerformed(evt);
            }
        });

        jLabel_Create_Account.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Create_Account.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel_Create_Account.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Create_Account.setText("Crear una cuenta");
        jLabel_Create_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar sesion 1.5.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                    .addComponent(txt_password)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel_Create_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jButton_IniciarSesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(27, 27, 27)
                .addComponent(jButton_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel_Create_Account)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IniciarSesionActionPerformed
        this.Login();
    }//GEN-LAST:event_jButton_IniciarSesionActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // Con esto al dar enter inicia sesion.
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.Login();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        // Con esto al dar enter cambia de campo de ingreso de datos.
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_password.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void jLabel_Create_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseClicked

        vista.FrmRegistro rf = new vista.FrmRegistro();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_Create_AccountMouseClicked

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmMenu menu = new FrmMenu(); // Instancia de FrmMenu.
                new FrmLogin(menu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_IniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Create_Account;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    // Iniciar Sesion.
    private void Login() {
        if (!txt_usuario.getText().isEmpty() && !txt_password.getText().isEmpty()) {
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            Usuario usuario = new Usuario();
            String contraseñaEncriptada = encriptarContraseña(txt_password.getText().trim());
            usuario.setUsuario(txt_usuario.getText().trim());
            usuario.setPassword(contraseñaEncriptada);
            if (controlUsuario.loginUser(usuario)) {
                FrmMenu menu = new FrmMenu();
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese su usuario o contraseña");
        }
    }

    private String encriptarContraseña(String password) {
        // Encriptar la clave con las librerias de java.
        String sha1 = "";

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(password.getBytes("utf8"));
            sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sha1;
    }
}
