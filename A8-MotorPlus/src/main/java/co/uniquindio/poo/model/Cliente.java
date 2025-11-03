package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{

    private List<Vehiculo> listVehiculosCliente;

    public Cliente(String nombre, int cedula, int telefono, String correo){
        super(nombre, cedula, telefono, correo);
        this.listVehiculosCliente = new ArrayList<>();
    }


}
