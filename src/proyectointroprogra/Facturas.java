/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointroprogra;

/**
 *
 * @author dooha
 */
public class Facturas {
    private String nombre;
    private String apellido;
    private String fechaFactura;
    private double montoFactura;

    public Facturas(String nombre, String apellido, String fechaFactura, double montoFactura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaFactura = fechaFactura;
        this.montoFactura = montoFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }
}