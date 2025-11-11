package co.uniquindio.poo.model;

public class Administrador extends  Persona implements IGestion{


    /**
     * Constructor de la clase Administrador
     *
     * @param nombre    del Administrador
     * @param id        del Administrador
     * @param telefono  del Administrador
     * @param correo    del Administrador
     * @param direccion del Administrador
     */
    public Administrador(String nombre, int id, int telefono, String correo, String direccion) {
        super(nombre, id, telefono, correo, direccion);
    }

    @Override
    public void gestionEntrenador() {

    }

    @Override
    public void controlAcceso() {

    }
}
