package com.techelevator;

public class Items {
    //Variables
    private String currentPosition, name;
    private int startingQuantity;
    private double itemValue;




    //Constructors
    public Items(String currentPosition, String name, int startingQuantity, double itemValue){
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

    public double getItemValue() {
        return itemValue;
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
}
