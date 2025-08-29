package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String cedula;
    private String telefono;

    //relaciones de asociación
    private List<Mascota> listMascotasPropietario;

    //lista de strings, ints, cualquier tipo de dato
    /*private List<String> string;
    private List<Integer> ints;
    private List<Character> chart;
    private List<Boolean>b;*/

    //Documentación
    /**
     * Constructor de la clase Propietario
     * @param nombre del Propietario
     * @param cedula del Propietario
     * @param telefono del Propietario
     */

    //constructor
    public Propietario(String nombre, String cedula, String telefono){
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listMascotasPropietario = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listMascotasPropietario=" + listMascotasPropietario +
                '}';
    }
}