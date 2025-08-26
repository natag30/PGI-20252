package co.uniquindio.poo.model;

import java.util.Date;

public class Cita {
    private Date fecha;
    private String lugar;
    private int id;
    private Veterinario veterinario;
    private Mascota mascota;

    public Cita(Date fecha, String lugar, int id,  Veterinario veterinario, Mascota mascota) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.id = id;
        this.veterinario = veterinario;
        this.mascota = mascota;
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
                ", mascota=" + mascota +
                '}';
    }
}
