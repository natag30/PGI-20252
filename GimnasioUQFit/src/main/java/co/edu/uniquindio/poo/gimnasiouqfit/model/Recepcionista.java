package co.edu.uniquindio.poo.gimnasiouqfit.model;

import java.util.ArrayList;
import java.util.List;

public class Recepcionista implements IGestion{

    private List<Usuario> listUsuariosRecepcionista;
    private List<Clase> listClasesRecepcionista;
    private List<Membresia> listMembresiasRecepcionista;


    public Recepcionista() {
        listUsuariosRecepcionista = new ArrayList<>();
        listClasesRecepcionista = new ArrayList<>();
        listMembresiasRecepcionista = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario){
        listUsuariosRecepcionista.add(usuario);
        System.out.println("Usuario registrado");
    }

    /**
     * Metodo para agregar una clase en el gimnasio
     * @param clase
     */
    public void registrarClase(Clase clase){
        listClasesRecepcionista.add(clase);
        System.out.println("Clase registrada");
    }

    public void registrarMembresia(Membresia membresia){

        listMembresiasRecepcionista.add(membresia);
    }

    public boolean controlAccesoUsuario(int id){
        boolean bandera = false;
        for(Usuario usuario : listUsuariosRecepcionista){
            if(usuario.getId() == id){
                bandera = true;
                System.out.println("Usuario acceso con el id " + id);
                break;
            }
        }
        return bandera;
    }


    @Override
    public void generarReporte() {

    }
}
