package com.techelevator.currency;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SalesReport {

    // map and other variables
    Map<String, Integer>  inventorySales = new HashMap<>();
    private BigDecimal totalCost;
    // reference to cvs file
    File vendingInventory = new File("C:\\Users\\xbox2\\OneDrive\\Desktop\\Capstone1\\module-1-capstone\\vendingmachine.csv");


    //method that reads vendingmechine.cvs and populates the inventory sales map and total cost
    public void populateSales(){


        //try catch blocks
        try(Scanner populateMap = new Scanner (vendingInventory)) {

            //loop through file
            while (populateMap.hasNextLine()) {

                //split each line into string array excluding |
                String[] findName = populateMap.nextLine().split(Pattern.quote("|"));

                //because everything is separated by | in cvs
                // only need to add the second element  that is position 1 in array
                inventorySales.put(findName[1], 0);
            }
            populateMap.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found at" + vendingInventory.getAbsolutePath());
        }

    }



    //method that updates and prints/writes to file
    public void updateSalesReport(){
        //nested for loop

        try(Scanner readLog = new Scanner (vendingInventory)){
            for(String itemName: inventorySales.keySet()){
                if(readLog.nextLine().contains(itemName)){
                    //if true first save the string
                    String tempString = readLog.nextLine();

                    //next update inventory
                    inventorySales.put(itemName, inventorySales.get(itemName) + 1);

                    //then update the total cost
                    String findCost = tempString.substring(tempString.indexOf("$"), tempString.length()-6);
                    totalCost = totalCost.add(new BigDecimal(findCost));
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found at" + vendingInventory.getAbsolutePath());
        }
        printSalesReport();
    }

    public void printSalesReport(){
        try(PrintWriter newSalesReport = new PrintWriter("saleReport.txt")){
            //loop through the map and print key and value in key | value format
            for(Map.Entry keyValue: inventorySales.entrySet()){
                newSalesReport.println(keyValue.getKey() +  "|" + keyValue.getValue());
            }
            newSalesReport.println("");
            newSalesReport.println("total = " + totalCost);

        }
        catch(FileNotFoundException e){
            System.out.println("File not found at" + vendingInventory.getAbsolutePath());
        }

    }


}
