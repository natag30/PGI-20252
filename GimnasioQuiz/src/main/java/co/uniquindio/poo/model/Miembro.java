package co.uniquindio.poo.model;

public class Miembro {

    private int id, documento;
    private String nombre, vencimientoPlan;

    private TipoMembresia tipoMembresia;
    private Rutina theRutina;
    private Entrenador theEntrenador;

    public Miembro(int id, String nombre, int documento, String vencimientoPlan, TipoMembresia tipoMembresia, Rutina theRutina, Entrenador theEntrenador) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.vencimientoPlan = vencimientoPlan;
        this.tipoMembresia = tipoMembresia;
        this.theRutina = theRutina;
        this.theEntrenador = theEntrenador;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVencimientoPlan() {
        return vencimientoPlan;
    }

    public void setVencimientoPlan(String vencimientoPlan) {
        this.vencimientoPlan = vencimientoPlan;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public Rutina getTheRutina() {
        return theRutina;
    }

    public void setTheRutina(Rutina theRutina) {
        this.theRutina = theRutina;
    }

    public Entrenador getTheEntrenador() {
        return theEntrenador;
    }

    public void setTheEntrenador(Entrenador theEntrenador) {
        this.theEntrenador = theEntrenador;
    }

    @Override
    public String toString() {
        return "Miembro{" +
                "id=" + id +
                ", documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", vencimientoPlan='" + vencimientoPlan + '\'' +
                ", tipoMembresia=" + tipoMembresia +
                ", theRutina=" + theRutina +
                ", theEntrenador=" + theEntrenador +
                '}';
    }
}
