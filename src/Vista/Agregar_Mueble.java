
package Vista;

import Modelo.Conectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;



public class Agregar_Mueble extends javax.swing.JFrame {


    public Agregar_Mueble() {
        initComponents();
        this.CargarComboCategoria();
    }

    public JComboBox<String> getComboBox_categoria() {
        return ComboBox_categoria;
    }

    public JComboBox<String> getComboBox_proveedor() {
        return ComboBox_proveedor;
    }

    public JTextField getTxt_altomueble() {
        return txt_altomueble;
    }

    public JTextField getTxt_anchomueble() {
        return txt_anchomueble;
    }

    public JTextField getTxt_cantidadmueble() {
        return txt_cantidadmueble;
    }

    public JTextField getTxt_colormueble() {
        return txt_colormueble;
    }

    public JTextField getTxt_idmueble() {
        return txt_idmueble;
    }

    public JTextField getTxt_materialmueble() {
        return txt_materialmueble;
    }

    public JTextField getTxt_nombremueble() {
        return txt_nombremueble;
    }

    public JTextField getTxt_preciomueble() {
        return txt_preciomueble;
    }

    public JButton getButton_registrar() {
        return Button_registrar;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_idmueble = new javax.swing.JTextField();
        txt_nombremueble = new javax.swing.JTextField();
        txt_preciomueble = new javax.swing.JTextField();
        txt_cantidadmueble = new javax.swing.JTextField();
        txt_materialmueble = new javax.swing.JTextField();
        txt_altomueble = new javax.swing.JTextField();
        txt_anchomueble = new javax.swing.JTextField();
        txt_profundidadmueble = new javax.swing.JTextField();
        txt_colormueble = new javax.swing.JTextField();
        ComboBox_categoria = new javax.swing.JComboBox<>();
        ComboBox_proveedor = new javax.swing.JComboBox<>();
        Button_registrar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("AGREGAR MUEBLE");

        jLabel3.setText("ID mueble:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Material:");

        jLabel8.setText("Alto:");

        jLabel9.setText("Ancho:");

        jLabel10.setText("Profunidad:");

        jLabel11.setText("Color:");

        jLabel12.setText("Categoria:");

        jLabel13.setText("Proveedor:");

        ComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoria:", " " }));
        ComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_categoriaActionPerformed(evt);
            }
        });

        ComboBox_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar proveedor:" }));

        Button_registrar.setBackground(new java.awt.Color(102, 102, 102));
        Button_registrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Button_registrar.setForeground(new java.awt.Color(255, 255, 255));
        Button_registrar.setText("REGISTRAR");
        Button_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_idmueble, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txt_nombremueble)
                                    .addComponent(txt_preciomueble)
                                    .addComponent(txt_cantidadmueble)
                                    .addComponent(txt_materialmueble)
                                    .addComponent(txt_altomueble)
                                    .addComponent(txt_anchomueble)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(136, 136, 136)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(114, 114, 114)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(111, 111, 111)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_profundidadmueble)
                                    .addComponent(txt_colormueble)
                                    .addComponent(ComboBox_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBox_proveedor, 0, 170, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(Button_registrar)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_idmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombremueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_preciomueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cantidadmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_materialmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_altomueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_anchomueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_profundidadmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_colormueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ComboBox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ComboBox_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Button_registrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_categoriaActionPerformed
this.CargarComboCategoria();        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_categoriaActionPerformed

    private void Button_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_registrarActionPerformed


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
            java.util.logging.Logger.getLogger(Agregar_Mueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Mueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Mueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Mueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Mueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_registrar;
    private javax.swing.JComboBox<String> ComboBox_categoria;
    private javax.swing.JComboBox<String> ComboBox_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_altomueble;
    private javax.swing.JTextField txt_anchomueble;
    private javax.swing.JTextField txt_cantidadmueble;
    private javax.swing.JTextField txt_colormueble;
    private javax.swing.JTextField txt_idmueble;
    private javax.swing.JTextField txt_materialmueble;
    private javax.swing.JTextField txt_nombremueble;
    private javax.swing.JTextField txt_preciomueble;
    private javax.swing.JTextField txt_profundidadmueble;
    // End of variables declaration//GEN-END:variables

    

public int getValorSeleccionado() {
    if (ComboBox_categoria.getSelectedItem() != null) {
        return Integer.parseInt(ComboBox_categoria.getSelectedItem().toString());
    } else {
        return -1;
    }
}



  private void CargarComboCategoria() {
        Conectar conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = new Conectar();
            sentencia = conexion.getConexion().createStatement();
            resultado = sentencia.executeQuery("SELECT nombre FROM categoria");
            ComboBox_categoria.removeAllItems();
            ComboBox_categoria.addItem("Seleccione categoria:");

            while (resultado.next()) {
                ComboBox_categoria.addItem(resultado.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar las categorias " + e.getMessage());
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
    


}
