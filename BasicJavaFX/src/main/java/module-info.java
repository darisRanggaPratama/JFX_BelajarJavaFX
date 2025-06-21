module com.tama.basicjfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.tama.basicjfx to javafx.fxml;
    exports com.tama.basicjfx;
    exports com.tama.basicjfx.controller;
    opens com.tama.basicjfx.controller to javafx.fxml;
}