package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Persona {

    private Especialidad especialidad;
    private List<Actividad> listActividadesTecnico;

    public Tecnico(String nombre, int cedula, int telefono, String correo, Especialidad especialidad) {
        super(nombre, cedula, telefono, correo);
        this.especialidad = especialidad;
        this.listActividadesTecnico = new ArrayList<>();
    }

}
