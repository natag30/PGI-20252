package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nombre, id;
    private List<Cita> listCitasVeterinario;


    public Veterinario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listCitasVeterinario = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
