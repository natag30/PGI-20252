package co.edu.uniquindio.poo.gimnasiouqfit.controller;

import co.edu.uniquindio.poo.gimnasiouqfit.model.*;

import java.time.LocalDate;
import java.util.Collection;

import static co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication.gimnasioUQ;

public class RecepcionistaController {

    private Recepcionista recepcionista;

    public RecepcionistaController(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public boolean registrarUsuario(String nombre, int id, int telefono, String correo, String direccion, String tipoUsuario, NivelMembresia nivelMembresia, TipoMembresia tipoMembresia, LocalDate fechaInicio) {
        LocalDate fechaFin = switch (tipoMembresia){
                case MENSUAL -> fechaInicio.plusMonths(1);
                case TRIMESTRAL -> fechaInicio.plusMonths(3);
                case ANUAL ->  fechaInicio.plusYears(1);
        };

        EstadoMembresia estadoMembresia = EstadoMembresia.ACTIVA;

        Membresia membresia = new Membresia(fechaInicio, fechaFin, tipoMembresia, estadoMembresia, nivelMembresia, recepcionista);

        Usuario usuario = switch(tipoUsuario){
            case "Estudiante" -> new Estudiante(nombre, id, telefono, correo, direccion, membresia);
            case "Trabajador UQ" -> new Trabajador(nombre, id, telefono, correo, direccion, membresia);
            case "Externo" -> new Externo(nombre, id, telefono, correo, direccion, membresia);
            default -> null;
        };

        if (usuario == null) {
            return false;
        };

        double costo= membresia.calcularCosto();
        double costoFinal =  membresia.calcularCostoFinal(usuario);

        return recepcionista.registrarUsuario(usuario);
    }

    public boolean eliminarUsuario(int id) {
        return recepcionista.eliminarUsuario(id);
    }

    public boolean asignarClaseUsuario(int id, Clase clase) {
        return recepcionista.asignarClase(id, clase);
    }

    public boolean validarIngreso(int id){
        return recepcionista.controlAccesoUsuario(id);
    }

    public Collection<Usuario> obtenerListaUsuarios() {
        return gimnasioUQ.getListUsuarios();
    }

    public Collection<Membresia> obtenerListaMembresias() {
        return gimnasioUQ.getListMembresias();
    }

    public Collection<Clase> obtenerListaClases() {
        return gimnasioUQ.getListClases();
    }
}
