package vista;

import controlador.Ctrl_Cliente;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Cliente;

public class InterCliente extends javax.swing.JInternalFrame {

    public InterCliente() {
        initComponents();
        this.setSize(new Dimension(500, 500));
        this.setTitle("Nuevo cliente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        txt_direccion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 0, 0));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 280, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cédula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Teléfono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 100, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, -1));

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, -1));

        txt_cedula.setBackground(new java.awt.Color(255, 255, 255));
        txt_cedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(0, 0, 0));
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, -1));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(0, 0, 0));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 170, 30));

        jButton_Guardar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 30));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_direccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed

        Cliente cliente = new Cliente();
        Ctrl_Cliente controlCliente = new Ctrl_Cliente();

        if (!txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_cedula.getText().isEmpty()) {

            if (!controlCliente.existeCliente(txt_cedula.getText().trim())) {

                cliente.setNombre(txt_nombre.getText().trim());
                cliente.setApellido(txt_apellido.getText().trim());
                cliente.setCedula(txt_cedula.getText().trim());
                cliente.setTelefono(txt_telefono.getText().trim());
                cliente.setDireccion(txt_direccion.getText().trim());
                cliente.setEstado(1);

                if (controlCliente.guardar(cliente)) {
                    JOptionPane.showMessageDialog(null, "Registro de cliente guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar cliente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El cliente ya está registrado en la base de datos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los datos del cliente");
        }
        this.Limpiar();
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    // Limpiar campos.
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_cedula.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
    }
}
