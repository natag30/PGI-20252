package co.edu.uniquindio.poo.gimnasiouqfit.viewController;

import co.edu.uniquindio.poo.gimnasiouqfit.controller.AdministradorController;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Entrenador;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;

public class AdministradorViewController {

    AdministradorController administradorController;
    ObservableList<Entrenador> listEntrenador;

    @FXML
    private Button btnActualizarEntrenador;

    @FXML
    private Button btnActualizarReporteAdministrador;

    @FXML
    private Button btnActualizarReporteAdministrador1;

    @FXML
    private Button btnAgregarEntrenador;

    @FXML
    private BarChart<?, ?> grafClases;

    @FXML
    private PieChart grafCupos;

    @FXML
    private BarChart<?, ?> grafMembresia;

    @FXML
    private ChoiceBox<?> selClase;

    @FXML
    private TableColumn<?, ?> tbcClases;

    @FXML
    private TableColumn<?, ?> tbcIdentificacion;

    @FXML
    private TableColumn<?, ?> tbcNombre;

    @FXML
    private TableView<?> tblListEntrenadores;

    @FXML
    private TextField txtCorreoEntrenador;

    @FXML
    private TextField txtIdEntrenador;

    @FXML
    private TextField txtNombreEntrenador;

    @FXML
    private TextField txtTelefonoEntrenador;

    @FXML
    void onActualizarEntrenador(ActionEvent event) {

    }

    @FXML
    void onActualizarReporteAdministrador(ActionEvent event) {

    }

    @FXML
    void onAgregarEntrenador(ActionEvent event) {

    }

}
