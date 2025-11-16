package co.edu.uniquindio.poo.gimnasiouqfit.viewController;

import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InicioViewController {

    GimnasioUQApplication gimnasioUQApplication;

    @FXML
    private Button btnAcceder1;

    @FXML
    private Button btnAdministrador;

    @FXML
    void onAdministrador(ActionEvent event) {
        gimnasioUQApplication.openViewLogin();
    }

    @FXML
    void onRecepcionista(ActionEvent event) {
        gimnasioUQApplication.openViewRecepcionista();
    }

    public void setGimnasioUQApp(GimnasioUQApplication gimnasioUQApplication) {
        this.gimnasioUQApplication = gimnasioUQApplication;
    }

    @FXML
    void initialize() {

    }
}

