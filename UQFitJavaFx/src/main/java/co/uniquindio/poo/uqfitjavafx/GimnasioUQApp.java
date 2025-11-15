package co.uniquindio.poo.uqfitjavafx;

import co.uniquindio.poo.uqfitjavafx.model.Administrador;
import co.uniquindio.poo.uqfitjavafx.model.GimnasioUQ;
import co.uniquindio.poo.uqfitjavafx.model.Recepcionista;
import co.uniquindio.poo.uqfitjavafx.viewController.InicioViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GimnasioUQApp extends Application {

    private Stage inicio;
    public static GimnasioUQ gimnasioUQ=new GimnasioUQ("Gimnasio UQ Fit", "Carrera 15 #12N, Armenia, Quindío", 67359300, new Administrador("1094975918", "1094975918"), new Recepcionista());

    @Override
    public void start(Stage inicio) throws IOException {
        this.inicio=inicio;
        this.inicio.setTitle("Gestión Gimnasio UQ");
        openViewInicio();
    }

    private void openViewInicio(){

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GimnasioUQApp.class.getResource("gimnasio_UQ.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            InicioViewController inicioViewController = loader.getController();
            inicioViewController.setGimnasioUQApp(this);

            Scene scene = new Scene(rootLayout);

            inicio.setScene(scene);
            inicio.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }





}
