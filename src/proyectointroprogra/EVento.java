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
public class EVento {
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
        sillasNumeradas.add(numeroSilla);
        capacidadDisponible--;
    }
}

    public void editarEvento(String nombre, String ciudad, String direccion, String categoria,int fecha, int capacidad) {
                             
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.categoria = categoria;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.capacidadDisponible = capacidad;
    }

    public void inactivarEvento() {
        capacidad = 0;
        capacidadDisponible = 0;
    }

    public boolean esSillaDisponible(int numeroSilla) {
        return sillasNumeradas.contains(numeroSilla);
    }
    }

class GestorEventos {
    private Map<Integer, Evento> eventos;

    public GestorEventos() {
        eventos = new HashMap<>();
    }
    
    public void agregarEvento(Evento evento){
        eventos.put(evento.getId, evento);
    }
    
    public void editarEvento(Evento evento) {
        eventos.put(evento.getId, evento);
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
    
}
