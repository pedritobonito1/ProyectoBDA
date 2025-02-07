/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validar {
    
    Conectar cn = new Conectar();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
   
    
    public int validar (String id, String pas){
        int c = 0;
        String sql = "SELECT cargo FROM empleado WHERE id_empleado = ? AND password = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);  
            ps.setString(2, pas);
            rs = ps.executeQuery();
            if (rs.next()) {
                if(rs.getInt(1)==1){
                    c=1;
                }else {
                    c=2;
                }
            }
        }  catch (Exception e) {
             e.printStackTrace();
        } 
        return c;
    }
    
    
    
}
