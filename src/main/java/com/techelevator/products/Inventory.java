package com.techelevator.products;

public class Inventory {


    protected String vendPosition;
    protected String productName;

    protected double price;

    protected String type;

    public Inventory(String vendPosition, String productName, double price, String type) {
        this.vendPosition = vendPosition;
        this.productName = productName;
        this.price = price;
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVendPosition() {
        return vendPosition;
    }

    public void setVendPosition(String vendPosition) {
        this.vendPosition = vendPosition;
    }
}
