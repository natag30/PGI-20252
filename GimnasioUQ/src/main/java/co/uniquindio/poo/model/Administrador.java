package co.uniquindio.poo.model;

public class Administrador implements IGestion{

    private String usuario;
    private String contraseña;

    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    @Override
    public void gestionEntrenador() {

    }

    @Override
    public void controlAcceso() {

    }
}
