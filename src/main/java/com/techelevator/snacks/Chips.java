package com.techelevator.snacks;

import com.techelevator.snacks.Items;

public class Chips extends Items {

    public Chips( String position, String itemName, int quantity, double cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Crunch Crunch, Yum!");
    }
}
