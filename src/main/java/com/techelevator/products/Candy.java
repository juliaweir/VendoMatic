package com.techelevator.products;



import java.math.BigDecimal;

public class Candy extends Inventory implements textDisplay {

    public Candy(String vendPosition, String productName, BigDecimal price, String type) {
        super(vendPosition, productName, price, type);
    }

    @Override
    public String purchaseMessage(){
        return "Munch Munch, Yum!";
    }
}
