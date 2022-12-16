package com.techelevator.products;


import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateInventory {

    private Scanner inventoryList;
    private File inventoryFile = new File("C:\\Users\\Mirag\\Desktop\\GitProjects\\Capstone\\module-1-capstone\\vendingmachine.csv");
    private List<Inventory> forSale = new ArrayList<>();

    public  List<Inventory> updateInventory(){
        try{
            inventoryList = new Scanner(inventoryFile); //creates a new scanner which scans for the csv file
            inventoryList.useDelimiter("|");  //scanner's delimiting pattern to a pattern constructed from the specified String.

            String[] wordBy;
            while (inventoryList.hasNext()){

                String line = inventoryList.nextLine();
                wordBy = line.split("\\|"); //like csv

               forSale.add(new Inventory(wordBy[0],wordBy[1],
                       Double.parseDouble(wordBy[2]),wordBy[3]));
            }
            return forSale;

        }   catch (Exception e){

            throw new RuntimeException("This file does not exist");
        } finally {
            inventoryList.close(); //closes Scanner
        }

    }

    public List<Inventory> getForSale() {
        return forSale;
    }

    public void setForSale(List<Inventory> forSale) {
        this.forSale = forSale;
    }
}
