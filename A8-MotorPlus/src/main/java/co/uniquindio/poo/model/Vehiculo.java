package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String placa, marca;
    private int modelo, año;

    private Cliente theCliente;
    private List<OrdenServicio> listOrdenServicioVehiculo;

    public Vehiculo(String placa, String marca, int modelo, int año, Cliente theCliente) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.theCliente = theCliente;
        this.listOrdenServicioVehiculo = new ArrayList<>();
    }


}
