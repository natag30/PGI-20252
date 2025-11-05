package co.uniquindio.poo.model;

public class Bicicleta extends Vehiculo {

    private TipoBicicleta tipoBicicleta;
    private TamañoMarco tamañoMarco;


    public Bicicleta(String placa, int capacidad, String autonomia, String ubicacion, EstadoVehiculo estadoVehiculo, TipoBicicleta tipoBicicleta,
                     TamañoMarco tamañoMarco) {
        super(placa, capacidad, autonomia, ubicacion, estadoVehiculo);
        this.tipoBicicleta = tipoBicicleta;
        this.tamañoMarco = tamañoMarco;
    }
}
