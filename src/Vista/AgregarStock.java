
package Vista;

import Modelo.Conectar;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class AgregarStock extends javax.swing.JFrame {

private int stockActual; // Variable para almacenar el stock

    int idproducto = 0;
    
    int cantidad = 0;
    
    public AgregarStock() {
        initComponents();
        
        setSize(new Dimension(400, 300));
        this.CargarComboMueble();
    }

    public JButton getButton_agregar() {
        return Button_agregar;
    }

    public JComboBox<String> getComboBox_mueble() {
        return ComboBox_mueble;
    }

    public JTextField getTxtCantidad_actual() {
        return txtCantidad_actual;
    }

    public JTextField getTxtCantidad_nueva() {
        return txtCantidad_nueva;
    }

    public int getStockActual() {
        return stockActual;
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComboBox_mueble = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad_actual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad_nueva = new javax.swing.JTextField();
        Button_agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccionar mueble:");

        ComboBox_mueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar mueble:", " " }));
        ComboBox_mueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_muebleActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad actual:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("Agregar stock a mueble");

        txtCantidad_actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad_actualActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad a agregar:");

        Button_agregar.setBackground(new java.awt.Color(102, 102, 102));
        Button_agregar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Button_agregar.setForeground(new java.awt.Color(255, 255, 255));
        Button_agregar.setText("Agregar");
        Button_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(61, 61, 61)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidad_actual)
                                    .addComponent(ComboBox_mueble, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCantidad_nueva)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Button_agregar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBox_mueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Button_agregar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidad_actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad_actualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidad_actualActionPerformed

    private void Button_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_agregarActionPerformed

    private void ComboBox_muebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_muebleActionPerformed
this.MostrarStock();        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_muebleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_agregar;
    private javax.swing.JComboBox<String> ComboBox_mueble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCantidad_actual;
    private javax.swing.JTextField txtCantidad_nueva;
    // End of variables declaration//GEN-END:variables


public String getValorSeleccionado() {
    if (ComboBox_mueble.getSelectedItem() != null) {
        return ComboBox_mueble.getSelectedItem().toString();
    } else {
        return "No hay selección";
    }
}


    private void CargarComboMueble() {
        Conectar conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = new Conectar();
            sentencia = conexion.getConexion().createStatement();
            resultado = sentencia.executeQuery("SELECT nombre FROM Mueble");

            ComboBox_mueble.removeAllItems();
            ComboBox_mueble.addItem("Seleccione mueble:");

            while (resultado.next()) {
                ComboBox_mueble.addItem(resultado.getString("nombre"));
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
    
    
    
 private void MostrarStock() {
    Conectar conexion = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    
    try {
        conexion = new Conectar();
        
        // Usamos PreparedStatement para evitar inyección SQL
        String sql = "SELECT id_mueble, stock FROM Mueble WHERE nombre = ?";
        sentencia = conexion.getConexion().prepareStatement(sql);
        sentencia.setString(1, (String) ComboBox_mueble.getSelectedItem()); // Asignamos el valor seleccionado en el combo
        
        resultado = sentencia.executeQuery();
        
        if (resultado.next()) {
            idproducto = resultado.getInt("id_mueble");
            cantidad = resultado.getInt("stock");
            stockActual = resultado.getInt("stock");
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
