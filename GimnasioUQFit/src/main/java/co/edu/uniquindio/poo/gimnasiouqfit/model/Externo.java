package co.edu.uniquindio.poo.gimnasiouqfit.model;

public class Externo extends Usuario {


    /**
     * Constructor de la clase Externo
     *
     * @param nombre    del Externo
     * @param id        del Externo
     * @param telefono  del Externo
     * @param correo    del Externo
     * @param direccion del Externo
     * @param theClase del Externo
     */
    public Externo(String nombre, int id, int telefono, String correo, String direccion, Clase theClase) {
        super(nombre, id, telefono, correo, direccion, theClase);
    }


}
