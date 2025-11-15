package co.uniquindio.poo.uqfitjavafx.model;

import java.util.ArrayList;
import java.util.List;

public class Membresia {

    private double costo;
    private String fechaInicio;
    private String fechaFin;

    private TipoMembresia tipoMembresia;
    private EstadoMembresia estadoMembresia;
    private NivelMembresia nivelMembresia;

    private List<Usuario> listUsuariosMembresia;
    private Recepcionista theRecepcionista;

    public Membresia(double costo, String fechaInicio, String fechaFin, TipoMembresia tipoMembresia, EstadoMembresia estadoMembresia, NivelMembresia nivelMembresia, Recepcionista theRecepcionista) {
        this.costo = calcularCosto();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoMembresia = tipoMembresia;
        this.estadoMembresia = estadoMembresia;
        this.nivelMembresia = nivelMembresia;
        this.listUsuariosMembresia = new ArrayList<>();
        this.theRecepcionista = theRecepcionista;
    }

    public double calcularCosto() {
        return  costo;
    }

}
