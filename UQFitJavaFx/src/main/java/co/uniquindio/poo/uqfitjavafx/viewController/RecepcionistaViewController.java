package co.uniquindio.poo.uqfitjavafx.viewController;

import co.uniquindio.poo.uqfitjavafx.controller.RecepcionistaController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RecepcionistaViewController {

    RecepcionistaController recepcionistaController;

    @FXML
    private Button btnActualizarClases;

    @FXML
    private Button btnActualizarMembresias;

    @FXML
    private Button btnActualizarUsuario;

    @FXML
    private Button btnActualizarUsuarios;

    @FXML
    private Button btnAgregarUsuario;

    @FXML
    private Button btnReservar;

    @FXML
    private Button btnVerificar;

    @FXML
    private DatePicker dateFin;

    @FXML
    private DatePicker dateInicio;

    @FXML
    private ChoiceBox<?> selClase;

    @FXML
    private ChoiceBox<?> selHorario;

    @FXML
    private ChoiceBox<?> selNivelMembresia;

    @FXML
    private ChoiceBox<?> selTipoMembresia;

    @FXML
    private ChoiceBox<?> selTipoUsuario;

    @FXML
    private TableColumn<?, ?> tbcCupos;

    @FXML
    private TableColumn<?, ?> tbcFechaFin;

    @FXML
    private TableColumn<?, ?> tbcFechaInicio;

    @FXML
    private TableColumn<?, ?> tbcId;

    @FXML
    private TableColumn<?, ?> tbcIdMembresia;

    @FXML
    private TableColumn<?, ?> tbcNombre;

    @FXML
    private TableColumn<?, ?> tbcNombreClase;

    @FXML
    private TableColumn<?, ?> tbcNombreMembresia;

    @FXML
    private TableColumn<?, ?> tbcTipoClase;

    @FXML
    private TableColumn<?, ?> tbcTipoMembresia;

    @FXML
    private TableColumn<?, ?> tbcTipoMembresia1;

    @FXML
    private TableColumn<?, ?> tbcTipoUsuarioMembresia;

    @FXML
    private TableColumn<?, ?> tbcUsuario;

    @FXML
    private TableView<?> tblListClases;

    @FXML
    private TableView<?> tblListMembresia;

    @FXML
    private TableView<?> tblListUsuarios;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtIdReservar;

    @FXML
    private TextField txtIdVerificar;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    void onActualizarClases(ActionEvent event) {

    }

    @FXML
    void onActualizarMembresias(ActionEvent event) {

    }

    @FXML
    void onActualizarUsuario(ActionEvent event) {

    }

    @FXML
    void onActualizarUsuarios(ActionEvent event) {

    }

    @FXML
    void onAgregarUsuario(ActionEvent event) {



    }

    @FXML
    void onReservar(ActionEvent event) {

    }

    @FXML
    void onVerificar(ActionEvent event) {

    }

}
