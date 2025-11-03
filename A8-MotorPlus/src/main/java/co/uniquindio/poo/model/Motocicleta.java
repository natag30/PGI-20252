package co.uniquindio.poo.model;

public class Motocicleta extends Vehiculo {

    private int cilindraje;

    private TipoMotocicleta tipoMotocicleta;

    public Motocicleta(String placa, String marca, int modelo, int año, Cliente theCliente, int cilindraje, TipoMotocicleta tipoMotocicleta) {
        super(placa, marca, modelo, año, theCliente);
        this.cilindraje = cilindraje;
        this.tipoMotocicleta = tipoMotocicleta;
    }
}
