package com.techelevator.snacks;

public class Gum extends Items {
    public Gum( String position, String itemName, int quantity, double cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Chew Chew, Yum!");
    }
}
