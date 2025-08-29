package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private String raza;
    private String id;

    //Relaciones de asociación
    private List<Cita> listCitasMascotas;
    private Propietario thePropietario;

    //Documentación
    /**
     * Constructor de la clase Mascota
     * @param nombre de la Mascota
     * @param raza de la Mascota
     * @param id de la Mascota
     * @param propietario  de la Mascota
     */

    //constructor
    public Mascota(String nombre, String raza, String id, Propietario propietario) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
        this.listCitasMascotas = new ArrayList<>();
        this.thePropietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", id='" + id + '\'' +
                ", listCitasMascotas=" + listCitasMascotas +
                ", thePropietario=" + thePropietario +
                '}';
    }
}
