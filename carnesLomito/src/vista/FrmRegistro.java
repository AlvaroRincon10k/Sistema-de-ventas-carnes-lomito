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

public class FrmRegistro extends javax.swing.JFrame {

    public FrmRegistro() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro");
        this.setSize(new Dimension(700, 700));
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo_principal.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_password2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 484, -1));

        jButton_Registrar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Registrar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Registrar.setText("Registrar");
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 218, 36));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Inicio de sesion");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 158, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 98, -1));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyPressed(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 404, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña 2:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));

        txt_password2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 404, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 146, -1));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 404, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 146, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 404, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 146, -1));

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyPressed(evt);
            }
        });
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 404, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 400, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_usuario.getText().isEmpty()
                || txt_password.getText().isEmpty() || txt_telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else if (!txt_password.getText().equals(txt_password2.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Confirmar contraseña", 2);
        } else {
            // Validamos si el usuaro ya esta registrado.
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            if (!controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                String contraseñaEncriptada = encriptarContraseña(txt_password.getText().trim());
                // Enviamos los datos del usuario.
                usuario.setNombre(txt_nombre.getText().trim());
                usuario.setApellido(txt_apellido.getText().trim());
                usuario.setUsuario(txt_usuario.getText().trim());
                usuario.setPassword(contraseñaEncriptada);
                usuario.setTelefono(txt_telefono.getText().trim());
                usuario.setEstado(1);

                if (controlUsuario.guardar(usuario)) {
                    JOptionPane.showMessageDialog(null, "¡Usuario registrado!");
                    FrmMenu frmMenu = null; // Guardamos la referencia a FrmMenu.
                    vista.FrmLogin rf = new vista.FrmLogin(frmMenu);
                    rf.setVisible(true);
                    rf.pack();
                    rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar usuario!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario ya está registrado, ingrese otro.");
            }
        }
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

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
    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        // Con esto al dar enter cambia de campo de ingreso de datos.
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_apellido.requestFocus();
        }
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoKeyPressed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoKeyPressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        vista.FrmLogin rf = new vista.FrmLogin(null);
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password2;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
