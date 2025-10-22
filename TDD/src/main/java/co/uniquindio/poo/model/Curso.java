package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private List<Estudiante> listEstudiantes;

    /**
     *Metodo constructor de la clase Curso
     * @param nombre del curso
     */

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listEstudiantes = new ArrayList<>();
    }

    /**
     * Metodo que permite agregar estudiantes a un curso
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante){
        listEstudiantes.add(estudiante);
    }

}
