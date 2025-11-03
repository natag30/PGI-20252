package co.uniquindio.poo.model;

import java.util.ArrayList;

public class DetalleOrden {
    private int id, cantidad;

    private Repuesto theRepuesto;

    public DetalleOrden(int id, int cantidad, Repuesto theRepuesto) {
        this.id = id;
        this.cantidad = cantidad;
        this.theRepuesto = theRepuesto;
    }

}
