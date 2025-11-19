package co.edu.uniquindio.poo.gimnasiouqfit.model;

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

    /**
     * Constructor de la clase Clase
     * @param nombre de la clase
     * @param tipo de la clase
     * @param horario de la clase
     * @param cupoMax de la clase
     * @param theEntrenador de la clase
     * @param theRecepcionista de la clase
     */
    public Clase(String nombre, String tipo, String horario, int cupoMax, Entrenador theEntrenador, Recepcionista theRecepcionista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.horario = horario;
        this.cupoMax = cupoMax;
        this.listUsuariosClase = new ArrayList<>();
        this.theEntrenador = theEntrenador;
        this.theRecepcionista = theRecepcionista;
    }

    /**
     * Constructor de la clase Clase
     * @param nombre de la clase
     * @param tipo de la clase
     * @param horario de la clase
     * @param cupoMax de la clase
     */
    public Clase (String nombre, String tipo, String horario, int cupoMax){
        this.nombre = nombre;
        this.tipo = tipo;
        this.horario = horario;
        this.cupoMax = cupoMax;
    }

    /**
     * Metodo que permite agregar un usuario a una clase
     * @param usuario
     * @return
     */
    public boolean agregarUsuario (Usuario usuario){
        if (listUsuariosClase.size() < cupoMax){
            listUsuariosClase.add(usuario);
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public List<Usuario> getListUsuariosClase() {
        return listUsuariosClase;
    }

    public void setListUsuariosClase(List<Usuario> listUsuariosClase) {
        this.listUsuariosClase = listUsuariosClase;
    }

    public Entrenador getTheEntrenador() {
        return theEntrenador;
    }

    public void setTheEntrenador(Entrenador theEntrenador) {
        this.theEntrenador = theEntrenador;
    }

    public Recepcionista getTheRecepcionista() {
        return theRecepcionista;
    }

    public void setTheRecepcionista(Recepcionista theRecepcionista) {
        this.theRecepcionista = theRecepcionista;
    }

    @Override
    public String toString() {
        return nombre + " - " + horario;
    }
}
