package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nombre;
    private String cedula;
    private String telefono;

    //relaciones de asociación
    private List<Cita> listCitasVeterinario;

    //Documentación

    /**
     * Cosntructor de la clase Veterinario
     * @param nombre del Veterinario
     * @param cedula del Veterinario
     * @param telefono del Veterinario
     */

    //constructor
    public Veterinario(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listCitasVeterinario = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listCitasVeterinario=" + listCitasVeterinario +
                '}';
    }
}
