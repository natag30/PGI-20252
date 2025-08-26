package co.uniquindio.poo.model;

public class Veterinario {
    private String nombre, id;


    public Veterinario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
