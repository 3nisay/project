package com.example.demo.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProduitsController implements Initializable {
    public TextField produit_id;
    public ComboBox type_produit;
    public TextField marque;
    public TextField nom_produit;
    public ComboBox statut;
    public TextField prix;
    public Button add_b;
    public Button delete_b;
    public Button reset_b;
    public Button update_b;
    public TextField search;
    public TableView table_view;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
