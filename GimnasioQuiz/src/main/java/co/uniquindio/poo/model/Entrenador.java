package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    private int id;
    private String nombre, certificacion;
    private double experiencia;
    private boolean disponible;

    private List<Miembro> listmiembros;

    public Entrenador(int id, String nombre, String certificacion, double experiencia, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.certificacion = certificacion;
        this.experiencia = experiencia;
        this.disponible = verificarDisponibilidad();
        this.listmiembros = new ArrayList<>();
    }

    public boolean verificarDisponibilidad(){
        boolean disponible = false;

        for (Miembro miembro : listmiembros) {
            if (listmiembros.contains(miembro)) {
                disponible = true;
            }
            return disponible;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Miembro> getListmiembros() {
        return listmiembros;
    }

    public void setListmiembros(List<Miembro> listmiembros) {
        this.listmiembros = listmiembros;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", certificacion='" + certificacion + '\'' +
                ", experiencia=" + experiencia +
                ", disponible=" + disponible +
                ", listmiembros=" + listmiembros +
                '}';
    }
}
