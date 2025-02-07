/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mueble;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Controlador_compra implements ActionListener {
    
    
   
    Vistamueble objetoVista;
    Mueble objMod_mueble;
    DefaultTableModel modelo;
    AgregarStock objstock;
    Agregar_Mueble objagregarmueble;
    MenuPrincipal menu;
    Vistamueble compra;
    
    
    public Controlador_compra(){
        compra =new Vistamueble();
        compra.setVisible(true);
        compra.getAgregar().addActionListener(this);
        compra.getCantidad().addActionListener(this);
        compra.getiDproducto().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
       if (e.getSource() == compra.getAgregar() && compra.getiDproducto().getText().trim().isEmpty() && compra.getCantidad().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cantidad o Id están vacíos");

        } else {
           JOptionPane.showMessageDialog(null, "Cantidad si hay");
           compra.getCantidad().setText("");
           compra.getiDproducto().setText("");
        }
        
    }
    

  
}
