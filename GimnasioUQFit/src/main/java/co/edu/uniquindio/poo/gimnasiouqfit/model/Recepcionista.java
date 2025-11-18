package co.edu.uniquindio.poo.gimnasiouqfit.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public boolean modificarUsuario(int id, Usuario actualizado) {
        if (!listUsuariosRecepcionista.containsKey(id)){
            return false;
        }else {
            listUsuariosRecepcionista.put(id, actualizado);
            return true;
        }
    }

    public boolean eliminarUsuario(int id) {
        return listUsuariosRecepcionista.remove(id) != null;
    }

    public Usuario obtenerUsuario(int id) {
        return listUsuariosRecepcionista.get(id);
    }


    /**
     * Metodo para agregar una clase en el gimnasio
     * @param clase
     */
    public boolean asignarClase(int id, Clase clase){
        Usuario usuario = listUsuariosRecepcionista.get(id);
        if (usuario == null) return false;
        usuario.reservarClase(clase);
        return true;
    }

    public boolean registrarMembresia(int id, Membresia membresia){
        Usuario usuario = listUsuariosRecepcionista.get(id);
        if (usuario == null) return false;
        usuario.setMembresia(membresia);
        return true;
    }

    public boolean controlAccesoUsuario(int id){
        Usuario usuario = listUsuariosRecepcionista.get(id);
        return usuario != null && usuario.getMembresia() != null && usuario.getMembresia().isActiva();

    }


    @Override
    public void generarReporte() {

    }
}
