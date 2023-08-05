/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointroprogra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Francisco
 */
public class Evento {
    private int id;
    private String nombre;
    private String ciudad;
    private String direccion;
    private String categoria;
    private int fecha;
    private int capacidad;
    private int capacidadDisponible;
    private List<Integer> sillasNumeradas;
    private Integer getId;
    
    
    public Evento(int id, String nombre, String ciudad, String direccion, String categoria, int fecha, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.categoria = categoria;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.capacidadDisponible = capacidad;
        this.sillasNumeradas = new ArrayList<>();
    }
    
public void agregarSillaNumerada(int numeroSilla){
    if (!sillasNumeradas.contains(numeroSilla)){
            getSillasNumeradas().add(numeroSilla);
            setCapacidadDisponible(getCapacidadDisponible() - 1);
    }
}

    public void editarEvento(String nombre, String ciudad, String direccion, String categoria,int fecha, int capacidad) {
                             
        this.setNombre(nombre);
        this.setCiudad(ciudad);
        this.setDireccion(direccion);
        this.setCategoria(categoria);
        this.setFecha(fecha);
        this.setCapacidad(capacidad);
        this.setCapacidadDisponible(capacidad);
    }

    public void inactivarEvento() {
        setCapacidad(0);
        setCapacidadDisponible(0);
    }

    public boolean esSillaDisponible(int numeroSilla) {
        return getSillasNumeradas().contains(numeroSilla);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the capacidadDisponible
     */
    public int getCapacidadDisponible() {
        return capacidadDisponible;
    }

    /**
     * @param capacidadDisponible the capacidadDisponible to set
     */
    public void setCapacidadDisponible(int capacidadDisponible) {
        this.capacidadDisponible = capacidadDisponible;
    }

    /**
     * @return the sillasNumeradas
     */
    public List<Integer> getSillasNumeradas() {
        return sillasNumeradas;
    }

    /**
     * @param sillasNumeradas the sillasNumeradas to set
     */
    public void setSillasNumeradas(List<Integer> sillasNumeradas) {
        this.sillasNumeradas = sillasNumeradas;
    }

    /**
     * @return the getId
     */
    public Integer getGetId() {
        return getId;
    }

    /**
     * @param getId the getId to set
     */
    public void setGetId(Integer getId) {
        this.getId = getId;
    }
    }

class GestorEventos {
    private Map<Integer, Evento> eventos;

    public GestorEventos() {
        eventos = new HashMap<>();
    }
    
    public void agregarEvento(Evento evento){
        eventos.put(evento.getGetId(), evento);
    }
    
    public void editarEvento(Evento evento) {
        eventos.put(evento.getGetId(), evento);
    }
    
    public void inactivarEvento(int idEvento) {
        Evento evento = eventos.get(idEvento);
        if (evento != null) {
            evento.inactivarEvento();
            eventos.put(idEvento, evento);
        }
    }
    
    
    public boolean existeEvento(int idEvento) {
        return eventos.containsKey(idEvento);
    }
    
    
}
