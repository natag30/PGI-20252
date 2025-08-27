package co.uniquindio.poo.model;

import java.util.Date;

public class Cita {
    private String fecha;
    private String hora;
    private String lugar;
    private int id;
    private Veterinario veterinario;
    private Mascota mascota;
    private Propietario propietario;


    public Cita(String fecha, String hora, String lugar, int id,  Veterinario veterinario, Mascota mascota, Propietario propietario) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.id = id;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.propietario = propietario;
    }


    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", id=" + id +
                ", veterinario=" + veterinario +
                ", mascota=" + mascota +
                ", propietario=" + propietario +
                '}';
    }
}
