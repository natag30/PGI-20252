package co.uniquindio.poo.model;

public class Estudiante extends Usuario {

    /**
     * Constructor de la clase Estudiante
     * @param nombre del Estudiante
     * @param id del Estudiante
     * @param telefono del Estudiante
     * @param correo del Estudiante
     * @param direccion del Estudiante
     * @param theClase del Estudiante
     */
    public Estudiante(String nombre, int id, int telefono, String correo, String direccion, Clase theClase ) {
        super(nombre, id, telefono, correo, direccion, theClase);
    }



}


