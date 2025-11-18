package co.edu.uniquindio.poo.gimnasiouqfit.controller;

import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Administrador;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Clase;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Entrenador;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdministradorController {

    Administrador administrador;

    public AdministradorController(Administrador administrador) {
        this.administrador = administrador;
    }

    public boolean agregarEntrenador(String nombre, int id, int telefono, String correo, Clase clase) {
        Entrenador nuevo = new Entrenador(nombre, id, telefono, correo, clase);
        return administrador.registrarEntrenador(nuevo);
    }

    public boolean actualizarEntrenador(int id, String nombre, int telefono, String correo) {
        Entrenador actualizado = new Entrenador(nombre, id, telefono, correo);
        return administrador.actualizarEntrenador(id, actualizado);
    }


    public boolean eliminarEntrenador(Entrenador entrenador) {
        return administrador.eliminarEntrenador(entrenador);
    }

    public List<Entrenador> obtenerEntrenadores() {
        return new ArrayList<>(administrador.getEntrenadores());
    }


    public ObservableList<PieChart.Data> obtenerDatosAsistenciaClases() {
        ObservableList<PieChart.Data> datos = FXCollections.observableArrayList();
        for (Clase clase : GimnasioUQApplication.gimnasioUQ.getListClases()) {
            datos.add(new PieChart.Data(clase.getNombre(), clase.getListUsuariosClase().size()));
        }
        return datos;
    }

    public XYChart.Series<String, Number> obtenerDatosUsuariosPorMembresia() {
        Map<String, Integer> conteo = new HashMap<>();
        for (Usuario u : GimnasioUQApplication.gimnasioUQ.getListUsuarios()) {
            String tipo = String.valueOf(u.getMembresia().getTipoMembresia());
            conteo.put(tipo, conteo.getOrDefault(tipo, 0) + 1);
        }

        XYChart.Series<String, Number> serie = new XYChart.Series<>();
        conteo.forEach((tipo, cantidad) -> serie.getData().add(new XYChart.Data<>(tipo, cantidad)));
        return serie;

    }

    public XYChart.Series<String, Number> obtenerDatosClasesPopulares() {
        XYChart.Series<String, Number> serie = new XYChart.Series<>();
        for (Clase clase : GimnasioUQApplication.gimnasioUQ.getListClases()) {
            serie.getData().add(new XYChart.Data<>(clase.getNombre(), clase.getListUsuariosClase().size()));
        }
        return serie;
    }

}
