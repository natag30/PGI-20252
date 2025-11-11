package co.uniquindio.poo.model;

public class Recepcionista extends Persona implements IGestion{


    /**
     * Constructor de la clase Recepcionista
     *
     * @param nombre    del recepcionista
     * @param id        del recepcionista
     * @param telefono  del recepcionista
     * @param correo    del recepcionista
     * @param direccion del recepcionista
     */
    public Recepcionista(String nombre, int id, int telefono, String correo, String direccion) {
        super(nombre, id, telefono, correo, direccion);
    }

    @Override
    public void gestionEntrenador() {

    }

    @Override
    public void controlAcceso() {

    }
}
