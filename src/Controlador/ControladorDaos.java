/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.util.List;
/**
 *
 * @author diego
 */
public class ControladorDaos {
Categoria c1 = new Categoria();
CategoriaDao cdao = new CategoriaDao();
Cliente cl1 = new Cliente();
ClienteDao cldao = new ClienteDao();
Conectar con = new Conectar();
Detalle_pedido dp1 = new Detalle_pedido();
Detalle_pedidoDao dpdao = new Detalle_pedidoDao();
Empleado e1 = new Empleado();
EmpleadoDao edao = new EmpleadoDao();
Factura f1 = new Factura();
FacturaDao fdao = new FacturaDao();
Mueble m1 = new Mueble();
MuebleDao mdao = new MuebleDao();
Pedido p1 = new Pedido();
PedidoDao pdao = new PedidoDao();
Proveedor pr1 = new Proveedor();
ProveedorDao prdao = new ProveedorDao();
Telefono t1 = new Telefono();
TelefonoDao tdao = new TelefonoDao();

    public static void main(String[] args) {
        MuebleDao mdao = new MuebleDao(); // Crear instancia de MuebleDao
        List<Mueble> lista = mdao.listar(); // Llamar a listar()
        System.out.println("Esta vaina se conectò ");
       /* Validar validar=new Validar();
        EmpleadoDao edao = new EmpleadoDao(); // Crear instancia del DAO
        List<Empleado> lista = edao.listar(); // Obtener la lista de empleados
        for (Empleado var : lista) {
            System.out.println(var.getNombre()+" Cargo:"+var.getCargo()); // Imprimir nombres
        }
        
        String id="3";
        String pas="segura456";
        int c=validar.validar(id, pas);
        if(c==0){
            System.out.println("El usuario no existe");
            
        }else if(c==1){
            System.out.println("hola :) ADMIN");
        }else if(c==2){
            System.out.println("BECERROs");
        }
      tids
        */
    for (Mueble m : lista) {
        System.out.println("ID: " + m.getId_mueble() +
                           ", Nombre: " + m.getNombre() +
                           ", Precio: " + m.getPrecio() +
                           ", Stock: " + m.getStock() +
                           ", Material: " + m.getMaterial() +
                           ", Alto: " + m.getAlto() +
                           ", Ancho: " + m.getAncho() +
                           ", Profundidad: " + m.getProfundidad() +
                           ", Color: " + m.getColor() +
                           ", Categoría: " + m.getIdCategoria() +
                           ", Proveedor: " + m.getIdProveedor());
    }
    }


        
        
        
    
}
