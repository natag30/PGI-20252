package co.edu.uniquindio.poo.gimnasiouqfit.viewController;

import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import co.edu.uniquindio.poo.gimnasiouqfit.controller.RecepcionistaController;
import co.edu.uniquindio.poo.gimnasiouqfit.model.NivelMembresia;
import co.edu.uniquindio.poo.gimnasiouqfit.model.TipoMembresia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;

public class RecepcionistaViewController {

    GimnasioUQApplication  gimnasioUQApplication;
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
    private Button btnVolverInicio;

    @FXML
    private DatePicker dateFin;

    @FXML
    private DatePicker dateInicio;

    @FXML
    private ChoiceBox<?> selClase;

    @FXML
    private ChoiceBox<?> selHorario;

    @FXML
    private ChoiceBox<NivelMembresia> selNivelMembresia;

    @FXML
    private ChoiceBox<TipoMembresia> selTipoMembresia;

    @FXML
    private ChoiceBox<String selTipoUsuario;

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
    private TextArea msgUsuario;

    @FXML
    private TextArea msgClase;

    @FXML
    private TextArea msgVerificar;

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
        String nombre = txtNombre.getText();
        int id = Integer.parseInt(txtId.getText());
        int telefono = Integer.parseInt(txtTelefono.getText());
        String correo = txtCorreo.getText();
        String direccion = txtDireccion.getText();
        String tipoUsuario = selTipoUsuario.getValue();
        TipoMembresia tipoMembresia = selTipoMembresia.getValue();
        NivelMembresia nivelMembresia = selNivelMembresia.getValue();
        LocalDate inicio = dateInicio.getValue();

        if (nombre.isEmpty() ||  correo.isEmpty() || direccion.isEmpty() || tipoUsuario == null || tipoMembresia == null || nivelMembresia == null || inicio == null) {
            msgUsuario.setText("Campos incompletos \n Por favor llena todos los campos");
            return;
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            msgUsuario.setText("Nombre inválido \n El nombre solo debe contener letras");
            return;
        }

        try {
            if (id <= 0) {
                msgUsuario.setText("ID inválido\nEl ID debe ser un número positivo");
                return;
            }
        } catch (NumberFormatException e) {
            msgUsuario.setText("ID inválido\nEl ID debe ser un número entero");
            return;
        }


        try {
            if (telefono <= 0) {
                msgUsuario.setText("Telefono inválido\nEl Telefono debe ser un número positivo");
                return;
            }
        } catch (NumberFormatException e) {
            msgUsuario.setText("Telefono inválido\nEl Telefono debe ser un número entero");
            return;
        }

        if (!correo.contains("@")) {
            msgUsuario.setText("Correo inválido\nEl correo debe contener un '@'");
            return;
        }

        boolean registrado = recepcionistaController.registrarUsuario(nombre, id, telefono, correo, direccion);

        if (registrado) {
            msgUsuario.setText("Éxito\nUsuario registrado correctamente");
        } else {
            msgUsuario.setText("Error\nEl usuario ya existe");
        }

    }

    @FXML
    void onReservar(ActionEvent event) {

    }

    @FXML
    void onVerificar(ActionEvent event) {

    }

    @FXML
    void onVolverInicio(ActionEvent event) {
        gimnasioUQApplication.openViewInicio();
    }

    public void setGimnasioUQApp(GimnasioUQApplication gimnasioUQApplication) {
        this.gimnasioUQApplication = gimnasioUQApplication;
    }
}
