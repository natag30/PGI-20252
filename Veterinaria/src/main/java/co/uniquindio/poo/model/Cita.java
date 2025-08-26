package co.uniquindio.poo.model;

import java.util.Date;

public class Cita {
    private Date fecha;
    private String lugar;
    private int id;
    private Veterinario veterinario;


    public Cita(Date fecha, String lugar, int id,  Veterinario veterinario) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.id = id;
        this.veterinario = veterinario;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", lugar='" + lugar + '\'' +
                ", id=" + id +
                ", veterinario=" + veterinario +
                '}';
    }
}
