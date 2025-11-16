package co.edu.uniquindio.poo.gimnasiouqfit.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador implements IGestion{

    private String usuario;
    private String contraseña;

    private List<Entrenador> listEntrenadoresAdministrador;

    /**
     * Constructor de la clase Administrador
     * @param usuario de ingreso del Administrador
     * @param contraseña de ingreso del Administrador
     */
    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.listEntrenadoresAdministrador = new ArrayList<Entrenador>();
    }

    /**
     * Metodo que permite al Administrador registrar un Entrenador en el Gimnasio
     * @param entrenador
     */
    public boolean registrarEntrenador(Entrenador entrenador){
        boolean centinela = false;
        if (!verificarEntrenador(entrenador.getId())) {
            listEntrenadoresAdministrador.add(entrenador);
            centinela = true;
            System.out.println("Entrenador " + entrenador.getId() + " registrado");
        }
        return centinela;
    }


    /**
     * Metodo que permite verificar si el entrenador existe
     * @param id
     * @return
     */
    public boolean verificarEntrenador(int id) {
        boolean centinela = false;
        for (Entrenador ent : listEntrenadoresAdministrador) {
            if (ent.getId() == id) {
                centinela = true;
                System.out.println("El entrenador existe");
                break;
            }else{
                System.out.println("El entrenador no existe");
            }
        }
        return centinela;
    }


    /**
     * Metodo que  permite al Administrador eliminar un Entrenador del Gimnasio
     * @param entrenador
     */
    public boolean eliminarEntrenador(Entrenador entrenador){
        boolean centinela = false;
        for (Entrenador ent : listEntrenadoresAdministrador) {
            if (ent.getNombre().equals(entrenador.getNombre())) {
                listEntrenadoresAdministrador.remove(entrenador);
                centinela = true;
                System.out.println("Entrenador " + entrenador.getNombre() + " eliminado");
                break;
            }
        }
        return centinela;
    }

    /**
     * Metodo que  permite al Administrador modificar la lista de entrenadores del Gimnasio
     * @param listEntrenadores
     */
    public void setListEntrenadoresAdministrador(List<Entrenador> listEntrenadores) {
        this.listEntrenadoresAdministrador = listEntrenadores;
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

    public List<Entrenador> getListEntrenadoresAdministrador() {
        return listEntrenadoresAdministrador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
