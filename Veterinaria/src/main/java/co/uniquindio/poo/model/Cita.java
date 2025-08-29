package co.uniquindio.poo.model;

import java.util.Date;

public class Cita {
    private String fecha;
    private String hora;
    private String lugar;
    private int id;

    //Relaciones de asosiación
    private Mascota theMascota;
    private Veterinario theVeterinario;

    /**
     * Constructor de la clase Cita
     * @param fecha de la Cita
     * @param hora de la Cita
     * @param lugar de la Cita
     * @param id de la Cita
     * @param mascota que tiene la Cita
     * @param veterinario que atiende la Cita
     */

    //constructor
    public Cita(String fecha, String hora, String lugar, int id, Mascota mascota,  Veterinario veterinario) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.id = id;
        this.theMascota = mascota;
        this.theVeterinario = veterinario;
    }


    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", id=" + id +
                ", theMascota=" + theMascota +
                ", theVeterinario=" + theVeterinario +
                '}';
    }
}
