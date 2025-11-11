package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class GimnasioUQ {

    private String nombre;
    private String direccion;
    private int telefono;

    private List<Persona> listPersonas;

    /**
     * Constructor para la clase GimnasioUQ
     * @param nombre del Gimnasio
     * @param direccion del Gimnasio
     * @param telefono del Gimnasio
     */
    public GimnasioUQ(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listPersonas = new ArrayList<>();

    }


}
