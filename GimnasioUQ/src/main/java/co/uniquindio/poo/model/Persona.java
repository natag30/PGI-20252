package co.uniquindio.poo.model;

import java.util.List;

public class Persona {

    private String nombre;
    private int id;
    private int telefono;
    private String correo;
    private String direccion;

    /**
     * Constructor de la clase persona
     * @param nombre    de la persona
     * @param id        de la persona
     * @param telefono  de la persona
     * @param correo    de la persona
     * @param direccion de la persona
     */
    public Persona(String nombre, int id, int telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }



}
