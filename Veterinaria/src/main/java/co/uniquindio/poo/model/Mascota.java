package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre, raza, color, tipo;
    private int id, edad;
    private Propietario propietario;
    private List<Cita> listcitasMascota;

    public Mascota(String nombre, String raza, String color, int edad, int id, String tipo, Propietario propietario) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.id = id;
        this.tipo = tipo;
        this.propietario=propietario;
        this.listcitasMascota = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
