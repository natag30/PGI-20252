package co.uniquindio.poo.model;

public class Ejercicios {
    private int id, series, repeticiones, descanso;
    private String nombre;

    private Rutina theRutina;

    public Ejercicios (int id, String nombre, int series, int repeticiones, int descanso, Rutina theRutina) {
        this.id = id;
        this.nombre = nombre;
        this.series = series;
        this.repeticiones = repeticiones;
        this.descanso = descanso;
        this.theRutina = theRutina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getDescanso() {
        return descanso;
    }

    public void setDescanso(int descanso) {
        this.descanso = descanso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rutina getTheRutina() {
        return theRutina;
    }

    public void setTheRutina(Rutina theRutina) {
        this.theRutina = theRutina;
    }

    @Override
    public String toString() {
        return "Ejercicios{" +
                "id=" + id +
                ", series=" + series +
                ", repeticiones=" + repeticiones +
                ", descanso=" + descanso +
                ", nombre='" + nombre + '\'' +
                ", theRutina=" + theRutina +
                '}';
    }
}
