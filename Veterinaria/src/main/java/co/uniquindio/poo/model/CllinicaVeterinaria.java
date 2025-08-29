package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class CllinicaVeterinaria {

    //parámetros o atributos de la clase
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;

    //relaciones de composición
    private List<Mascota> listMascotas;
    private List<Cita> listCitas;

    //relaciones de agregación
    private List<Veterinario> listVeterinarios;
    private List<Propietario> listPropietarios;

    //Documentacion de parámetros java
    /**
     * Constructor de la clase ClinicaVeterinaria
     * @param nit de la ClinicaVeterinaria
     * @param nombre de la ClinicaVeterinaria
     * @param direccion de la ClinicaVeterinaria
     * @param telefono de la ClinicaVeterinaria
     */

    //constructor
    public CllinicaVeterinaria(String nit, String nombre, String direccion, String telefono) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listMascotas = new ArrayList<>();
        this.listCitas = new ArrayList<>();
        this.listVeterinarios = new ArrayList<>();
        this.listPropietarios = new ArrayList<>();
    }

    //métodos

    //registrar mascotas

    /**
     * Metodo que permite registrar mascotas en la clinica Veterinaria
     * @param mascota
     */
    public void registrarMascotaClinica(Mascota mascota){
        listMascotas.add(mascota);
    }

    //asignar citas
    public void agendarCita(Cita cita){
        listCitas.add(cita);
    }

    //registrar veterinario
    public void registrarVeterinarioClinica(Veterinario veterinario){
        listVeterinarios.add(veterinario);
    }

    //registrar propietario
    public void registrarPropietarioClinica(Propietario propietario){
        listPropietarios.add(propietario);
    }

    //métodos get y set no se agregan en el diagrama por practicidad

    /**
     * Metodo get de la clase Clinica Veterinaria que me permite obtener el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo seet de la clase ClinicaVeterinaria que permite modificar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //generados automáticamente

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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

    public List<Mascota> getListMascotas() {
        return listMascotas;
    }

    public void setListMascotas(List<Mascota> listMascotas) {
        this.listMascotas = listMascotas;
    }

    public List<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(List<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    public List<Veterinario> getListVeterinarios() {
        return listVeterinarios;
    }

    public void setListVeterinarios(List<Veterinario> listVeterinarios) {
        this.listVeterinarios = listVeterinarios;
    }

    public List<Propietario> getListPropietarios() {
        return listPropietarios;
    }

    public void setListPropietarios(List<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }
}
