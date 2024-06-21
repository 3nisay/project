package com.example.demo.Views;

import com.example.demo.Controllers.Admin.WindowController;
import com.example.demo.Controllers.Admin.alternitaveController;
import com.example.demo.Models.model;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    /*Client Views*/
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane produitView;
    private AnchorPane clientView;
    private AnchorPane commandeView;
    private AnchorPane loginView;
    private Stage close;

    public ViewFactory() {
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    public AnchorPane getProduitView() {
        if (produitView == null) {
            try {
                produitView = new FXMLLoader(getClass().getResource("/FXML/Admin/Produits.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return produitView;
    }

    public AnchorPane getClientView() {
        if (clientView == null) {
            try {
                clientView = new FXMLLoader(getClass().getResource("/FXML/Admin/Client.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return clientView;
    }

    public AnchorPane getCommandeView() {
        if (commandeView == null) {
            try {
                commandeView = new FXMLLoader(getClass().getResource("/FXML/Admin/Commande.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return commandeView;
    }
    public AnchorPane getLoginView() {
        if (loginView == null) {
            try {
                loginView = new FXMLLoader(getClass().getResource("/FXML/Admin/Login.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return loginView;
    }

    public void showLoginWindow() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Admin/Login.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Login");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setClose(Stage close) {
        this.close = close;
    }

    public void showWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Admin/Window.fxml"));
            WindowController windowController = new WindowController();
            loader.setController(windowController);
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Gestionnaire");
            setClose(stage);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Stage getClose() {
        return close;
    }

    /* Close a stage when another is open */
    public void closeStage(Stage stage) {
        stage.close();
    }
    public void showAlternativeWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Admin/alternativeMenu.fxml"));
            alternitaveController controller = new alternitaveController();
            loader.setController(controller);
            controller.setViewFactory(this);
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Admin Panel");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


