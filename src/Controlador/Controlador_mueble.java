/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mueble;
import Vista.AgregarStock;
import Vista.Agregar_Mueble;
import Vista.MenuPrincipal;
import Vista.Vistamueble;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class Controlador_mueble implements ActionListener {
    Vistamueble objetoVista;
    Mueble objMod_mueble;
    DefaultTableModel modelo;
    AgregarStock objstock;
    Agregar_Mueble objagregarmueble;
    MenuPrincipal menu;
    public Controlador_mueble(){
        menu = new MenuPrincipal(); // Inicializamos el menú
        menu.setVisible(true);
        menu.getMenu_agregarstock().addActionListener(this); // Asignamos acción al menú de actualizar stock
        menu.getMenu_agrerarMueble().addActionListener(this);
        objMod_mueble= new Mueble();
    
    }

    
    public void actionPerformed(ActionEvent e) {
    System.out.println("Evento recibido");
    if (e.getSource() == menu.getMenu_agregarstock()){
        System.out.println("Abriendo ventana de actualización de stock...");
        objstock = new AgregarStock(); 
        objstock.setLocationRelativeTo(menu); 
        objstock.setVisible(true); 
        objstock.getButton_agregar().addActionListener(this); // Registramos el botón al listener
    }
   if(e.getSource()==menu.getMenu_agrerarMueble()){
       System.out.println("Evento recibido agregar stock");
       objagregarmueble= new Agregar_Mueble();
       objagregarmueble.setLocationRelativeTo(menu);
       objagregarmueble.setVisible(true);
       objagregarmueble.getButton_registrar().addActionListener(this);
   } 
    if(objagregarmueble != null && e.getSource() == objagregarmueble.getButton_registrar()){
        System.out.println(" Boton registrar presionado");
      //  int prueba= objMod_mueble
        objMod_mueble.setId_mueble(Integer.parseInt(objagregarmueble.getTxt_idmueble().getText()));
        objMod_mueble.setNombre(objagregarmueble.getTxt_nombremueble().getText());
        objMod_mueble.setPrecio(Double.parseDouble(objagregarmueble.getTxt_preciomueble().getText()));
    }
     if (objstock != null && e.getSource() == objstock.getButton_agregar()) {
        System.out.println("Botón Enviar presionado");
  
        // Obtener el valor seleccionado del ComboBox
        String valorSeleccionado = objstock.getValorSeleccionado();
        int stock = objstock.getStockActual();
    System.out.println("Stock actual del producto seleccionado: " + stock);
        System.out.println("Valor del ComboBox: " + valorSeleccionado);
        int cant_nueva=Integer.parseInt(objstock.getTxtCantidad_nueva().getText());
        System.out.println(cant_nueva);
        System.out.println("objMod_mueble: " + objMod_mueble);

      
    }
   }
}

