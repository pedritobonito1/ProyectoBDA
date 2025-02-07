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
public class MuebleDao {
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Mueble m1){
        String sql="INSERT INTO Mueble (id_mueble, nombre, precio, Stock, Material, Alto, ancho, profundidad, color, idCategoria, idProveedor) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,m1.getId_mueble());
            ps.setString(2,m1.getNombre());
            ps.setDouble(3,m1.getPrecio());
            ps.setInt(4,m1.getStock());
            ps.setString(5,m1.getMaterial());
            ps.setString(6,m1.getAlto());
            ps.setString(7,m1.getAncho());
            ps.setString(8,m1.getProfundidad());
            ps.setString(9,m1.getColor());
            ps.setInt(10,m1.getIdCategoria());
            ps.setInt(11,m1.getIdProveedor());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
      public List listar() {
        String sql = "select * from Mueble";
        List<Mueble> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Mueble ca = new Mueble();
                ca.setId_mueble(rs.getInt(1));
                ca.setNombre(rs.getString(2));
                ca.setPrecio(rs.getDouble(3));
                ca.setStock(rs.getInt(4));
                ca.setMaterial(rs.getString(5));
                ca.setAlto(rs.getString(6));
                ca.setAncho(rs.getString(7));
                ca.setProfundidad(rs.getString(8));
                ca.setColor(rs.getString(9));
                ca.setIdCategoria(rs.getInt(10));
                ca.setIdProveedor(rs.getInt(11));
                
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    public int actualizar (Mueble m1){
        String sql="UPDATE Mueble set id_mueble=?, nombre=?, precio=?, Stock=?, Material=?, Alto=?, ancho=?, profundidad=?, color=?, idCategoria=?, idProveedor=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
           ps.setInt(1,m1.getId_mueble());
            ps.setString(2,m1.getNombre());
            ps.setDouble(3,m1.getPrecio());
            ps.setInt(4,m1.getStock());
            ps.setString(5,m1.getMaterial());
            ps.setString(6,m1.getAlto());
            ps.setString(7,m1.getAncho());
            ps.setString(8,m1.getProfundidad());
            ps.setString(9,m1.getColor());
            ps.setInt(10,m1.getIdCategoria());
            ps.setInt(11,m1.getIdProveedor());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
    
    
     public Mueble buscar(String Id_mueble){
        Mueble m1 = new Mueble();
        String sql = "select * from Mueble where Id_mueble=" + Id_mueble;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                m1.setId_mueble(1);
                m1.setNombre(rs.getString(2));
                m1.setPrecio(rs.getDouble(3));
                m1.setStock(rs.getInt(4));
                m1.setMaterial(rs.getString(5));
                m1.setAlto(rs.getString(6));
                m1.setAncho(rs.getString(7));
                m1.setProfundidad(rs.getString(8));
                m1.setColor(rs.getString(9));
                m1.setIdCategoria(10);
                m1.setIdProveedor(11);
                      
            }
            
        } catch (Exception e) {
        }
        
        return m1;
    }
     
     public Mueble buscartodo(){
        Mueble m1 = new Mueble();
        String sql = "select * from Mueble";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                m1.setId_mueble(1);
                m1.setNombre(rs.getString(2));
                m1.setPrecio(rs.getDouble(3));
                m1.setStock(rs.getInt(4));
                m1.setMaterial(rs.getString(5));
                m1.setAlto(rs.getString(6));
                m1.setAncho(rs.getString(7));
                m1.setProfundidad(rs.getString(8));
                m1.setColor(rs.getString(9));
                m1.setIdCategoria(10);
                m1.setIdProveedor(11);
                      
            }
            
        } catch (Exception e) {
        }
        
        return m1;
    }
     
     public void eliminar(int Id_mueble){
        String sql = "delete from mueble where Id_mueble=" + Id_mueble;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
}
