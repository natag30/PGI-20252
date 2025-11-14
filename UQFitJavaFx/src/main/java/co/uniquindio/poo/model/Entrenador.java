package co.uniquindio.poo.model;

public class Entrenador {

    private String nombre;
    private int id;
    private int telefono;
    private String correo;
    ;
    /**
     * Constructor de la clase Entrenador
     *
     * @param nombre    del Entrenador
     * @param id        del Entrenador
     * @param telefono  del Entrenador
     * @param correo    del Entrenador
     */
    public Entrenador(String nombre, int id, int telefono, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
    }

}
