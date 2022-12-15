package com.techelevator.snacks;

import java.math.BigDecimal;

public class Gum extends Items {
    public Gum( String position, String itemName, int quantity, BigDecimal cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Chew Chew, Yum!");
    }
}
