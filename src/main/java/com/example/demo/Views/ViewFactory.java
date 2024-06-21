package com.example.demo.Views;

import com.example.demo.Controllers.Admin.ClientController;
import com.example.demo.Controllers.Admin.WindowController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
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
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return produitView;
    }

    public AnchorPane getClientView() {
        if (clientView == null) {
            try {
                clientView = new FXMLLoader(getClass().getResource("/FXML/Admin/Client.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return clientView;
    }

    public AnchorPane getCommandeView() {
        if (commandeView == null) {
            try {
                commandeView=new FXMLLoader(getClass().getResource("/FXML/Admin/Commande.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return commandeView;
    }

    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Admin/Login.fxml"));
        Scene scene = null;
        try{
            scene = new Scene(loader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Gestionnaire");
        stage.show();
    }
    public void showWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Admin/Window.fxml"));
        WindowController windowController = new WindowController();
        loader.setController(windowController);
        Scene scene = null;
        try{
            scene = new Scene(loader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Gestionnaire");
        stage.show();
    }
    /*close a stage when other is open*/
    public void closeStage(Stage stage){
        stage.close();
    }
}
