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


public class CategoriaDao {
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Categoria c1){
        String sql="insert int categoria(id_categoria,nombre) values(?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,c1.getId_categoria());
            ps.setString(2,c1.getNombre());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
    public int actualizar (Categoria c1){
        String sql="UPDATE Categoria set id_categoria=?, nombre=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, c1.getId_categoria());
            ps.setString(2, c1.getNombre());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
    public List listar() {
        String sql = "select * from Categoria";
        List<Categoria> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria ca = new Categoria();
                ca.setId_categoria(rs.getInt(1));
                ca.setNombre(rs.getString(2));
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    
    public Categoria buscar(String id_categoria){
        ArrayList<Categoria>list = new ArrayList<>();
        Categoria c1 = new Categoria();
        String sql = "select * from categoria where Id_Categoria=" + id_categoria;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_categoria(1);
                c1.setNombre(rs.getString(2));
            }
            
        } catch (Exception e) {
        }
        return c1;
    }
    
    public Categoria buscartodo(){
        Categoria c1 = new Categoria();
        String sql = "select * from categoria";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_categoria(1);
                c1.setNombre(rs.getString(2));
            }
            
        } catch (Exception e) {
        }
        return c1;
    }
    
    
     public void eliminar(int id){
        String sql = "delete from categoria where Id_Cliente=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    
    
    
}
