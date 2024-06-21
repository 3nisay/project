package com.example.demo.Controllers;

import com.example.demo.Models.model;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public TextField username_fld;
    public TextField password_fld;
    public Label error_lbl;
    public Button login_btn;


    private void handleLogin() {
        // Basic validation or authentication logic
        String username = username_fld.getText();
        String password = password_fld.getText();

        if ("admin".equals(username) && "admin".equals(password)) {
                onLogin();
        } else {
            error_lbl.setText("Invalid username or password.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event->handleLogin());

    }
    private void onLogin(){
        Stage stage = (Stage) login_btn.getScene().getWindow();
        model.getInstance().getViewFactory().showWindow();
        model.getInstance().getViewFactory().closeStage(stage);


    }
}

