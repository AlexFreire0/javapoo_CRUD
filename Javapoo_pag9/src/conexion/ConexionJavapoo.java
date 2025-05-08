package conexion;
import java.sql.*;

public class ConexionJavapoo {
    private static final String URL = "jdbc:mysql://localhost:3307/javapoo";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private ConexionJavapoo() {
        try {
            this.conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida correctamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
        }
    }
    public static Connection getConexion() {
        Connection conexion = null;
        try {
            // Registrar el driver (no necesario desde JDBC 4.0, pero lo mantenemos por compatibilidad)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida correctamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
    
    // Método estático para cerrar una conexión
    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
}