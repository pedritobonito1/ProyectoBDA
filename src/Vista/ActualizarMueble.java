/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.Conectar;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class ActualizarMueble extends javax.swing.JInternalFrame {

    int idproducto = 0;
    int cantidad = 0;
    String mueble="";
    String llevar="";
    public ActualizarMueble() {
        initComponents();
        setTitle("Actualizar stock de mueble");
        setSize(new Dimension(400, 300));

        this.CargarComboMueble();
    }

    public JTextField getTxtCantidad_nueva() {
        return txtCantidad_nueva;
    }

    public JButton getBoton_stock() {
        return boton_stock;
    }

    public JComboBox<String> getjComboBox_mueble() {
        return jComboBox_mueble;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boton_stock = new javax.swing.JButton();
        txtCantidad_actual = new javax.swing.JTextField();
        txtCantidad_nueva = new javax.swing.JTextField();
        jComboBox_mueble = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Actualizar stock de mueble");

        jLabel2.setText("Mueble:");

        jLabel3.setText("Stock actual:");

        jLabel4.setText("Stock nuevo:");

        boton_stock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton_stock.setText("Actualizar");
        boton_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_stockActionPerformed(evt);
            }
        });

        jComboBox_mueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione mueble:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_mueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_muebleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantidad_actual, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtCantidad_nueva)
                    .addComponent(jComboBox_mueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(boton_stock)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_mueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boton_stock)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_stockActionPerformed
         
    }//GEN-LAST:event_boton_stockActionPerformed

    private void jComboBox_muebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_muebleActionPerformed
     this.MostrarStock();
    }//GEN-LAST:event_jComboBox_muebleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_stock;
    private javax.swing.JComboBox<String> jComboBox_mueble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCantidad_actual;
    private javax.swing.JTextField txtCantidad_nueva;
    // End of variables declaration//GEN-END:variables

    
    public void obtenerSeleccion(){
        mueble = (String) jComboBox_mueble.getSelectedItem();
    }
    public String llevar(){
        return mueble;
    }
//metodo para cargar los muebles ene l jComboBox
    private void CargarComboMueble() {
        Conectar conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = new Conectar();
            sentencia = conexion.getConexion().createStatement();
            resultado = sentencia.executeQuery("SELECT nombre FROM Mueble");

            jComboBox_mueble.removeAllItems();
            jComboBox_mueble.addItem("Seleccione mueble:");

            while (resultado.next()) {
                jComboBox_mueble.addItem(resultado.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar los muebles: " + e.getMessage());
        } finally {
            // Asegúrate de cerrar todos los recursos
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (conexion != null) {
                    conexion.getConexion().close(); // Cerrar la conexión
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }

//metodo para mostrar stock actual
private void MostrarStock() {
    Conectar conexion = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    
    try {
        conexion = new Conectar();
        
        // Usamos PreparedStatement para evitar inyección SQL
        String sql = "SELECT id_mueble, stock FROM Mueble WHERE nombre = ?";
        sentencia = conexion.getConexion().prepareStatement(sql);
        sentencia.setString(1, (String) jComboBox_mueble.getSelectedItem()); // Asignamos el valor seleccionado en el combo
        
        resultado = sentencia.executeQuery();
        
        if (resultado.next()) {
            idproducto = resultado.getInt("id_mueble");
            cantidad = resultado.getInt("stock");
            txtCantidad_actual.setText(String.valueOf(cantidad));
            txtCantidad_actual.setEditable(false);
        } else {
            txtCantidad_actual.setText(""); // Si no encuentra el mueble, limpiamos el campo
        }

    } catch (SQLException e) {
        System.out.println("Error al obtener stock: " + e.getMessage());
    } finally {
        // Cerrar recursos
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.getConexion().close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
}


}
