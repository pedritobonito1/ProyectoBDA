/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Proveedor {
    private String nombre, telefono, direccion, nombre_persona_contacto;
    private int id_proveedor ;

    public Proveedor() {
    }

    public Proveedor(String nombre, String telefono, String direccion, String nombre_persona_contacto, int id_proveedor) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre_persona_contacto = nombre_persona_contacto;
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre_persona_contacto() {
        return nombre_persona_contacto;
    }

    public void setNombre_persona_contacto(String nombre_persona_contacto) {
        this.nombre_persona_contacto = nombre_persona_contacto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
    
    
}
