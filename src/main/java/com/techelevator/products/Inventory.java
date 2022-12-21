package com.techelevator.products;

import java.math.BigDecimal;

public class Inventory {


    protected String vendPosition;  //protected, encapsulated code to restrict access to the meet the exact level of access needed
    protected String productName;

    protected BigDecimal price;

    protected String type;

    protected int stockOf;

    public Inventory(String vendPosition, String productName, BigDecimal price, String type) {
        this.vendPosition = vendPosition;
        this.productName = productName;
        this.price = price;
        this.type = type;
        this.stockOf = 5;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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

    public int getStockOf() {return stockOf;}

    public void setStockOf(int stockOf) {this.stockOf = stockOf;}

    @Override
    public String toString(){

        return   String.format("| %s | %-30s | Price : $%-5s and Quantity : %s |\n",
                getVendPosition(),
                getProductName().trim(),
                getPrice().toString().trim(),
                getStockOf());
    }

    public String getPurchaseMessage(Inventory item){
        switch (item.getType()) {
            case "Candy" :
                return "Munch Munch, Yum!";

            case "Chip" :
                return "Crunch Crunch, Yum!";

            case "Drink" :
                return "Glug Glug, Yum!";

            case "Gum" :
                return "Chew Chew, Yum!";
        }
        return "";
    }

    public void dispense(){
        this.stockOf--;
    }

}
