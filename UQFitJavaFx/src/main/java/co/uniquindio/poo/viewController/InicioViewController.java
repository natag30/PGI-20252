package co.uniquindio.poo.viewController;

import co.uniquindio.poo.GimnasioUQApp;
import co.uniquindio.poo.controller.InicioController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InicioViewController {

    GimnasioUQApp gimnasioUQApp;

    @FXML
    private Button btnAcceder1;

    @FXML
    private Button btnAdministrador;

    @FXML
    void onAdministrador(ActionEvent event) {

    }

    @FXML
    void onRecepcionista(ActionEvent event) {

    }

    public void setGimnasioUQApp(GimnasioUQApp gimnasioUQApp) {
        this.gimnasioUQApp = gimnasioUQApp;
    }

}
