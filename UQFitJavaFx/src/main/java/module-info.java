module co.uniquindio.poo.uqfitjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.graphics;

    opens co.uniquindio.poo.uqfitjavafx.uqfitjavafx to javafx.fxml;

    opens co.uniquindio.poo.uqfitjavafx.viewController;
    exports co.uniquindio.poo.uqfitjavafx.viewController;

    opens co.uniquindio.poo.uqfitjavafx.model;
    exports co.uniquindio.poo.uqfitjavafx.model;

}