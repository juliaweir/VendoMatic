package com.techelevator.snacks;

import java.math.BigDecimal;

public class Drink extends Items {

    public Drink(String position, String itemName, int quantity, BigDecimal cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Glug Glug, Yum!");
    }
}
