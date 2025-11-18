package co.edu.uniquindio.poo.gimnasiouqfit.model;

import javafx.scene.paint.Material;

public class Estudiante extends Usuario {

    /**
     * Constructor de la clase Estudiante
     * @param nombre del Estudiante
     * @param id del Estudiante
     * @param telefono del Estudiante
     * @param correo del Estudiante
     * @param direccion del Estudiante
     * @param theClase del Estudiante
     */
    public Estudiante(String nombre, int id, int telefono, String correo, String direccion, Clase theClase, Membresia theMembresia ) {
        super(nombre, id, telefono, correo, direccion, theClase, theMembresia);
    }

    public Estudiante(String nombre, int id, int telefono, String correo, String direccion, Membresia theMembresia ) {
        super(nombre, id, telefono, correo, direccion, theMembresia);
    }

    public Estudiante(String nombre, int id, int telefono, String correo, String direccion) {
        super(nombre, id, telefono, correo, direccion);
    }

    @Override
    public double calcularDescuento() {
        return 0.15;
    }
}


