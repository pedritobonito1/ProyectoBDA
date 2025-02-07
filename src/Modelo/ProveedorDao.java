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
import java.util.Set;

/**
 *
 * @author diego
 */
public class ProveedorDao {
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Proveedor p1){
        String sql="insert int Proveedor(id_proveedor,nombre,telefono,direccion,nombre_persona_contacto) values(?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,p1.getId_proveedor());
            ps.setString(2,p1.getNombre());
            ps.setString(3,p1.getTelefono());
            ps.setString(4,p1.getDireccion());
            ps.setString(5,p1.getNombre_persona_contacto());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
     public List listar() {
        String sql = "select * from Proveedor";
        List<Proveedor> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor ca = new Proveedor();
                ca.setId_proveedor(rs.getInt(1));
                ca.setNombre(rs.getString(2));
                ca.setTelefono(rs.getString(3));
                ca.setDireccion(rs.getString(4));
                ca.setNombre_persona_contacto(rs.getString(5));    
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    
      public int actualizar (Proveedor p1){
        String sql="UPDATE Proveedor set id_proveedor=?, Nombre=?, telefono=?, Direccion=?, Nombre_persona_contacto=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1,p1.getId_proveedor());
            ps.setString(2,p1.getNombre());
            ps.setString(3,p1.getTelefono());
            ps.setString(4,p1.getDireccion());
            ps.setString(5,p1.getNombre_persona_contacto());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
      
       public Proveedor buscar(String id_proveedor){
        Proveedor p1 = new Proveedor();
        String sql = "select * from proveedor where Id_proveedor=" + id_proveedor;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p1.setId_proveedor(1);
                p1.setNombre(rs.getString(2));
                p1.setTelefono(rs.getString(3));
                p1.setDireccion(rs.getString(4));
                p1.setNombre_persona_contacto(rs.getString(5));
            }
            
        } catch (Exception e) {
        }
        
        return p1;
    }
       
       public Proveedor buscartodo(){
        Proveedor p1 = new Proveedor();
        String sql = "select * from proveedor";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p1.setId_proveedor(1);
                p1.setNombre(rs.getString(2));
                p1.setTelefono(rs.getString(3));
                p1.setDireccion(rs.getString(4));
                p1.setNombre_persona_contacto(rs.getString(5));
            }
            
        } catch (Exception e) {
        }
        
        return p1;
    }
       
       
       public void eliminar(int id){
        String sql = "delete from proveedor where Id_proveedor=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    
    
}
