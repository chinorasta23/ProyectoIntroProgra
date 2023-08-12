/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyectointroprogra;

import java.util.*;


class Evento {
    private int eventoId;
    private String eventoNombre;
    private String ciudad;
    private String direccion;
    private String categoria;
    private String fecha;
    private int capacidad;
    private int AsientosVendidos; 
    private int edadMinima;

    public Evento(int eventoId, String eventoNombre, String ciudad, String direccion, String categoria, String fecha, int capacidad, int AsientosVendidos, int edadMinima) {
        this.eventoId = eventoId;
        this.eventoNombre = eventoNombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.categoria = categoria;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.AsientosVendidos = AsientosVendidos;
        this.edadMinima = edadMinima;
    }

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public String getEventoNombre() {
        return eventoNombre;
    }

    public void setEventoNombre(String eventoNombre) {
        this.eventoNombre = eventoNombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAsientosVendidos() {
        return AsientosVendidos;
    }

    public void setAsientosVendidos(int AsientosVendidos) {
        this.AsientosVendidos = AsientosVendidos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    
}
