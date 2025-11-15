module co.uniquindio.poo.uqfitjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens co.uniquindio.poo.uqfitjavafx to javafx.fxml;

    opens co.uniquindio.poo.viewController;
    exports co.uniquindio.poo.viewController;

    opens co.uniquindio.poo.model;
    exports co.uniquindio.poo.model;

}