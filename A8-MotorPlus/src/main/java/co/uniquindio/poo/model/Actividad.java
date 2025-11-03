package co.uniquindio.poo.model;

public class Actividad {
    private String fecha, descripcion;
    private int id;

    private Tecnico theTecnico;
    private OrdenServicio theOrdenServicio;
    private EstadoActividad estadoActividad;

    public Actividad(String fecha, int id, String descripcion, Tecnico theTecnico, OrdenServicio theOrdenServicio, EstadoActividad estadoActividad) {
        this.fecha = fecha;
        this.id = id;
        this.descripcion = descripcion;
        this.theTecnico = theTecnico;
        this.theOrdenServicio = theOrdenServicio;
        this.estadoActividad = estadoActividad;
    }

}
