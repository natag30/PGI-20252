package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class GimnasioUQ {

    private String nombre;
    private String direccion;
    private int telefono;

    private List<Usuario> listUsuarios;
    private List<Clase> listClases;
    private List<Membresia> listMembresias;
    private List<Entrenador> listEntrenadores;
    private Administrador theAdministrador;
    private Recepcionista theRecepcionista;


    /**
     * Constructor de la clase GimnasioUQ
     * @param nombre del Gimnasio
     * @param direccion del Gimnasio
     * @param telefono del Gimnasio
     * @param theAdministrador del Gimnasio
     * @param theRecepcionista del Gimnasio
     */
    public GimnasioUQ(String nombre, String direccion, int telefono, Administrador theAdministrador, Recepcionista theRecepcionista) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listUsuarios = new ArrayList<>();
        this.listClases = new ArrayList<>();
        this.listMembresias = new ArrayList<>();
        this.listEntrenadores = new ArrayList<>();
        this.theAdministrador = theAdministrador;
        this.theRecepcionista = theRecepcionista;
    }







}
