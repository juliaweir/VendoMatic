package com.techelevator.snacks;

import java.math.BigDecimal;

public class Candy extends Items{
    public Candy(String position, String itemName, int quantity, BigDecimal cost ){
        super(position,itemName,quantity,cost);
        this.setFlavourText("Munch Munch, Yum!");
    }
}
