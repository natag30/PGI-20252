package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    private String nombre;
    private String tipo;
    private  String horario;
    private int cupoMax;

    private List<Estudiante> listEstudiantesClase;
    private List<Trabajador> listTrabajadoresClase;
    private List<Externo> listExternosClase;
    private Entrenador theEntrenador;

    public Clase(String nombre, String tipo, String horario, int cupoMax, Entrenador theEntrenador) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.horario = horario;
        this.cupoMax = cupoMax;
        this.listEstudiantesClase = new ArrayList<>();
        this.listTrabajadoresClase = new ArrayList<>();
        this.listExternosClase = new ArrayList<>();
        this.theEntrenador = theEntrenador;
    }
}
