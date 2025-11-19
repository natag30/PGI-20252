package co.edu.uniquindio.poo.gimnasiouqfit.model;

import java.util.*;

public class Administrador implements IGestion{

    private String usuario;
    private String contraseña;

    Map<Integer, Entrenador> entrenadores = new HashMap();

    /**
     * Constructor de la clase Administrador
     * @param usuario de ingreso del Administrador
     * @param contraseña de ingreso del Administrador
     */
    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * Metodo que permite al Administrador registrar un Entrenador en el Gimnasio
     * @param entrenador
     */
    public boolean registrarEntrenador(Entrenador entrenador){
        if (entrenadores.containsKey(entrenador.getId())) return false;
        entrenadores.put(entrenador.getId(), entrenador);
        return true;

    }

    /**
     * Metodo que  permite al Administrador eliminar un Entrenador del Gimnasio
     * @param entrenador
     */
    public boolean eliminarEntrenador(Entrenador entrenador){
        return entrenadores.remove(entrenador.getId()) != null;
    }


    /**
     * Metodo que permite al administrador actualizar un entrenador del gimnasio
     * @param id
     * @param entrenador
     * @return
     */
    public boolean actualizarEntrenador(int id, Entrenador entrenador) {
        Entrenador existente = entrenadores.get(id);
        if (existente == null) return false;

        existente.setNombre(entrenador.getNombre());
        existente.setTelefono(entrenador.getTelefono());
        existente.setCorreo(entrenador.getCorreo());
        return true;
    }

        /**
         * Metodo que controla el acceso del Administrador
         * @param usuario del administrador
         * @param contraseña del administrador
         * @return
         */
    public boolean controlAccesoAdministrador(String usuario, String contraseña) {
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    @Override
    public void generarReporte() {

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Collection<Entrenador> getEntrenadores() {
        return entrenadores.values();
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
