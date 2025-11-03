package co.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class OrdenServicio {
    private String fecha, descripcion;
    private double costoParcial, costoFinal;

    private Vehiculo thevehiculo;
    private List<DetalleOrden> listDetalleOrden;
    private List<Actividad> listActividadesPedido;

    public OrdenServicio(String fecha, String descripcion, double costoParcial, double costoFinal, Vehiculo thevehiculo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costoParcial = costoParcial;
        this.costoFinal = costoFinal;
        this.thevehiculo = thevehiculo;
        this.listDetalleOrden = new ArrayList<>();
        this.listActividadesPedido = new ArrayList<>();
    }


}
