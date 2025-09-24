package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Rutina {

    private int id;
    private String objetivo, fechaActualizacion;
    private double duracion;

    private NivelRutina nivelRutina;
    private List<Miembro> listMiembroRutina;
    private List<Ejercicios> listEjerciciosRutina;

    public Rutina(int id, String objetivo, String fechaActualizacion, double duracion, NivelRutina nivelRutina) {
        this.id = id;
        this.objetivo = objetivo;
        this.fechaActualizacion = fechaActualizacion;
        this.duracion = duracion;
        this.nivelRutina = nivelRutina;
        this.listMiembroRutina = new ArrayList<>();
        this.listEjerciciosRutina = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public NivelRutina getNivelRutina() {
        return nivelRutina;
    }

    public void setNivelRutina(NivelRutina nivelRutina) {
        this.nivelRutina = nivelRutina;
    }

    public List<Miembro> getListMiembroRutina() {
        return listMiembroRutina;
    }

    public void setListMiembroRutina(List<Miembro> listMiembroRutina) {
        this.listMiembroRutina = listMiembroRutina;
    }

    public List<Ejercicios> getListEjerciciosRutina() {
        return listEjerciciosRutina;
    }

    public void setListEjerciciosRutina(List<Ejercicios> listEjerciciosRutina) {
        this.listEjerciciosRutina = listEjerciciosRutina;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", objetivo='" + objetivo + '\'' +
                ", fechaActualizacion='" + fechaActualizacion + '\'' +
                ", duracion=" + duracion +
                ", nivelRutina=" + nivelRutina +
                ", listMiembroRutina=" + listMiembroRutina +
                ", listEjerciciosRutina=" + listEjerciciosRutina +
                '}';
    }
}
