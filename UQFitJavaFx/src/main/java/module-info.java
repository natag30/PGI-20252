module co.uniquindio.poo.uqfitjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.uniquindio.poo.uqfitjavafx to javafx.fxml;
    exports co.uniquindio.poo.uqfitjavafx;

    opens co.uniquindio.poo.controller;
    exports co.uniquindio.poo.controller;

    opens co.uniquindio.poo.model;
    exports co.uniquindio.poo.model;
}