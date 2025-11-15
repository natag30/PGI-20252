package co.edu.uniquindio.poo.gimnasiouqfit.viewController;

import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InicioViewController {

    GimnasioUQApplication gimnasioUQApp;

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

    public void setGimnasioUQApp(GimnasioUQApplication gimnasioUQApp) {
        this.gimnasioUQApp = gimnasioUQApp;
    }

}
