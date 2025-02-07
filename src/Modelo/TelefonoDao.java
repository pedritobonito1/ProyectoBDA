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

public class TelefonoDao {
    
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Telefono t1){
        String sql="INSERT INTO Telefono (id_telefono, id_cliente) values(?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,t1.getId_telefono());
            ps.setInt(2,t1.getId_cliente());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
     public List listar() {
        String sql = "select * from Telefono";
        List<Telefono> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Telefono ca = new Telefono();
                ca.setId_telefono(rs.getString(1));
                ca.setId_cliente(rs.getInt(2));
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    public int actualizar (Telefono t1){
        String sql="UPDATE Telefono set id_telefono=?, id_cliente=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,t1.getId_telefono());
            ps.setInt(2,t1.getId_cliente());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
    public Telefono buscar(String id, String id2){
        Telefono c1 = new Telefono();
        String sql = "select * from Telefono where id_telefono=" + id+"& id_cliente="+id2;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_cliente(1);
                c1.setId_telefono(rs.getString(2));
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    
    public Telefono buscartodo(String id, String id2){
        Telefono c1 = new Telefono();
        String sql = "select * from Telefono";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_cliente(1);
                c1.setId_telefono(rs.getString(2));
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    
    public void eliminar(int id){
        String sql = "delete from telefono";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
   
    
}
