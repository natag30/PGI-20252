package co.edu.uniquindio.poo.gimnasiouqfit;

import co.edu.uniquindio.poo.gimnasiouqfit.model.Administrador;
import co.edu.uniquindio.poo.gimnasiouqfit.model.GimnasioUQ;
import co.edu.uniquindio.poo.gimnasiouqfit.model.Recepcionista;
import co.edu.uniquindio.poo.gimnasiouqfit.viewController.AdministradorViewController;
import co.edu.uniquindio.poo.gimnasiouqfit.viewController.InicioViewController;
import co.edu.uniquindio.poo.gimnasiouqfit.viewController.LoginViewController;
import co.edu.uniquindio.poo.gimnasiouqfit.viewController.RecepcionistaViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class GimnasioUQApplication extends Application {

    private Stage inicio;
    public static GimnasioUQ gimnasioUQ=new GimnasioUQ("Gimnasio UQ Fit", "Carrera 15 #12N, Armenia, Quindío",
            67359300, new Administrador("1094975918", "123456"), new Recepcionista());

    @Override
    public void start(Stage inicio) throws IOException {
        this.inicio=inicio;
        this.inicio.setTitle("Gestión Gimnasio UQ");
        openViewInicio();
    }

    public void openViewInicio() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GimnasioUQApplication.class.getResource("gimnasio_UQ.fxml"));
            javafx.scene.layout.VBox rootLayout = loader.load();
            InicioViewController inicioViewController = loader.getController();
            inicioViewController.setGimnasioUQApp(this);

            Scene scene = new Scene(rootLayout);

            inicio.setScene(scene);
            inicio.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void openViewLogin(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GimnasioUQApplication.class.getResource("Login.fxml"));
            javafx.scene.layout.VBox rootLayout = loader.load();
            LoginViewController loginViewController = loader.getController();
            loginViewController.setGimnasioUQApplication(this);

            Scene scene = new Scene(rootLayout);

            inicio.setScene(scene);
            inicio.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void openViewAdministrador(){
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GimnasioUQApplication.class.getResource("Administrador.fxml"));
            javafx.scene.layout.VBox rootLayout = loader.load();
            AdministradorViewController administradorViewController = loader.getController();
            administradorViewController.setGimnasioUQApplication(this);

            Scene scene = new Scene(rootLayout);

            inicio.setScene(scene);
            inicio.show();
            }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openViewRecepcionista(){
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GimnasioUQApplication.class.getResource("Recepcionista.fxml"));
            javafx.scene.layout.VBox rootLayout = loader.load();
            RecepcionistaViewController recepcionistaViewController = loader.getController();
            recepcionistaViewController.setGimnasioUQApp(this);

            Scene scene = new Scene(rootLayout);

            inicio.setScene(scene);
            inicio.show();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
