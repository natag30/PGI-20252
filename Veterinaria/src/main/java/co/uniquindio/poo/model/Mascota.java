package co.uniquindio.poo.model;

public class Mascota {
    private String nombre, raza, color, tipo;
    private int id, edad;
    private Propietario propietario;

    public Mascota(String nombre, String raza, String color, int edad, int id, String tipo, Propietario propietario) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.id = id;
        this.tipo = tipo;
        this.propietario=propietario;
    }


}
