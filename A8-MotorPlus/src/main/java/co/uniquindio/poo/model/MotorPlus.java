package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class MotorPlus {
    private String nombre, correo, direccion;
    private int nit, telefono;

    private List<Persona> listPersonas;
    private List<Vehiculo> listVehiculos;
    private List<OrdenServicio> listOrdenServicio;

    /**
     * Constructor para la clase MotorPlus
     * @param nombre del taller
     * @param nit del taller
     * @param telefono del taller
     * @param correo del taller
     * @param direccion del taller
     */
    public MotorPlus(String nombre, int nit, int telefono, String correo, String direccion){
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.listPersonas = new ArrayList<>();
        this.listVehiculos = new ArrayList<>();
        this.listOrdenServicio = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(List<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }

    public List<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(List<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    public List<OrdenServicio> getListOrdenServicio() {
        return listOrdenServicio;
    }

    public void setListOrdenServicio(List<OrdenServicio> listOrdenServicio) {
        this.listOrdenServicio = listOrdenServicio;
    }

    @Override
    public String toString() {
        return "MotorPlus{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit=" + nit +
                ", telefono=" + telefono +
                ", listPersonas=" + listPersonas +
                ", listVehiculos=" + listVehiculos +
                ", listOrdenServicio=" + listOrdenServicio +
                '}';
    }
}
