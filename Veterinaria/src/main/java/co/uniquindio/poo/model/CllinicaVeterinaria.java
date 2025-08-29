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
}
