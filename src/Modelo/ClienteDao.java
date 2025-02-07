/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ClienteDao {
    
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Cliente c1){
        String sql="insert int Cliente(id_cliente,nombre,correo,direccion,password) values(?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,c1.getId_cliente());
            ps.setString(2,c1.getNombre());
            ps.setString(3,c1.getCorreo());
            ps.setString(4,c1.getDireccion());
            ps.setString(5,c1.getPassword());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
     public List listar() {
        String sql = "select * from Cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente ca = new Cliente();
                ca.setId_cliente(rs.getInt(1));
                ca.setNombre(rs.getString(2));
                ca.setCorreo(rs.getString(3));
                ca.setDireccion(rs.getString(4));
                ca.setPassword(rs.getString(5));
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    public int actualizar (Cliente c1){
        String sql="UPDATE Cliente set id_cliente=?, Nombre=?, Correo=?, Direccion=?, Password=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, c1.getId_cliente());
            ps.setString(2, c1.getNombre());
            ps.setString(3, c1.getCorreo());
            ps.setString(4, c1.getDireccion());
            ps.setString(5, c1.getPassword());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    public Cliente buscar(String id_cliente){
        Cliente c1 = new Cliente();
        String sql = "select * from cliente where Id_Cliente=" + id_cliente;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_cliente(1);
                c1.setNombre(rs.getString(2));
                c1.setCorreo(rs.getString(3));
                c1.setDireccion(rs.getString(4));
                c1.setPassword(rs.getString(5));
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    
        public Cliente buscartodo(){
        Cliente c1 = new Cliente();
        String sql = "select * from cliente";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_cliente(1);
                c1.setNombre(rs.getString(2));
                c1.setCorreo(rs.getString(3));
                c1.setDireccion(rs.getString(4));
                c1.setPassword(rs.getString(5));
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    public void eliminar(int id){
        String sql = "delete from cliente where Id_Cliente=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
