package com.techelevator.snacks;

import java.math.BigDecimal;

public abstract class Items {
    //Variables
    private String currentPosition, name, flavourText;
    private int startingQuantity;
    private BigDecimal itemValue;

    //Constructors
    public Items(String currentPosition, String name, int startingQuantity, BigDecimal itemValue){
        this.currentPosition = currentPosition;
        this. name = name;
        this.startingQuantity = startingQuantity;
        this.itemValue = itemValue;
    }



    //Getters
    public String getCurrentPosition() {
        return currentPosition;
    }

    public String getName() {
        return name;
    }

    public int getStartingQuantity() {
        return startingQuantity;
    }

    public BigDecimal getItemValue() {
        return itemValue;
    }

    public String getFlavourText() {
        return flavourText;
    }

    //Setters
    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartingQuantity(int startingQuantity) {
        this.startingQuantity = startingQuantity;
    }

    public void setItemValue(BigDecimal itemValue) {
        this.itemValue = itemValue;
    }

    public void setFlavourText(String flavourText) {
        this.flavourText = flavourText;
    }
}
