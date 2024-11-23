package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class InterActualizarStock extends javax.swing.JInternalFrame {

    int idProducto = 0;
    int cantidad = 0;

    public InterActualizarStock() {
        initComponents();
        setTitle("Actualizar stock de los productos");
        setSize(new Dimension(500, 400));

        this.CargarComboProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad_actual = new javax.swing.JTextField();
        txt_cantidad_nueva = new javax.swing.JTextField();
        jComboBox_producto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Actualizar Stock de Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 500, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Stock Actual:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Stock Nuevo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, -1));

        txt_cantidad_actual.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad_actual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cantidad_actual.setForeground(new java.awt.Color(255, 255, 255));
        txt_cantidad_actual.setEnabled(false);
        getContentPane().add(txt_cantidad_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, -1));

        txt_cantidad_nueva.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad_nueva.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_cantidad_nueva.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_cantidad_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, -1));

        jComboBox_producto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_productoActionPerformed
        this.MostrarStock();
    }//GEN-LAST:event_jComboBox_productoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Validamos seleccion del producto.
        if (!jComboBox_producto.getSelectedItem().equals("Seleccione producto:")) {
            // Validamos campos vacios.
            if (!txt_cantidad_nueva.getText().isEmpty()) {
                // Validamos que el usuario no ingrese otros caracteres no numericos.
                boolean validacion = validar(txt_cantidad_nueva.getText().trim());
                if (validacion == true) {
                    // Validar que la cantidad sea mayor cero (0).
                    if (Integer.parseInt(txt_cantidad_nueva.getText()) > 0) {
                        Producto producto = new Producto();
                        Ctrl_Producto controlProducto = new Ctrl_Producto();
                        int stockActual = Integer.parseInt(txt_cantidad_actual.getText().trim());
                        int stockNuevo = Integer.parseInt(txt_cantidad_nueva.getText().trim());
                        stockNuevo = stockActual + stockNuevo;
                        producto.setCantidad(stockNuevo);
                        if (controlProducto.actualizarStock(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Stock actualizado");
                            jComboBox_producto.setSelectedItem("Seleccione producto:");
                            txt_cantidad_actual.setText("");
                            txt_cantidad_nueva.setText("");
                            this.CargarComboProductos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar stock");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ni negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad solo permiten números");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una nueva cantidad para sumar el stock del producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_cantidad_actual;
    private javax.swing.JTextField txt_cantidad_nueva;
    // End of variables declaration//GEN-END:variables

    // Caragar los productos en el jComboBox.
    private void CargarComboProductos() {

        Connection cn = Conexion.conectar();
        String sql = "select * from tb_producto";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("Seleccione producto:");
            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar los productos en: " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar los productos");
        }

    }

    // Mostrar stock del producto seleccionado.
    private void MostrarStock() {
        try {

            Connection cn = Conexion.conectar();
            String sql = "select * from tb_producto where nombre = '" + this.jComboBox_producto.getSelectedItem() + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("idProducto");
                cantidad = rs.getInt("cantidad");
                txt_cantidad_actual.setText(String.valueOf(cantidad));
            } else {
                txt_cantidad_actual.setText("");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener stock del producto en: " + e);
            JOptionPane.showMessageDialog(null, "Error al obtener stock del producto");
        }
    }

    // Validacion de caracteres no numericos.
    private boolean validar(String valor) {
        int num;
        try {
            num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
