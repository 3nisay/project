package com.example.demo.Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {

    private final StringProperty productId;
    private final StringProperty type;
    private final StringProperty brand;
    private final StringProperty productName;
    private final StringProperty price;
    private final StringProperty status;

    public Product(String productId, String type, String brand, String productName, String price, String status) {
        this.productId = new SimpleStringProperty(productId);
        this.type = new SimpleStringProperty(type);
        this.brand = new SimpleStringProperty(brand);
        this.productName = new SimpleStringProperty(productName);
        this.price = new SimpleStringProperty(price);
        this.status = new SimpleStringProperty(status);
    }

    public StringProperty productIdProperty() { return productId; }
    public String getProductId() { return productId.get(); }
    public void setProductId(String productId) { this.productId.set(productId); }

    public StringProperty typeProperty() { return type; }
    public String getType() { return type.get(); }
    public void setType(String type) { this.type.set(type); }

    public StringProperty brandProperty() { return brand; }
    public String getBrand() { return brand.get(); }
    public void setBrand(String brand) { this.brand.set(brand); }

    public StringProperty productNameProperty() { return productName; }
    public String getProductName() { return productName.get(); }
    public void setProductName(String productName) { this.productName.set(productName); }

    public StringProperty priceProperty() { return price; }
    public String getPrice() { return price.get(); }
    public void setPrice(String price) { this.price.set(price); }

    public StringProperty statusProperty() { return status; }
    public String getStatus() { return status.get(); }
    public void setStatus(String status) { this.status.set(status); }
}
