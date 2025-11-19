package co.edu.uniquindio.poo.gimnasiouqfit.model;

import java.util.*;

public class Recepcionista implements IGestion{

    private Map<Integer, Usuario> listUsuariosRecepcionista = new HashMap<>();

    public boolean registrarUsuario(Usuario usuario){
        if (listUsuariosRecepcionista.containsKey(usuario.getId())){
            return false;
        }else {
            listUsuariosRecepcionista.put(usuario.getId(), usuario);
            return true;
        }
    }

    /**
     * Metodo que permite eliminar un usuario del Gimnasio
     * @param id
     * @return
     */
    public boolean eliminarUsuario(int id) {
        return listUsuariosRecepcionista.remove(id) != null;
    }


    /**
     * Metodo para asignar una clase a un usuario
     * @param clase
     */
    public boolean asignarClase(int id, Clase clase){
        Usuario usuario = listUsuariosRecepcionista.get(id);
        if (usuario == null) return false;
        usuario.reservarClase(clase);
        return true;
    }

    /**
     * Metodo para controlar el acceso de los usuarios al gimnasio
     * @param id
     * @return
     */
    public boolean controlAccesoUsuario(int id){
        Usuario usuario = listUsuariosRecepcionista.get(id);
        return usuario != null && usuario.getMembresia() != null && usuario.getMembresia().isActiva();

    }

    public Collection<Usuario> getUsuarios() {
        return listUsuariosRecepcionista.values();
    }


    @Override
    public void generarReporte() {

    }
}
