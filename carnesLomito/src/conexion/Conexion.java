package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String dbname = "bd_sistema_ventas";
    private static String username = "root";
    private static String password = "Alvaro3213634400";

    // Conexion con la base de datos.
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/" + dbname + "?useSSL=false", username, password);
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos " + e);
            JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos");
        }
        return null;
    }
}
