package javafxbelajar.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * Controller untuk Login Form
 */
public class LoginController {

    @FXML
    private TextField namaTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label messageLabel;

    /**
     * Method ini dipanggil otomatis setelah FXML di-load
     */
    @FXML
    public void initialize() {
        System.out.println("LoginController initialized");
        messageLabel.setText("");
    }

    /**
     * Handle event ketika button Login diklik
     */
    @FXML
    private void handleLoginButton() {
        String nama = namaTextField.getText();
        String password = passwordField.getText();

        // Validasi input
        if (nama.isEmpty() || password.isEmpty()) {
            messageLabel.setTextFill(Color.RED);
            messageLabel.setText("Nama dan Password harus diisi!");
        } else {
            messageLabel.setTextFill(Color.GREEN);
            messageLabel.setText("Login berhasil!\nSelamat datang, " + nama);

            // Output ke console
            System.out.println("Login berhasil!");
            System.out.println("Nama: " + nama);
            System.out.println("Password: " + password);
        }
    }

    /**
     * Optional: Method untuk clear form
     */
    @FXML
    private void handleClearButton() {
        namaTextField.clear();
        passwordField.clear();
        messageLabel.setText("");
    }
}