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
public class EmpleadoDao {
    
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int agregar(Empleado e1){
        String sql="INSERT INTO Empleado (id_empleado, nombre, password) values(?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,e1.getId_empleado());
            ps.setString(2,e1.getNombre());
            ps.setString(3,e1.getPassword());
            ps.setInt(4,e1.getCargo());
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return r;
    }
    
     public List listar() {
        String sql = "select * from Empleado";
        List<Empleado> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado ca = new Empleado();
                ca.setId_empleado(rs.getInt(1));
                ca.setNombre(rs.getString(2));
                ca.setPassword(rs.getString(3));
                ca.setCargo(rs.getInt(4));
                //JOptionPane.showMessageDialog(null,c1.getDni()+"??" );
                lista.add(ca);
            }
            
        } catch (Exception ex) {
        }
        return lista;
    }
    
     public int actualizar (Empleado e1){
        String sql="UPDATE Empleado set id_empleado=?, nombre=?, password=?";
        int r=0;
        Connection con =null;
        PreparedStatement ps=null;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1,e1.getId_empleado());
            ps.setString(2,e1.getNombre());
            ps.setString(3,e1.getPassword());
            ps.setInt(4,e1.getCargo());
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
     
     
      public Empleado buscar(String id){
        Empleado c1 = new Empleado();
        String sql = "select * from cliente where id_empleado=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_empleado(1);
                c1.setNombre(rs.getString(2));
                c1.setPassword(rs.getString(3));
                c1.setCargo(4);
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
      
      public Empleado buscartodo(String id){
        Empleado c1 = new Empleado();
        String sql = "select * from cliente";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c1.setId_empleado(1);
                c1.setNombre(rs.getString(2));
                c1.setPassword(rs.getString(3));
                c1.setCargo(4);
            }
            
        } catch (Exception e) {
        }
        
        return c1;
    }
      
      
      public void eliminar(int id){
        String sql = "delete from empleado where id_empleado=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
}
