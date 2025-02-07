/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author Daniel
 */
public class Mueble {

    DefaultTableModel modelo = new DefaultTableModel();
    String nombre, material, alto, ancho, profundidad, color;
    int id_mueble, idCategoria, idProveedor, stock;
    double precio;

    public Mueble() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId_mueble() {
        return id_mueble;
    }

    public void setId_mueble(int id_mueble) {
        this.id_mueble = id_mueble;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public DefaultTableModel consultar() {
        Conectar conexion = new Conectar();
        String titulos[] = {"ID", "Nombre", "Precio", "Stock", "Material", "Alto", "Ancho", "Profundidad", "Color", "ID Categoria", "ID Proveedor", "Accion"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        int cantidadColumnas = 11;

        try {
            // Establecer la conexión y la sentencia
            Statement sentencia = conexion.getConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM Mueble");

            // Procesar los resultados y agregarlos al modelo de la tabla
            while (resultado.next()) {
                Object[] fila = new Object[cantidadColumnas];
                // Asegúrate de llenar todas las posiciones del array
                fila[0] = resultado.getInt("id_mueble");
                fila[1] = resultado.getString("nombre");
                fila[2] = resultado.getDouble("precio");
                fila[3] = resultado.getString("stock");
                fila[4] = resultado.getString("material");
                fila[5] = resultado.getString("alto");
                fila[6] = resultado.getString("ancho");
                fila[7] = resultado.getString("profundidad");
                fila[8] = resultado.getString("color");
                fila[9] = resultado.getInt("idCategoria");
                fila[10] = resultado.getInt("idProveedor");

                // Agregar la fila completa al modelo
                modelo.addRow(fila);
            }
            resultado.close();
            conexion.getConexion().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar los datos: " + e.getMessage(), "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        return modelo; // Retorna el modelo con los datos
    }

public void Modificar_mueble(String muebleSeleccionado, String stock_New) {
    try {
        // Validar que el valor de stock_New sea un número entero
        int nuevoStock;
        try {
            nuevoStock = Integer.parseInt(stock_New);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el formato no es válido
        }

        Conectar conexion = new Conectar();
        String sql = "UPDATE mueble SET stock = ? WHERE nombre = ?";
        
        // Preparar la sentencia SQL
        PreparedStatement sentencia = conexion.getConexion().prepareStatement(sql);
        sentencia.setInt(1, nuevoStock);  // Usar setInt para el stock como número entero
        sentencia.setString(2, muebleSeleccionado);
        
        // Ejecutar la sentencia y obtener el número de filas afectadas
        int filasAfectadas = sentencia.executeUpdate();
        
        // Mostrar mensaje dependiendo de si se actualizó o no el registro
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el mueble", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Cerrar la conexión de manera eficiente
        conexion.getConexion().close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar los datos: " + e.getMessage(), "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}


}
