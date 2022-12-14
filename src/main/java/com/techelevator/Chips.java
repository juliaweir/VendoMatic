package com.techelevator;

public class Chips extends Items {
    private String position, itemName;
    private int quantity;
    private double cost;
    public Chips( String position, String itemName, int quantity, double cost ){
        super(position,itemName,quantity,cost);

    }

    //Getters
    public String getPosition() {
        return position;
    }


    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }




    //Setters
    public void setPosition(String position) {
        this.position = position;
    }


    public void setItemName(String name) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
