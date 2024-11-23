package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class InterProducto extends javax.swing.JInternalFrame {

    int obtenerIdCategoriaCombo = 0;

    public InterProducto() {
        initComponents();
        this.setSize(new Dimension(500, 500));
        this.setTitle("Nuevo Producto");

        this.CargarComboCategorias();
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
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jComboBox_iva = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jButton_Guardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nuevo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 330, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("IVA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Categorias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 270, 160, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txt_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        txt_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        jComboBox_iva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione iva:", "No grava iva", "12%", "14%" }));
        getContentPane().add(jComboBox_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_categoria.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 170, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed

        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String iva = "";
        String categoria = "";
        iva = jComboBox_iva.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        // Validar campos. 
        if (txt_nombre.getText().equals("") || txt_cantidad.getText().equals("") || txt_precio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            // Consulta para ver si el producto ya existe.
            if (!controlProducto.existeProducto(txt_nombre.getText().trim())) {
                if (iva.equalsIgnoreCase("Seleccione iva:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione iva.");
                } else {
                    if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione categoria");
                    } else {
                        try {
                            producto.setNombre(txt_nombre.getText().trim());
                            producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                            String precioTXT = "";
                            double Precio = 0.0;
                            precioTXT = txt_precio.getText().trim();
                            boolean aux = false;
                            // Si el usuario ingresa , (coma) como punto decimal,lo transformamos a punto (.).
                            for (int i = 0; i < precioTXT.length(); i++) {
                                if (precioTXT.charAt(i) == ',') {
                                    String precioNuevo = precioTXT.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux = true;
                                }
                            }
                            // Evaluar la condicion.
                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(precioTXT);
                                producto.setPrecio(Precio);
                            }

                            producto.setDescripcion(txt_descripcion.getText().trim());
                            // Porcentaje IVA.
                            if (iva.equalsIgnoreCase("No grava iva")) {
                                producto.setPorcentajeIva(0);
                            } else if (iva.equalsIgnoreCase("12%")) {
                                producto.setPorcentajeIva(12);
                            } else if (iva.equalsIgnoreCase("14%")) {
                                producto.setPorcentajeIva(14);
                            }

                            // Obtner el id de categoria.
                            this.IdCategoria();
                            producto.setIdCategoria(obtenerIdCategoriaCombo);
                            producto.setEstado(1);

                            if (controlProducto.guardar(producto)) {
                                JOptionPane.showMessageDialog(null, "Producto guardado");

                                this.CargarComboCategorias();
                                this.jComboBox_iva.setSelectedItem("Seleccione iva:");
                                this.Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al guardar");
                            }

                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " + e);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la base de datos");
            }
        }
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    // Limpiar campos.
    private void Limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");

    }

    // Cargar las categorias.
    private void CargarComboCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
            JOptionPane.showMessageDialog(null, "Error al cargar categorias");
        }
    }

    // Obtener id categoria.
    private int IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id categoria");
            JOptionPane.showMessageDialog(null, "Error al obener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }
}
