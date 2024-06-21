package com.example.demo.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public TextField produit_id;
    public TextField nom_produit;
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
