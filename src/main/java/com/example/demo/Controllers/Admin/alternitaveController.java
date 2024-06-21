package com.example.demo.Controllers.Admin;

import com.example.demo.Models.model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class alternitaveController implements Initializable {
    public Button produits_btn;
    public Button clients_btn;
    public Button commandes_btn;
    public Button Profile_btn;
    public Button Logout_btn;
    public Button Report_btn;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }
    private void addListeners(){
        produits_btn.setOnAction(event -> onProduit());
        clients_btn.setOnAction(event -> onClient());
        commandes_btn.setOnAction(event->onCommande());
    }
    private void onProduit(){
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Produit");

    }
    private void onClient(){
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Client");

    }
    private void onCommande(){
        model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Commande");

    }
}
