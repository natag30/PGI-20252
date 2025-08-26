package co.uniquindio.poo.model;

public class Propietario {
    private String nombre, apellido, email;
    private int id, telefono;

    public Propietario(String nombre, String apellido, String email, int id, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.id = id;
        this.telefono = telefono;
    }
}
