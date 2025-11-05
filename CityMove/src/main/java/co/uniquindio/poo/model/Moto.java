package co.uniquindio.poo.model;

public class Moto extends Vehiculo implements IAlquiler {

    private double cilindraje;
    private boolean cascoIncluido;
    private int TARIFA_BASE_MOTO = 1000;

    private TipoTransmision tipoTransmision;

    public Moto(String placa, int capacidad, String autonomia, String ubicacion, EstadoVehiculo estadoVehiculo,
                double cilindraje, boolean cascoIncluido, TipoTransmision tipoTransmision) {
        super(placa, capacidad, autonomia, ubicacion, estadoVehiculo);
        this.cilindraje = cilindraje;
        this.cascoIncluido = false;
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public double calcularCostoAlquiler() {
        return TARIFA_BASE_MOTO * 10;
    }
}
