package co.uniquindio.poo.model;

public class Automovil_Camioneta extends Vehiculo {
    private int numPuertas;
    private TipoTransmision tipoTransmision;

    public Automovil_Camioneta(String placa, String marca, int modelo, int año, Cliente theCliente, int numPuertas, TipoTransmision tipoTransmision) {
        super(placa, marca, modelo, año, theCliente);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
    }
}
