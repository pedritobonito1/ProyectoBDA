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
public class Detalle_pedidoDao {
    
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
    public int agregar(Detalle_pedido c1){
        String sql="INSERT INTO Detalle_pedido (id_detalle_pedido, cantidad, precio, id_factura) values(?,?,?,?);";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,c1.getId_detalle_pedido());
            ps.setInt(2,c1.getCantidad());
            ps.setDouble(3,c1.getPrecio());
            ps.setInt(4,c1.getId_factura());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
     public List listar() {
        String sql = "select * from Detalle_pedido";
        List<Detalle_pedido> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Detalle_pedido ca = new Detalle_pedido();
                ca.setId_detalle_pedido(rs.getInt(1));
                ca.setCantidad(rs.getInt(2));
                ca.setPrecio(rs.getDouble(3));
                ca.setId_factura(rs.getInt(1));
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    public int actualizar (Detalle_pedido c1){
        String sql="UPDATE Cliente set id_detalle_pedido=?, cantidad=?, precio=?, id_factura=?;";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1,c1.getId_detalle_pedido());
            ps.setInt(2,c1.getCantidad());
            ps.setDouble(3,c1.getPrecio());
            ps.setInt(4,c1.getId_factura());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
    public Detalle_pedido buscar(int id){
        Detalle_pedido c1 = new Detalle_pedido();
        String sql = "select * from Detalle_pedido where id_detalle_pedido=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_detalle_pedido(1);
                c1.setCantidad(2);
                c1.setPrecio(rs.getDouble(3));
                c1.setId_factura(4);
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    
    public Detalle_pedido buscartodo(){
        Detalle_pedido c1 = new Detalle_pedido();
        String sql = "select * from Detalle_pedido";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_detalle_pedido(1);
                c1.setCantidad(2);
                c1.setPrecio(rs.getDouble(3));
                c1.setId_factura(4);
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    
    
    public void eliminar(int id){
        String sql = "delete from Detalle_pedido where id_detalle_pedido=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
       
}
