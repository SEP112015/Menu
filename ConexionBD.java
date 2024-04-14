package menú;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/gestor_tareas";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Pp332244,.z";

    private static Connection conexion; // Cambio aquí: conexión estática para mantenerla abierta

    // Cambio aquí: método estático para obtener la conexión
    public static Connection obtenerConexion() {
        if (conexion == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
                System.out.println("Conexión establecida con la base de datos.");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Error al conectar con la base de datos.");
                ex.printStackTrace();
            }
        }
        return conexion;
    }

    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión.");
                ex.printStackTrace();
            }
        }
    }

    public void Insertar(String tarea, String descripcion, String fechaRealizar, String horaRealizar, String prioridad) {
        try {
            DateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");
            DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = originalFormat.parse(fechaRealizar);
            String formattedDate = targetFormat.format(date);

            String query = "INSERT INTO Gestor_Tareas (TAREAS, DESCRIPCION, FECHA_A_REALIZAR, HORA_A_REALIZAR, PRIORIDAD) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conexion.prepareStatement(query);
            pstmt.setString(1, tarea);
            pstmt.setString(2, descripcion);
            pstmt.setString(3, formattedDate);
            pstmt.setString(4, horaRealizar);
            pstmt.setString(5, prioridad);

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException | ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar la tarea: " + ex.getMessage());
        }
    }

    public void Eliminar(String tarea) {
        try {
            String query = "DELETE FROM Gestor_Tareas WHERE TAREAS = ?";
            PreparedStatement pstmt = conexion.prepareStatement(query);
            pstmt.setString(1, tarea);
            
            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Tarea eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La tarea con el ID proporcionado no se encontró en la base de datos.");
            }

            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar la tarea: " + ex.getMessage());
        }
    }

    public void Actualizar(String tareaSeleccionada, String nuevaTarea, String nuevaDescripcion, String nuevaFecha, String nuevaHora, String nuevaPrioridad) {
     
        try {
        String query = "UPDATE Gestor_Tareas SET TAREAS = ?, DESCRIPCION = ?, FECHA_A_REALIZAR = ?, HORA_A_REALIZAR = ?, PRIORIDAD = ?, FECHA_CREACION = CURRENT_DATE(), HORA_CREACION = CURRENT_TIME() WHERE TAREAS = ?";
        PreparedStatement pstmt = conexion.prepareStatement(query);
        pstmt.setString(1, nuevaTarea);
        pstmt.setString(2, nuevaDescripcion);
        pstmt.setString(3, nuevaFecha);
        pstmt.setString(4, nuevaHora);
        pstmt.setString(5, nuevaPrioridad);
        pstmt.setString(6, tareaSeleccionada);

        pstmt.executeUpdate();
        pstmt.close();
        JOptionPane.showMessageDialog(null, "Tarea actualizada correctamente.");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar la tarea: " + ex.getMessage());
    }
}
   
}
   


