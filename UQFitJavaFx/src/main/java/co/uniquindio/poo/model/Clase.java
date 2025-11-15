package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    private String nombre;
    private String tipo;
    private  String horario;
    private int cupoMax;

    private List<Usuario> listUsuariosClase;
    private Entrenador theEntrenador;
    private Recepcionista theRecepcionista;

    public Clase(String nombre, String tipo, String horario, int cupoMax, Entrenador theEntrenador, Recepcionista theRecepcionista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.horario = horario;
        this.cupoMax = cupoMax;
        this.listUsuariosClase = new ArrayList<>();
        this.theEntrenador = theEntrenador;
        this.theRecepcionista = theRecepcionista;
    }


}
