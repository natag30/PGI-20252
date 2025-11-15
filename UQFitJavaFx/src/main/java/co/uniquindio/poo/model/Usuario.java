package co.uniquindio.poo.model;

public abstract class Usuario {

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Clase getTheClase() {
        return theClase;
    }

    public void setTheClase(Clase theClase) {
        this.theClase = theClase;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", theClase=" + theClase +
                '}';
    }
}
