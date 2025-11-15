module co.uniquindio.poo.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.uniquindio.poo.demo to javafx.fxml;
    exports co.uniquindio.poo.demo;
}