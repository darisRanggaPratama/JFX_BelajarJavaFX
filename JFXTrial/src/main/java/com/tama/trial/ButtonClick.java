package com.tama.trial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ButtonClick extends Application {
    private int red;
    private int green;
    private int blue = 0;
    private Label rgbLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Canvas canvas = new Canvas(640, 480);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Button btnRed = new Button("Red");
        Button btnGreen = new Button("Green");
        Button btnBlue = new Button("Blue");
        Button btnReset = new Button("Reset");

        rgbLabel = new Label(getRGBText());
        rgbLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(btnRed, btnGreen, btnBlue, btnReset, rgbLabel);
        buttonBox.setStyle("-fx-alignment: center; -fx-padding: 10px;");

        root.setTop(canvas);
        root.setBottom(buttonBox);

        btnRed.setOnAction(event -> {
            red = Math.min(red + 50, 255);
            updateDisplay(gc);
        });
        btnGreen.setOnAction(event -> {
            green = Math.min(green + 50, 255);
            updateDisplay(gc);
        });
        btnBlue.setOnAction(event -> {
            blue = Math.min(blue + 50, 255);
            updateDisplay(gc);
        });
        btnReset.setOnAction(event -> {
            red = green = blue = 0;
            updateDisplay(gc);
        });

        // Membuat scene dan menampilkan stage
        Scene scene = new Scene(root);
        primaryStage.setTitle("Color Mixer");
        primaryStage.setScene(scene);
        primaryStage.show();

        drawCircle(gc);
    }

    private void drawCircle(GraphicsContext gc) {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        Color color = Color.rgb(red, green, blue);
        gc.setFill(color);
        double radius = 100;
        double x = (gc.getCanvas().getWidth() - radius * 2) / 2;
        double y = (gc.getCanvas().getHeight() - radius * 2) / 2;
        gc.fillOval(x, y, radius * 2, radius * 2);
    }

    private void updateDisplay(GraphicsContext gc) {
        drawCircle(gc);
        rgbLabel.setText(getRGBText());
    }

    private String getRGBText() {
        return String.format("Red: %d, Green: %d, Blue: %d", red, green, blue);
    }
}
