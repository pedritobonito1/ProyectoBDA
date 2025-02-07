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
public class PedidoDao {
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Pedido p1){
        String sql="INSERT INTO Pedido (id_detalle_pedido, idMueble) values(?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,p1.getId_detalle_pedido());
            ps.setInt(2,p1.getId_mueble());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
     public List listar() {
        String sql = "select * from Pedido";
        List<Pedido> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedido ca = new Pedido();
                ca.setId_mueble(rs.getInt(1));
                ca.setId_mueble(rs.getInt(2));
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    public int actualizar (Pedido p1){
        String sql="UPDATE Pedido set id_detalle_pedido=?, idMueble=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1,p1.getId_detalle_pedido());
            ps.setInt(2,p1.getId_mueble());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
     public Pedido buscar(String id, String id2){
        Pedido c1 = new Pedido();
        String sql = "SELECT * FROM pedido WHERE id_detalle_pedido="+id+" & idMueble=+"+id2;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_detalle_pedido(1);
                c1.setId_mueble(2);
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
     
     public Pedido buscartodo(){
        Pedido c1 = new Pedido();
        String sql = "SELECT * FROM pedido";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_detalle_pedido(1);
                c1.setId_mueble(2);
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
     
     
     public void eliminar(int id){
        String sql = "delete from Pedido where id_detalle_pedido="+1+" & idMueble="+1+";";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
