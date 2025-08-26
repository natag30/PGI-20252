package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre, apellido, email;
    private int id, telefono;
    private List<Mascota> listMascotas;
    private List<Cita> listCitas;
    //lista de strings, ints, cualquier tipo de dato
    /*private List<String> string;
    private List<Integer> ints;
    private List<Character> chart;
    private List<Boolean>b;*/


    public Propietario(String nombre, String apellido, String email, int id, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.id = id;
        this.telefono = telefono;
        this.listMascotas = new ArrayList<>();
        this.listCitas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public int getTelefono() {
        return telefono;
    }


}
