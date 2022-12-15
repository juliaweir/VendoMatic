package com.techelevator.snacks;

public class Candy extends Items{
    public Candy( String position, String itemName, int quantity, double cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Munch Munch, Yum!");
    }
}
