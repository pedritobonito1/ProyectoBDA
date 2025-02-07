/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Cliente {
    private String nombre, correo,direccion,password;
    private int id_cliente;
 
    public Cliente() {
    }
 
    public Cliente(String nombre, String correo, String direccion, String password, int id_cliente) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.password = password;
        this.id_cliente = id_cliente;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getCorreo() {
        return correo;
    }
 
    public void setCorreo(String correo) {
        this.correo = correo;
    }
 
    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public int getId_cliente() {
        return id_cliente;
    }
 
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
