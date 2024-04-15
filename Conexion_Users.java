/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import static Menu.ConexionBD.obtenerConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author domin
 */
public class Conexion_Users {
    private static final String URL = "jdbc:mysql://localhost:3306/gestor_tareas";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Pp332244,.z";
    private static Connection conn;
    
    public static Connection obtenerConexion() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
                System.out.println("Conexión establecida con la base de datos.");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Error al conectar con la base de datos.");
                ex.printStackTrace();
            }
        }
        return conn;
    }
    public static void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión.");
                ex.printStackTrace();
            }
        }
    }
    
 
    
           public void insertarUsuario(String usuario, String contraseña) throws SQLException {
    PreparedStatement statement = null;
    Connection conexion = null;
    
    try {
        // Establecer la conexión a la base de datos
        conexion = ConexionBD.obtenerConexion();
        
        // Preparar la consulta SQL para insertar un nuevo usuario
        String sql = "INSERT INTO login_users (Usuario, Contraseña) VALUES (?, ?)";
        statement = conexion.prepareStatement(sql);
        
        // Establecer los valores de los parámetros en la consulta
        statement.setString(1, usuario);
        statement.setString(2, contraseña);
        
        // Ejecutar la consulta para insertar el nuevo usuario
        statement.executeUpdate();
        
        System.out.println("Usuario creado exitosamente.");
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Error al crear el usuario: " + ex.getMessage());
    } finally {
        // Cerrar la conexión y liberar recursos
        if (statement != null) {
            statement.close();
        }
        if (conexion != null) {
            conexion.close();
        }
    }
}
     
        
public boolean validarCredenciales(String usuario, String contraseña) {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        boolean accesoConcedido = false;

        try {
            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            
            // Preparar la consulta SQL para validar las credenciales
            String sql = "SELECT * FROM login_users WHERE Usuario = ? AND Contraseña = ?";
            statement = conexion.prepareStatement(sql);
            
            // Establecer los valores de los parámetros en la consulta
            statement.setString(1, usuario);
            statement.setString(2, contraseña);
            
            // Ejecutar la consulta para obtener los resultados
            resultSet = statement.executeQuery();
            
            // Si hay resultados, las credenciales son válidas
            if (resultSet.next()) {
                accesoConcedido = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error al validar las credenciales: " + ex.getMessage());
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return accesoConcedido;
    }

    public static void main(String[] args) {
        ConexionBD dao = new ConexionBD();
        String usuario = "usuario";
        String contraseña = "contraseña";

        boolean accesoConcedido = dao.validarCredenciales(usuario, contraseña);
        if (accesoConcedido) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
    
}
