package com.techelevator.products;


import java.math.BigDecimal;

public class Chips extends Inventory implements textDisplay {
    public Chips(String vendPosition, String productName, BigDecimal price, String type) {
        super(vendPosition, productName, price, type);
    }

    @Override
    public String purchaseMessage(){
        return "Crunch Crunch, Yum!";

    }
}
