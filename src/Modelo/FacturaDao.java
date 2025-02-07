/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author diego
 */
public class FacturaDao {
    
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Factura f){
        String sql="INSERT INTO Factura (id_factura, fecha, precio_total, id_cliente, Empleado_id_empleado)  values(?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,f.getId_factura());
            ps.setDate(2, (Date) f.getFecha());
            ps.setDouble(3,f.getPrecio_total());
            ps.setInt(4,f.getId_cliente());
            ps.setInt(5,f.getId_empleado());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
      public List listar() {
        String sql = "select * from Factura";
        List<Factura> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Factura ca = new Factura();
                ca.setId_factura(rs.getInt(1));
                ca.setFecha(rs.getDate(2));
                ca.setPrecio_total(rs.getDouble(3));
                ca.setId_cliente(rs.getInt(4));
                ca.setId_empleado(rs.getInt(5));
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
    public int actualizar (Factura f){
        String sql="UPDATE Factura set id_factura=?, fecha=?, precio_total=?, id_cliente=?, Empleado_id_empleado=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1,f.getId_factura());
            ps.setDate(2, (Date) f.getFecha());
            ps.setDouble(3,f.getPrecio_total());
            ps.setInt(4,f.getId_cliente());
            ps.setInt(5,f.getId_empleado());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
    public Factura buscar(String id){
        Factura c1 = new Factura();
        String sql = "select * from Factura where id_factura=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_factura(1);
                c1.setFecha(rs.getDate(2));
                c1.setPrecio_total(rs.getDouble(3));
                c1.setId_cliente(rs.getInt(4));
                c1.setId_empleado(rs.getInt(5));
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    
     public Factura buscartodo(){
        Factura c1 = new Factura();
        String sql = "select * from Factura";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_factura(1);
                c1.setFecha(rs.getDate(2));
                c1.setPrecio_total(rs.getDouble(3));
                c1.setId_cliente(rs.getInt(4));
                c1.setId_empleado(rs.getInt(5));
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
    
    
    public void eliminar(int id){
        String sql = "delete from Factura where id_factura=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
     
    
}
