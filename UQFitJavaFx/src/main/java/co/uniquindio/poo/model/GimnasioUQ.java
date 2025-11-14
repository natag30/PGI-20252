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

    /**
     * Metodo que registra un Usuario en el Gimnasio
     * @param usuario
     */
    public void registrarUsuario(Usuario usuario){
        listUsuarios.add(usuario);
    }

    /**
     * Metodo que registra un Entrenador en el Gimnasio
     * @param entrenador
     */
    public void registrarEntrenador(Entrenador entrenador){
        listEntrenadores.add(entrenador);
    }

    /**
     * Metodo que elimina un Entrenador del Gimnasio
     * @param entrenador
     */
    public void eliminarEntrenador(Entrenador entrenador){
        listEntrenadores.remove(entrenador);
    }

    /**
     * Metodo para agregar una clase en el gimnasio
     * @param clase
     */
    public void registrarClase(Clase clase){
        listClases.add(clase);
    }

    public void registrarMembresia(Membresia membresia){
        listMembresias.add(membresia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public List<Clase> getListClases() {
        return listClases;
    }

    public void setListClases(List<Clase> listClases) {
        this.listClases = listClases;
    }

    public List<Membresia> getListMembresias() {
        return listMembresias;
    }

    public void setListMembresias(List<Membresia> listMembresias) {
        this.listMembresias = listMembresias;
    }

    public List<Entrenador> getListEntrenadores() {
        return listEntrenadores;
    }

    public void setListEntrenadores(List<Entrenador> listEntrenadores) {
        this.listEntrenadores = listEntrenadores;
    }

    public Administrador getTheAdministrador() {
        return theAdministrador;
    }

    public void setTheAdministrador(Administrador theAdministrador) {
        this.theAdministrador = theAdministrador;
    }

    public Recepcionista getTheRecepcionista() {
        return theRecepcionista;
    }

    public void setTheRecepcionista(Recepcionista theRecepcionista) {
        this.theRecepcionista = theRecepcionista;
    }
}
