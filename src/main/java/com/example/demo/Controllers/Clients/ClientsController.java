    package com.example.demo.Controllers.Clients;

import com.example.demo.Models.Product;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClientsController {

    @FXML
    private TextField productIdField;

    @FXML
    private ComboBox<String> productTypeCombo;

    @FXML
    private TextField brandField;

    @FXML
    private TextField productNameField;

    @FXML
    private ComboBox<String> statusCombo;

    @FXML
    private TextField priceField;

    @FXML
    private Button addButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button resetButton;

    @FXML
    private TableView<Product> productTable;

    @FXML
    private TableColumn<Product, String> productIdColumn;

    @FXML
    private TableColumn<Product, String> typeColumn;

    @FXML
    private TableColumn<Product, String> brandColumn;

    @FXML
    private TableColumn<Product, String> productNameColumn;

    @FXML
    private TableColumn<Product, String> priceColumn;

    @FXML
    private TableColumn<Product, String> statusColumn;

    @FXML
    private void initialize() {
        // Initialize ComboBox items
        productTypeCombo.getItems().addAll("Snacks", "Drinks", "Dessert", "Gadgets", "Personal Product");
        statusCombo.getItems().addAll("Available", "Unavailable");

        // Initialize TableView columns
        productIdColumn.setCellValueFactory(cellData -> cellData.getValue().productIdProperty());
        typeColumn.setCellValueFactory(cellData -> cellData.getValue().typeProperty());
        brandColumn.setCellValueFactory(cellData -> cellData.getValue().brandProperty());
        productNameColumn.setCellValueFactory(cellData -> cellData.getValue().productNameProperty());
        priceColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty());
        statusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

        // Add event handlers
        addButton.setOnAction(e -> addProduct());
        updateButton.setOnAction(e -> updateProduct());
        deleteButton.setOnAction(e -> deleteProduct());
        resetButton.setOnAction(e -> resetFields());
    }

    private void addProduct() {
        // Implement adding product logic here
        Product product = new Product(
                productIdField.getText(),
                productTypeCombo.getValue(),
                brandField.getText(),
                productNameField.getText(),
                priceField.getText(),
                statusCombo.getValue()
        );
        productTable.getItems().add(product);
        resetFields();
    }

    private void updateProduct() {
        // Implement updating product logic here
        Product selectedProduct = productTable.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            selectedProduct.setProductId(productIdField.getText());
            selectedProduct.setType(productTypeCombo.getValue());
            selectedProduct.setBrand(brandField.getText());
            selectedProduct.setProductName(productNameField.getText());
            selectedProduct.setPrice(priceField.getText());
            selectedProduct.setStatus(statusCombo.getValue());
            productTable.refresh();
        }
    }

    private void deleteProduct() {
        // Implement deleting product logic here
        Product selectedProduct = productTable.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            productTable.getItems().remove(selectedProduct);
            resetFields();
        }
    }

    private void resetFields() {
        productIdField.clear();
        productTypeCombo.getSelectionModel().clearSelection();
        brandField.clear();
        productNameField.clear();
        statusCombo.getSelectionModel().clearSelection();
        priceField.clear();
    }
}
