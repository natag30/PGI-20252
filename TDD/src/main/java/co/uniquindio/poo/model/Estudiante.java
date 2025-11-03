package co.uniquindio.poo.model;

public class Estudiante {

    private String nombre;
    private int edad;
    private String correo;

    public Estudiante(String nombre, int edad, String correo){
        if(edad<0){
            throw new IllegalArgumentException();
        }
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
    }
}
