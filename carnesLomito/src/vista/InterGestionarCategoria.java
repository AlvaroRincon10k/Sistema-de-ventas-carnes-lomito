package vista;

import conexion.Conexion;
import controlador.Ctrl_Categoria;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class InterGestionarCategoria extends javax.swing.JInternalFrame {

    private int idCategoria;

    public InterGestionarCategoria() {
        initComponents();
        this.setSize(new Dimension(700, 400));
        this.setTitle("Gestionar categorias");
        // Cargar tabla.
        this.CargarTablaCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_categorias = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jButton_eliminar = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 0, 0));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Categorias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_categorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 220));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripcion:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txt_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 210, 110));

        jButton_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 130, -1));

        jButton_actualizar.setBackground(new java.awt.Color(0, 153, 51));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        if (!txt_descripcion.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlCategoria = new Ctrl_Categoria();

            categoria.setDescripcion(txt_descripcion.getText().trim());
            if (controlCategoria.actualizar(categoria, idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoría actualizada");
                txt_descripcion.setText("");
                this.CargarTablaCategorias();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar categoría");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoría");
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        if (!txt_descripcion.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlCategoria = new Ctrl_Categoria();

            categoria.setDescripcion(txt_descripcion.getText().trim());
            if (!controlCategoria.eliminar(idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoría eliminada");
                txt_descripcion.setText("");
                this.CargarTablaCategorias();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar categoría");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoría");
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_categorias;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables

    // Mostrar todos las categorias registradas.
    private void CargarTablaCategorias() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select idCategoria, descripcion, estado from tb_categoria";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarCategoria.jTable_categorias = new JTable(model);
            InterGestionarCategoria.jScrollPane1.setViewportView(InterGestionarCategoria.jTable_categorias);

            model.addColumn("idCategoria");
            model.addColumn("descripcion");
            model.addColumn("estado");

            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla categorías: " + e);
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla categorías");
        }
        // Evento para obtener campo al cual el usuario da click y obtener la interfaz que mostrara la informacion general.
        jTable_categorias.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_categorias.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCategoria = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosCategoriaSeleccionada(idCategoria);
                }
            }
        });
    }

    // Metodo que envia datos seleccionados.
    private void EnviarDatosCategoriaSeleccionada(int idCategoria) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from tb_categoria where idCategoria = '" + idCategoria + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_descripcion.setText(rs.getString("descripcion"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar categoria: " + e);
            JOptionPane.showMessageDialog(null, "Error al seleccionar categoría");
        }
    }
}
