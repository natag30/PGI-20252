package co.uniquindio.poo.model;

public class Repuesto {
    private String nombre;
    private int referencia;
    private double costo;

    private Categoria categoria;

    public Repuesto(String nombre, int referencia, double costo, Categoria categoria){
        this.nombre = nombre;
        this.referencia = referencia;
        this.costo = costo;
        this.categoria = categoria;
    }

}
