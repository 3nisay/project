package com.example.demo.Controllers.Admin;

import com.example.demo.Models.model;
import com.example.demo.Views.ViewFactory;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class alternitaveController implements Initializable {
    public Button produits_btn;
    public Button clients_btn;
    public Button commandes_btn;
    public Button Profile_btn;
    public Button Logout_btn;
    public Button Report_btn;

    private ViewFactory viewFactory;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    public void setViewFactory(ViewFactory viewFactory) {
        this.viewFactory = viewFactory;
    }

    private void addListeners() {
        produits_btn.setOnAction(event -> onProduit());
        clients_btn.setOnAction(event -> onClient());
        commandes_btn.setOnAction(event -> onCommande());
        Logout_btn.setOnAction(event -> onLogout());
    }

    private void onProduit() {
        // Handle produit button action
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Produit");
    }

    private void onClient() {
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Client");
    }

    private void onCommande() {
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Commande");
    }

    private void onLogout() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation de déconnexion");
        alert.setHeaderText(null);
        alert.setContentText("Êtes-vous sûr de vouloir vous déconnecter ?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // Show the login window
            model.getInstance().getViewFactory().showLoginWindow();
            model.getInstance().getViewFactory().closeStage(model.getInstance().getViewFactory().getClose());

            // Close the current admin window
            Stage currentStage = (Stage) Logout_btn.getScene().getWindow();
            viewFactory.closeStage(currentStage);
        }
    }
}

