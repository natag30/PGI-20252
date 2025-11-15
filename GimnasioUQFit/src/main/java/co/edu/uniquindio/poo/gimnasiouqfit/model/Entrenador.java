package co.edu.uniquindio.poo.gimnasiouqfit.model;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
