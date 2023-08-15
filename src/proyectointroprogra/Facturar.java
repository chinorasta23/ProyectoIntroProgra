/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointroprogra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dooha
 */
public class Facturar {
    private static List<Facturas> facturas = new ArrayList<>();
    
    public Facturar(){
    
    }
    
    public static List<Facturas> getFacturas() {
        return facturas;
    }
    
    public void agregarFactura(Facturas factura){
        facturas.add(factura);
        System.out.println(facturas);
    }
    
    public void eliminarFactura(Facturas factura){
        facturas.remove(factura);
        System.out.println("Eliminó" + factura);
        System.out.println(facturas);
    }
    
    
    
    
}
