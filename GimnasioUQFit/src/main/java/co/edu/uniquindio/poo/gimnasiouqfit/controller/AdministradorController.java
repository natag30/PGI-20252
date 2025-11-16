package co.edu.uniquindio.poo.gimnasiouqfit.controller;

import co.edu.uniquindio.poo.gimnasiouqfit.model.Administrador;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Entrenador;
import co.edu.uniquindio.poo.gimnasiouqfit.model.GimnasioUQ;

public class AdministradorController {

    Administrador administrador;

    public AdministradorController(Administrador administrador) {
        this.administrador = administrador;
    }

    public boolean crearEntrenador(Entrenador entrenador) {
        return administrador.registrarEntrenador(entrenador);
    }


}
