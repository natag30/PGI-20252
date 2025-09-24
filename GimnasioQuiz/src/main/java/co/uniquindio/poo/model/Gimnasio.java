package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Gimnasio {
    private int id, RNT;
    private String nombre, direccion, telefono;

    private List<Miembro> listMiembrosGimnasio;
    private List<Rutina> listRutinas;
    private List<Entrenador> listEntrenadores;
    private List<Ejercicios> listEjercicios;


    public Gimnasio(int id, String nombre, int RNT, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.RNT = RNT;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listMiembrosGimnasio = new ArrayList<>();
        this.listRutinas= new ArrayList<>();
        this.listEntrenadores= new ArrayList<>();
        this.listEjercicios = new ArrayList<>();
    }

    public void registrarMiembro(Miembro theMiembro) {
        listMiembrosGimnasio.add(theMiembro);
    }

    public void asignarRutina(Rutina theRutina) {
        listRutinas.add(theRutina);
    }

    public void registrarEntrenador(Entrenador theEntrenador) {
        listEntrenadores.add(theEntrenador);
    }

    public void registrarEjercicios(Ejercicios theEjercicios) {
        listEjercicios.add(theEjercicios);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRNT() {
        return RNT;
    }

    public void setRNT(int RNT) {
        this.RNT = RNT;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Miembro> getListMiembrosGimnasio() {
        return listMiembrosGimnasio;
    }

    public void setListMiembrosGimnasio(List<Miembro> listMiembrosGimnasio) {
        this.listMiembrosGimnasio = listMiembrosGimnasio;
    }

    public List<Rutina> getListRutinas() {
        return listRutinas;
    }

    public void setListRutinas(List<Rutina> listRutinas) {
        this.listRutinas = listRutinas;
    }

    public List<Entrenador> getListEntrenadores() {
        return listEntrenadores;
    }

    public void setListEntrenadores(List<Entrenador> listEntrenadores) {
        this.listEntrenadores = listEntrenadores;
    }

    public List<Ejercicios> getListEjercicios() {
        return listEjercicios;
    }

    public void setListEjercicios(List<Ejercicios> listEjercicios) {
        this.listEjercicios = listEjercicios;
    }



    @Override
    public String toString() {
        return "Gimnasio{" +
                "id=" + id +
                ", RNT=" + RNT +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listMiembrosGimnasio=" + listMiembrosGimnasio +
                ", listRutinas=" + listRutinas +
                ", listEntrenadores=" + listEntrenadores +
                ", listEjercicios=" + listEjercicios +
                '}';
    }
}
