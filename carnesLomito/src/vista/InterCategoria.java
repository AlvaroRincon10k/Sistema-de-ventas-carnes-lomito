package vista;

import controlador.Ctrl_Categoria;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class InterCategoria extends javax.swing.JInternalFrame {

    public InterCategoria() {
        initComponents();
        this.setSize(new Dimension(500, 300));
        this.setTitle("Nueva categoría");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 0));
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 320, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripcion categoria:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txt_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 210, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Categoria categoria = new Categoria();
        Ctrl_Categoria controlCategoria = new Ctrl_Categoria();

        // Validamos campos vacios.
        if (txt_descripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la descripción de la categoría");
        } else {
            if (!controlCategoria.existeCategoria(txt_descripcion.getText().trim())) {
                categoria.setDescripcion(txt_descripcion.getText().trim());
                categoria.setEstado(1);
                if (controlCategoria.guardar(categoria)) {
                    JOptionPane.showMessageDialog(null, "Registro de categoría guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar categoría");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La categoría ya está registrada en la base de datos");
            }
        }
        // Limpiar campos
        txt_descripcion.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed

    }//GEN-LAST:event_txt_descripcionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables
}
