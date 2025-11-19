package co.edu.uniquindio.poo.gimnasiouqfit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorTest {

    @Test
    void registrarEntrenador() {
        Administrador administrador = new Administrador("", "");
        Clase clase = new Clase("Yoga", "Relajacion",  "Sabado 8:00 a 9:00 a.m", 20);
        Entrenador entrenador = new Entrenador("Andres Sanchez", 1094965911, 3115245, "jaandres@gmail.com", clase);
        administrador.registrarEntrenador(entrenador);
        assertNotNull(administrador.getEntrenadores());
    }

    @Test
    void eliminarEntrenador() {
        Administrador administrador = new Administrador("", "");
        Clase clase = new Clase("Yoga", "Relajacion",  "Sabado 8:00 a 9:00 a.m", 20);
        Entrenador entrenador = new Entrenador("Andres Sanchez", 1094965911, 3115245, "jaandres@gmail.com", clase);
        administrador.eliminarEntrenador(entrenador);

    }

    @Test
    void controlAccesoAdministrador() {
        Administrador administrador = new Administrador("1094975918", "123456");
        assertTrue( administrador.controlAccesoAdministrador(administrador.getUsuario(),administrador.getContraseña()));
    }
}