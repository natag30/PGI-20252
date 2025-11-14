package co.uniquindio.poo.model;

public class Usuario {

    private String nombre;
    private int id;
    private int telefono;
    private String correo;
    private String direccion;
    private Clase theClase;

    /**
     * Constructor de la clase Usuario
     * @param nombre    del Usuario
     * @param id        del Usuario
     * @param telefono  del Usuario
     * @param correo    del Usuario
     * @param direccion del Usuario
     */
    public Usuario(String nombre, int id, int telefono, String correo, String direccion, Clase theClase) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.theClase = theClase;
    }



}
