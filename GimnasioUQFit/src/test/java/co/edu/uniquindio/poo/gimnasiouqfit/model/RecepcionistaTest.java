package co.edu.uniquindio.poo.gimnasiouqfit.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RecepcionistaTest {

    @Test
    void registrarUsuario() {
        Recepcionista recepcionista = new Recepcionista();
        Membresia membresia = new Membresia(LocalDate.now(), LocalDate.now().plusMonths(1), TipoMembresia.MENSUAL, EstadoMembresia.ACTIVA, NivelMembresia.BASICA, recepcionista);
        Usuario usuario = new Estudiante("Julian Garcia", 7542623, 105245663, "jualgarc@gmail.com", "", membresia);
        recepcionista.registrarUsuario(usuario);
        assertNotNull(recepcionista.getUsuarios());
    }

    @Test
    void asignarClase() {
        Recepcionista recepcionista = new Recepcionista();
        Membresia membresia = new Membresia(LocalDate.now(), LocalDate.now().plusMonths(1), TipoMembresia.MENSUAL, EstadoMembresia.ACTIVA, NivelMembresia.BASICA, recepcionista);
        Usuario usuario = new Estudiante("Julian Garcia", 7542623, 105245663, "jualgarc@gmail.com", "", membresia);
        Clase clase = new Clase("Yoga", "Relajacion",  "Sabado 8:00 a 9:00 a.m", 20);
        recepcionista.asignarClase(usuario.getId(), clase);
        assertNotNull(usuario.getTheClase());
    }

    @Test
    void controlAccesoUsuario() {
        Recepcionista recepcionista = new Recepcionista();
        Membresia membresia = new Membresia(LocalDate.now(), LocalDate.now().plusMonths(1), TipoMembresia.MENSUAL, EstadoMembresia.ACTIVA, NivelMembresia.BASICA, recepcionista);
        Usuario usuario = new Estudiante("Julian Garcia", 7542623, 105245663, "jualgarc@gmail.com", "", membresia);
        recepcionista.registrarUsuario(usuario);
        assertTrue( recepcionista.controlAccesoUsuario(usuario.getId()));
    }
}