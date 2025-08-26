package co.uniquindio.poo.model;

import java.util.Date;

public class Cita {
    private Date fecha;
    private String lugar;
    private int id;

    public Cita(Date fecha, String lugar, int id) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.id = id;
    }
}
