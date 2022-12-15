package com.techelevator.snacks;

import com.techelevator.snacks.Items;

import java.math.BigDecimal;

public class Chips extends Items {

    public Chips( String position, String itemName, int quantity, BigDecimal cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Crunch Crunch, Yum!");
    }
}
