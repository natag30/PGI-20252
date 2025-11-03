package co.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EstudianteTest {

    @Test
    public void validarEdadNegativa(){
        assertThrows(Throwable.class, ()->new Estudiante("Luis",-1,"luis@mail.com"));
    }

    @Test
    public void validarCorreo(){
        assertThrows(Throwable.class, ()->new Estudiante("Maria", 22, "mariamail.com"));
    }
}