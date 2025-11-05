package co.uniquindio.poo.model;

public abstract class Vehiculo {
    private String placa, autonomia, ubicacion;
    private int capacidad;

    private EstadoVehiculo estadoVehiculo;

    public Vehiculo(String placa, int capacidad, String autonomia, String ubicacion, EstadoVehiculo estadoVehiculo) {
        this.placa = placa;
        this.capacidad = capacidad;
        this.autonomia = autonomia;
        this.ubicacion = ubicacion;
        this.estadoVehiculo = estadoVehiculo;
    }

}
