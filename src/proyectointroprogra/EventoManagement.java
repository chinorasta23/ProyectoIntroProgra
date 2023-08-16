/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointroprogra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco
 */

public class EventoManagement {
    private static List<Evento> eventos = new ArrayList<>();
   
    public EventoManagement() {
    }

    public static List<Evento> getEventos() {
        return eventos;
    }
    
    public void agregarEvento(Evento event) {
        eventos.add(event);
        System.out.println(eventos);
    }

    public void editarEvento(int eventId, Evento event) {
        eventos.set(eventId, event);
    }

    public void borrarEvento(Evento x) {   
        eventos.remove(x);
    }
   
    public void desactivarEvento(int eventId) {
        Evento event = eventos.get(eventId);
        
    }

    public void agregarAsientoAlEvento(int eventId, int numeroAsiento) {
        Evento event = eventos.get(eventId);
        int AsientosVendidos = event.getAsientosVendidos();
        if(!(AsientosVendidos == event.getCapacidad())){
                        System.out.println("Su asiento ha sido registrado.");
           event.setAsientosVendidos(AsientosVendidos +1);
        } else {
            System.out.println("No quedan asientos disponibles.");
        }
    }

}