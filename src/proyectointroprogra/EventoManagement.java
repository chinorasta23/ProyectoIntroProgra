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
    private List<Evento> eventos;
   
    public EventoManagement() {
    }

    public void agregarEvento(Evento event) {
        eventos.add(event);
        System.out.println(eventos);
    }

    public void editarEvento(int eventId, Evento newEventoo) {
        Evento event = eventos.get(eventId);
        
        eventos.set(eventId, newEventoo);
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