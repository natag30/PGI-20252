package co.edu.uniquindio.poo.gimnasiouqfit.model;

public class Trabajador extends Usuario {

    /**
     * Constructor de la clase Trabajador
     *
     * @param nombre    del Trabajador
     * @param id        del Trabajador
     * @param telefono  del Trabajador
     * @param correo    del Trabajador
     * @param direccion del Trabajador
     * @param theClase del Trabajador
     */
    public Trabajador(String nombre, int id, int telefono, String correo, String direccion, Clase theClase, Membresia theMembresia) {
        super(nombre, id, telefono, correo, direccion, theClase, theMembresia);
    }

    @Override
    public double calcularDescuento() {
        return 0.2;
    }

}
