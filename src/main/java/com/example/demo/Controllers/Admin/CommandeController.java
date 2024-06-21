package com.example.demo.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CommandeController implements Initializable {
    public TableView table_view;
    public TextField produit_id;
    public Spinner quantite;
    public Button add_btm;
    public TextField montant;
    public Button facture_btn;
    public Button payer_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
