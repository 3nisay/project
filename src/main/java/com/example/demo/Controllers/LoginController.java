package com.example.demo.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;

public class LoginController {
    public TextField username_fld;
    public TextField password_fld;
    public Label error_lbl;
    public Button login_btn;

    public void initialize() {
        // Attach event handler to the login button
        login_btn.setOnAction(this::handleLogin);
    }

    private void handleLogin(ActionEvent event) {
        // Basic validation or authentication logic
        String username = username_fld.getText();
        String password = password_fld.getText();

        if ("admin".equals(username) && "admin".equals(password)) {
            try {
                // Load the next scene
                Parent root = FXMLLoader.load(getClass().getResource("/com/example/demo/Fxml/Clients.fxml"));

                // Get current stage
                Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();

                // Set new scene
                stage.setScene(new Scene(root));
            } catch (IOException e) {
                e.printStackTrace();
                error_lbl.setText("Failed to load next scene.");
            }
        } else {
            error_lbl.setText("Invalid username or password.");
        }
    }
}

