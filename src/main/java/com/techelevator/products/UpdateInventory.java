package com.techelevator.products;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

public class UpdateInventory {
    private File inventoryFile = new File("vendingmachine.csv");
    private List<Inventory> forSale = new ArrayList<>();

   private Map<String,Inventory> findItem = new HashMap<>();


    public List<Inventory> getForSale() {
        return forSale;
    }
    public List<Inventory> updateInventory(){
        try (Scanner inventoryList = new Scanner(inventoryFile)){
            //creates a new scanner which scans for the csv file
            inventoryList.useDelimiter("|");  //scanner's delimiting pattern to a pattern constructed from the specified String.

            String[] wordBy;
            while (inventoryList.hasNext()){ // While the csv has a next line continue the while loop

                String line = inventoryList.nextLine(); // Read line and store in new String variable
                wordBy = line.split("\\|"); //Take string and split the words into an array using the pipe symbol

              forSale.add(new Inventory(wordBy[0],wordBy[1],
                       new BigDecimal(wordBy[2]),wordBy[3])); // Add the words in the array to a list.
            }
            return forSale;
        }   catch (Exception e){
            throw new RuntimeException("This file does not exist");
        }

    }

    public Map<String, Inventory> getFindItem() {
        return findItem;
    }

    public Map<String, Inventory> createInventoryMap(){

        for ( Inventory item : forSale){

            if(item.getType().equalsIgnoreCase("Chip")){

                findItem.put(item.vendPosition,new Chips(item.vendPosition,
                        item.getProductName(),
                        item.getPrice(),item.getType()));
            } else if (item.getType().equals("Drink")) {

                findItem.put(item.vendPosition,new Drink(item.vendPosition,
                        item.getProductName(),
                        item.getPrice(),item.getType()));
            } else if(item.getType().equals("Gum")){

                findItem.put(item.vendPosition,new Gum(item.vendPosition,
                        item.getProductName(),
                        item.getPrice(),item.getType()));
            }else {

                findItem.put(item.vendPosition,new Candy(item.vendPosition,
                        item.getProductName(),
                        item.getPrice(),item.getType()));
            }
        }
        return  findItem;

    }

}
