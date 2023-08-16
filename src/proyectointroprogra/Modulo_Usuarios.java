/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectointroprogra;

import java.util.LinkedList;

/**
 *
 * @author and03
 */
class Usuarios {

    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Password;
    private boolean Estado;
    private String Correo;
    private boolean isAdmin;

    public Usuarios(String nombre, String apellido, String usuario, String password, boolean estado, String correo, boolean isAdmin) {
        Nombre = nombre;
        Apellido = apellido;
        Usuario = usuario;
        Password = password;
        Estado = estado;
        Correo = correo;
        isAdmin = isAdmin;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellido;
    }

    public void setApellidos(String apellidos) {
        Apellido = apellidos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
class AlmacenamientoUsuarios {
    //Método de almacenamiento LinkedList.
    private static AlmacenamientoUsuarios instance;
    private LinkedList<Usuarios> listaUsuarios;
    
    private AlmacenamientoUsuarios() {
        listaUsuarios = new LinkedList<>();
    }
    //Patrón Singleton para instanciar la clase 1 sola vez, para su utilización en diferentes partes del código sin problemas.
    public static AlmacenamientoUsuarios getInstance() {
        if (instance == null) {
            instance = new AlmacenamientoUsuarios();
        }
        return instance;
    }
    
    public void agregarUsuario(Usuarios usuario) {
        listaUsuarios.add(usuario);
    }
    public LinkedList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }
    
    
    public boolean validarCredenciales(String usuario, String password) {
        for (Usuarios user : listaUsuarios) {
            if (user.getUsuario().equals(usuario) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

public class Modulo_Usuarios{
    public static void main(String[] args) {
        JfInicio vInicio = new JfInicio();
        vInicio.setVisible(true);
    } 
}
