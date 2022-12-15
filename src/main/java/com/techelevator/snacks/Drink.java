package com.techelevator.snacks;

public class Drink extends Items {

    public Drink(String position, String itemName, int quantity, double cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Glug Glug, Yum!");
    }
}
