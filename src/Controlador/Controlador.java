package Controlador;

import Modelo.Mueble;
import Vista.ActualizarMueble;
import Vista.MenuPrincipal;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador {

    Vistamueble objetoVista;
    Mueble objetoModelo;
    DefaultTableModel modelo;
    ActualizarMueble vistaActualizar;
    
      public Controlador() {
        objetoVista = new Vistamueble();
        objetoVista.setVisible(true);
        vistaActualizar = new ActualizarMueble();
       
        
        
        // Asociar el ActionListener al botón
        
        // Llamar al método para llenar la tabla automáticamente al iniciar
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaActualizar.getBoton_stock()) {
            String mueble = vistaActualizar.llevar();
            String stock_new = vistaActualizar.getTxtCantidad_nueva().getText();
            objetoModelo.Modificar_mueble(mueble, stock_new);
        }
    }



    // Método para actualizar la tabla con los datos
    public void actualizarTabla() {
        objetoModelo = new Mueble();
        modelo = (DefaultTableModel) objetoVista.getTablemueble().getModel();
        int filas = objetoVista.getTablemueble().getRowCount();

        // Eliminar todas las filas antes de mostrar los nuevos datos
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }

        // Obtener los datos y actualizarlos en la tabla
        modelo = objetoModelo.consultar();
        objetoVista.getTablemueble().setModel(modelo);
    }
    
   
}
