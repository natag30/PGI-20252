package co.edu.uniquindio.poo.gimnasiouqfit.viewController;

import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import co.edu.uniquindio.poo.gimnasiouqfit.controller.AdministradorController;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Clase;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Entrenador;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;

import java.util.List;

public class AdministradorViewController {

    GimnasioUQApplication gimnasioUQApplication;
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
    private Button btnVolverInicio;

    @FXML
    private BarChart<String, Number> grafClases;

    @FXML
    private PieChart grafCupos;

    @FXML
    private BarChart<String, Number> grafMembresia;

    @FXML
    private ChoiceBox<Clase> selClase;

    @FXML
    private TableColumn<Entrenador, String> tbcClases;

    @FXML
    private TableColumn<Entrenador, Integer> tbcIdentificacion;

    @FXML
    private TableColumn<Entrenador, String> tbcNombre;

    @FXML
    private TableView<Entrenador> tblListEntrenadores;

    @FXML
    private TextField txtCorreoEntrenador;

    @FXML
    private TextField txtIdEntrenador;

    @FXML
    private TextField txtNombreEntrenador;

    @FXML
    private TextField txtTelefonoEntrenador;

    @FXML
    private TextField msgEntrenador;

    public void initialize() {
        administradorController = new AdministradorController(gimnasioUQApplication.gimnasioUQ.getTheAdministrador());

        selClase.setItems(FXCollections.observableArrayList(
                new Clase("Yoga", "Relajacion",  "Martes 8:00 a 9:00 a.m", 20),
                new Clase("Yoga", "Relajacion",  "Jueves 8:00 a 9:00 a.m", 20),
                new Clase("Spinning", "Cardio", "Lunes 5:00 a 6:00 p.m", 15),
                new Clase("Spinning", "Cardio", "Lunes 8:00 a 9:00 a.m", 15),
                new Clase("Boxeo", "Combate", "Miércoles 6:00 a 7:00 p.m", 10),
                new Clase("Boxeo", "Combate", "Viernes 6:00 a 7:00 p.m", 10)
        ));

        tbcNombre.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNombre()));
        tbcIdentificacion.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getId()).asObject());
        tbcClases.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getClasesComoTexto()));

        actualizarTabla();
    }


    @FXML
    void onActualizarEntrenador(ActionEvent event) {
        String nombre = txtNombreEntrenador.getText().trim();
        int id = Integer.parseInt(txtIdEntrenador.getText());
        int telefono = Integer.parseInt(txtTelefonoEntrenador.getText());
        String correo = txtCorreoEntrenador.getText().trim();

        boolean actualizado = administradorController.actualizarEntrenador(id, nombre, telefono, correo);
        if (actualizado) {
            msgEntrenador.setText("Actualizado \n Entrenador modificado correctamente");
            actualizarTabla();
        } else {
            msgEntrenador.setText("Error \n No se encontró el entrenador");
        }

    }

    @FXML
    void onActualizarReporteAdministrador(ActionEvent event) {
        // Pie chart: asistencia
        grafCupos.setData(administradorController.obtenerDatosAsistenciaClases());

        // Bar chart: usuarios por membresía
        grafMembresia.getData().clear();
        grafMembresia.getData().add(administradorController.obtenerDatosUsuariosPorMembresia());

        // Bar chart: clases más populares
        grafClases.getData().clear();
        grafClases.getData().add(administradorController.obtenerDatosClasesPopulares());
    }


    @FXML
    void onAgregarEntrenador(ActionEvent event) {
        String nombre = txtNombreEntrenador.getText().trim();
        int id = Integer.parseInt(txtIdEntrenador.getText());
        int telefono = Integer.parseInt(txtTelefonoEntrenador.getText());
        String correo = txtCorreoEntrenador.getText().trim();
        Clase clase = selClase.getValue();

        if (nombre.isEmpty() || correo.isEmpty() || clase == null) {
            msgEntrenador.setText("Campos incompletos \n Por favor llena todos los campos");
            return;
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            msgEntrenador.setText("Nombre inválido \n El nombre solo debe contener letras");
            return;
        }

        try {
            if (id <= 0) {
                msgEntrenador.setText("ID inválido\nEl ID debe ser un número positivo");
                return;
            }
        } catch (NumberFormatException e) {
            msgEntrenador.setText("ID inválido\nEl ID debe ser un número entero");
            return;
        }


        try {
            if (telefono <= 0) {
                msgEntrenador.setText("Telefono inválido\nEl Telefono debe ser un número positivo");
                return;
            }
        } catch (NumberFormatException e) {
            msgEntrenador.setText("Telefono inválido\nEl Telefono debe ser un número entero");
            return;
        }

        if (!correo.contains("@")) {
            msgEntrenador.setText("Correo inválido\nEl correo debe contener un '@'");
            return;
        }

        boolean agregado = administradorController.agregarEntrenador(nombre, id, telefono, correo, clase);
        if (agregado) {
            msgEntrenador.setText("Éxito \n Entrenador agregado correctamente");
            actualizarTabla();
        } else {
            msgEntrenador.setText("Error \n Ya existe un entrenador con ese ID");
        }

    }

    private void actualizarTabla() {
        List<Entrenador> lista = administradorController.obtenerEntrenadores();
        tblListEntrenadores.getItems().setAll(lista);
    }


    @FXML
    void onVolverInicio(ActionEvent event) {
        gimnasioUQApplication.openViewInicio();
    }

    public void setGimnasioUQApplication(GimnasioUQApplication gimnasioUQApplication) {
        this.gimnasioUQApplication = gimnasioUQApplication;
    }

}
