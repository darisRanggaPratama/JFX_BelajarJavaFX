module javafxbelajar {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafxbelajar to javafx.fxml;
    opens javafxbelajar.controller to javafx.fxml;

    exports javafxbelajar;
    exports javafxbelajar.controller;
}