package com.tama.trial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JustLabel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Application!");
        Label welcomeText = new Label();
        welcomeText.setText("New JavaFX Application!");
        // Center the label in the stage
        welcomeText.setTranslateX(320);
        welcomeText.setTranslateY(0);

        Scene scene = new Scene(welcomeText, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
