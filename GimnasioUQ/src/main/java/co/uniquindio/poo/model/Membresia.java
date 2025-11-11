package co.uniquindio.poo.model;

public class Membresia {

    private double costo;
    private String fechaInicio;
    private String fechaFin;

    private TipoMembresia tipoMembresia;
    private EstadoMembresia estadoMembresia;
    private NivelMembresia nivelMembresia;

    public Membresia(double costo, String fechaInicio, String fechaFin, TipoMembresia tipoMembresia, EstadoMembresia estadoMembresia, NivelMembresia nivelMembresia) {
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoMembresia = tipoMembresia;
        this.estadoMembresia = estadoMembresia;
        this.nivelMembresia = nivelMembresia;
    }
}
y