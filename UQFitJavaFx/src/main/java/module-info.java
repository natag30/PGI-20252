module co.uniquindio.poo.uqfitjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.uniquindio.poo.uqfitjavafx to javafx.fxml;
    exports co.uniquindio.poo.uqfitjavafx;
}