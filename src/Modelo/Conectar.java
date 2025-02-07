package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar {
    private Connection conexion;
    private PreparedStatement sentencia;
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/bdapro";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static final Logger LOGGER = Logger.getLogger(Conectar.class.getName());

    public Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            LOGGER.log(Level.INFO, "Conexión establecida correctamente.");
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Error al cargar el driver JDBC: {0}", e.getMessage());
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error de conexión a la base de datos: {0}", e.getMessage());
        }
    }
  

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public PreparedStatement getSentencia() {
        return sentencia;
    }

    public void setSentencia(PreparedStatement sentencia) {
        this.sentencia = sentencia;
    }

}
