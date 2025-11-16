package co.edu.uniquindio.poo.gimnasiouqfit.controller;

import co.edu.uniquindio.poo.gimnasiouqfit.model.Recepcionista;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Usuario;

public class RecepcionistaController {

    private Recepcionista recepcionista;

    public RecepcionistaController(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public boolean registrarUsuario(String nombre, int id, int telefono, String correo, String direccion) {
        Usuario nuevo = switch (tipoUsuario);
    }

    public double calcularCostoFinal (Usuario usuario){
        double descuento = usuario.getDescuento();
        return calcularCosto() * (1.0 - descuento);
    }

}
