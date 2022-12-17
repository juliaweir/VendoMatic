package com.techelevator.products;



import java.math.BigDecimal;

public class Gum extends Inventory implements textDisplay {

    public Gum(String vendPosition, String productName, BigDecimal price, String type) {
        super(vendPosition, productName, price, type);
    }

    @Override
    public  void purchaseMessage(){
        System.out.println("Chew Chew, Yum!");

    }



}
