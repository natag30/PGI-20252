package co.edu.uniquindio.poo.gimnasiouqfit.viewController;

import co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication;
import co.edu.uniquindio.poo.gimnasiouqfit.controller.LoginController;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Administrador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static co.edu.uniquindio.poo.gimnasiouqfit.GimnasioUQApplication.gimnasioUQ;

public class LoginViewController {

    GimnasioUQApplication gimnasioUQApplication;
    LoginController loginController;


    @FXML
    private Button btnAcceder;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField msgLogin;

    @FXML
    void initialize() {
        loginController = new LoginController(gimnasioUQApplication.gimnasioUQ.getTheAdministrador());
    }

    @FXML
    void onAcceder(ActionEvent event) {
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();

        boolean acceso = loginController.verificarAcceso(usuario,contraseña);
        if(acceso) {
            gimnasioUQApplication.openViewAdministrador();
        }else{
            msgLogin.setText("Acceso no valido");
        }
    }

    public void setGimnasioUQApplication(GimnasioUQApplication gimnasioUQApplication) {
        this.gimnasioUQApplication = gimnasioUQApplication;
    }

}
