package com.example.demo.Controllers.Admin;

import com.example.demo.Models.model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import java.net.URL;
import java.util.ResourceBundle;

public class WindowController implements Initializable {
    public BorderPane client_parent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) ->{
            switch (newVal){
                case "Produit"-> client_parent.setCenter(model.getInstance().getViewFactory().getProduitView());
                case "Client"->client_parent.setCenter(model.getInstance().getViewFactory().getClientView());
                case "Commande"->client_parent.setCenter(model.getInstance().getViewFactory().getCommandeView());
                //default -> client_parent.setCenter(model.getInstance().getViewFactory().getProduitView());
            }
        } );

    }
}

