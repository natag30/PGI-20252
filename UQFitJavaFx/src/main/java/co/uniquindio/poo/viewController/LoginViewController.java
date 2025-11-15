package co.uniquindio.poo.viewController;

import co.uniquindio.poo.controller.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewController {

    LoginController loginController;

    @FXML
    private Button btnAcceder;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtUsuario;

    @FXML
    void onAcceder(ActionEvent event) {

    }

}
