module com.tama.trial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.tama.trial to javafx.fxml;
    exports com.tama.trial;
}