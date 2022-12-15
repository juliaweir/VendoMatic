package com.techelevator.snacks;

/*
12/15/2022
added string flavourText
 */



public abstract class Items {
    //Variables
    private String currentPosition, name, flavourText;
    private int startingQuantity;
    private double itemValue;






    //Constructors
    public Items(String currentPosition, String name, int startingQuantity, double itemValue){
        this.currentPosition = currentPosition;
        this. name = name;
        this.startingQuantity = startingQuantity;
        this.itemValue = itemValue;
    }


    //methods



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

    public double getItemValue() {
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

    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }

    public void setFlavourText(String flavourText) {
        this.flavourText = flavourText;
    }
}
