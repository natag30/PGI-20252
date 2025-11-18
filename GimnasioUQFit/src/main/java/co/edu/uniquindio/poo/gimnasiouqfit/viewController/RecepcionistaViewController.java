package co.edu.uniquindio.poo.gimnasiouqfit.viewController;

import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import co.edu.uniquindio.poo.gimnasiouqfit.controller.RecepcionistaController;
import co.edu.uniquindio.poo.gimnasiouqfit.model.*;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
    private TextArea msgClase;

    @FXML
    private TextArea msgUsuario;

    @FXML
    private TextArea msgVerificar;

    @FXML
    private ChoiceBox<Clase> selClase;

    @FXML
    private ChoiceBox<?> selHorario;

    @FXML
    private ChoiceBox<NivelMembresia> selNivelMembresia;

    @FXML
    private ChoiceBox<TipoMembresia> selTipoMembresia;

    @FXML
    private ChoiceBox<String> selTipoUsuario;

    @FXML
    private TableColumn<Clase, String> tbcCupos;

    @FXML
    private TableColumn<?, ?> tbcFechaFin;

    @FXML
    private TableColumn<?, ?> tbcFechaInicio;

    @FXML
    private TableColumn<Usuario, Integer> tbcId;

    @FXML
    private TableColumn<?, ?> tbcIdMembresia;

    @FXML
    private TableColumn<Usuario, String> tbcNombre;

    @FXML
    private TableColumn<Clase, String> tbcNombreClase;

    @FXML
    private TableColumn<?, ?> tbcNombreMembresia;

    @FXML
    private TableColumn<Clase, String> tbcTipoClase;

    @FXML
    private TableColumn<Usuario, TipoMembresia> tbcTipoMembresia;

    @FXML
    private TableColumn<?, ?> tbcTipoMembresia1;

    @FXML
    private TableColumn<?, ?> tbcTipoUsuarioMembresia;

    @FXML
    private TableColumn<Usuario, LocalDate> tbcFecha;

    @FXML
    private TableView<Clase> tblListClases;

    @FXML
    private TableView<?> tblListMembresia;

    @FXML
    private TableView<Usuario> tblListUsuarios;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtCosto;

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

    public void initialize(){
        recepcionistaController = new RecepcionistaController(GimnasioUQApplication.gimnasioUQ.getTheRecepcionista());
        selTipoUsuario.getItems().addAll("Estudiante", "Trabajador UQ", "Externo");
        selTipoMembresia.getItems().addAll(TipoMembresia.values());
        selNivelMembresia.getItems().addAll(NivelMembresia.values());

        selTipoMembresia.setOnAction(e -> actualizarCosto());
        selNivelMembresia.setOnAction(e -> actualizarCosto());
        selTipoUsuario.setOnAction(e -> actualizarCosto());
        selTipoMembresia.setOnAction(e -> actualizarFechaFin());
        dateInicio.setOnAction(e -> actualizarFechaFin());

        List<Clase> listClases = List.of(
                new Clase("Yoga", "Relajacion",  "Martes 8:00 a 9:00 a.m", 20),
                new Clase("Yoga", "Relajacion",  "Jueves 8:00 a 9:00 a.m", 20),
                new Clase("Spinning", "Cardio", "Lunes 5:00 a 6:00 p.m", 15),
                new Clase("Spinning", "Cardio", "Lunes 8:00 a 9:00 a.m", 15),
                new Clase("Boxeo", "Combate", "Miércoles 6:00 a 7:00 p.m", 10),
                new Clase("Boxeo", "Combate", "Viernes 6:00 a 7:00 p.m", 10)
        );
        selClase.getItems().addAll(listClases);

        tbcNombre.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNombre()));
        tbcId.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getId()).asObject());

        tbcTipoMembresia.setCellValueFactory(data -> {
            Membresia m = data.getValue().getMembresia();
            return new SimpleObjectProperty<>(m != null ? m.getTipoMembresia() : null);
        });

        tbcFecha.setCellValueFactory(data -> {
            Membresia m = data.getValue().getMembresia();
            return new SimpleObjectProperty<>(m != null ? m.getFechaFin() : null);
        });

        tbcNombreClase.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNombre()));
        tbcTipoClase.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTipo()));
        tbcCupos.setCellValueFactory(data -> {
            Clase clase = data.getValue();
            String texto = clase.getListUsuariosClase().size() + " / " + clase.getCupoMax();
            return new SimpleStringProperty(texto);
        });

    }

    private void actualizarCosto() {
        String tipoUsuario = selTipoUsuario.getValue();
        TipoMembresia tipoMembresia = selTipoMembresia.getValue();
        NivelMembresia nivelMembresia = selNivelMembresia.getValue();

        if (tipoUsuario == null || tipoMembresia == null || nivelMembresia == null) {
            txtCosto.setText("—");
            return;
        }

        EstadoMembresia estadoMembresia = EstadoMembresia.ACTIVA;

        Membresia membresia = new Membresia(LocalDate.now(), LocalDate.now(),tipoMembresia, estadoMembresia, nivelMembresia, GimnasioUQApplication.gimnasioUQ.getTheRecepcionista());

        Usuario temp = switch (tipoUsuario) {
            case "Estudiante" -> new Estudiante("", 0, 0, "", "", membresia);
            case "Trabajador UQ" -> new Trabajador("", 0, 0, "", "", membresia);
            case "Externo" -> new Externo("", 0, 0, "", "", membresia);
            default -> null;
        };

        if (temp == null) return;

        double costoFinal = membresia.calcularCostoFinal(temp);

        txtCosto.setText(String.format("$ %.2f", costoFinal));
    }

    private void actualizarFechaFin() {
        TipoMembresia tipo = selTipoMembresia.getValue();
        LocalDate inicio = dateInicio.getValue();

        if (tipo == null || inicio == null) {
            dateFin.setValue(null);
            return;
        }

        LocalDate fechaFin = switch (tipo) {
            case MENSUAL -> inicio.plusMonths(1);
            case TRIMESTRAL -> inicio.plusMonths(3);
            case ANUAL -> inicio.plusYears(1);
        };


        dateFin.setValue(fechaFin);
    }


        @FXML
    void onActualizarClases(ActionEvent event) {
        Collection<Clase> listaClases = recepcionistaController.obtenerListaClases();
        tblListClases.getItems().setAll(listaClases);
    }

    @FXML
    void onActualizarMembresias(ActionEvent event) {

    }

    @FXML
    void onActualizarUsuarios(ActionEvent event) {
        Collection<Usuario> listaUsuarios = recepcionistaController.obtenerListaUsuarios();
        List<Usuario> usuariosActivos = listaUsuarios.stream()
                .filter(u -> u.getMembresia() != null && u.getMembresia().isActiva())
                .toList();

        tblListUsuarios.getItems().setAll(usuariosActivos);
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

        boolean registrado = recepcionistaController.registrarUsuario(nombre, id, telefono, correo, direccion, tipoUsuario, nivelMembresia, tipoMembresia, inicio);

        if (registrado) {
            msgUsuario.setText("Éxito\nUsuario registrado correctamente");
        } else {
            msgUsuario.setText("Error\nEl usuario ya existe");
        }

    }

    @FXML
    void onReservar(ActionEvent event) {
        int id = Integer.parseInt(txtIdReservar.getText());
        Clase claseSeleccionada = selClase.getValue();
        recepcionistaController.asignarClaseUsuario(id, claseSeleccionada);
        msgClase.setText("Clase" + claseSeleccionada.toString() + " reservada correctamente");
    }

    @FXML
    void onVerificar(ActionEvent event) {
        int id = Integer.parseInt(txtIdVerificar.getText());
        recepcionistaController.validarIngreso(id);
    }

    @FXML
    void onVolverInicio(ActionEvent event) {
        gimnasioUQApplication.openViewInicio();
    }

    public void setGimnasioUQApp(GimnasioUQApplication gimnasioUQApplication) {
        this.gimnasioUQApplication = gimnasioUQApplication;
    }


}
