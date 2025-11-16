package co.edu.uniquindio.poo.gimnasiouqfit.controller;

import co.edu.uniquindio.poo.gimnasiouqfit.model.Administrador;

public class LoginController {

    private Administrador administrador;

    public LoginController(Administrador administrador) {
        this.administrador = administrador;
    }

    public boolean verificarAcceso(String usuario, String contraseña) {
        return administrador.controlAccesoAdministrador(usuario,contraseña);
    }

}
