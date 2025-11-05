package co.uniquindio.poo.model;

public class Auto extends Vehiculo implements IAlquiler{

    private int numPuerta;
    private int TARIFA_BASE_AUTO = 1500;

    private EstadoCombustible estadoCombustible;
    private NivelConfort nivelConfort;


    public Auto(String placa, int capacidad, String autonomia, String ubicacion, EstadoVehiculo estadoVehiculo,
                int numPuerta, EstadoCombustible estadoCombustible, NivelConfort nivelConfort){
        super(placa, capacidad, autonomia, ubicacion, estadoVehiculo);
        this.numPuerta = numPuerta;
        this.estadoCombustible = estadoCombustible;
        this.nivelConfort = nivelConfort;
    }


    @Override
    public double calcularCostoAlquiler() {
        return TARIFA_BASE_AUTO * 10;
    }
}
