package javafxbelajar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main Application Class untuk JavaFX dengan FXML
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load FXML file
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/javafxbelajar/view/login.fxml")
            );
            Parent root = loader.load();

            // Setup Scene
            Scene scene = new Scene(root, 400, 300);

            // Setup Stage
            primaryStage.setTitle("Form Login - JavaFX FXML");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error loading FXML: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
} 