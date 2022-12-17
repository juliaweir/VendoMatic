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



    //method that updates map and total cost when sale is made.
    //does not need to take input, needs to read from log file
    // and check if the lines contains the same name from the map and if it does update the map
    // should also update populateMap so it has
    public void updateSalesReport(){
        //nested for loop

        try(Scanner readLog = new Scanner (vendingInventory);  PrintWriter newSalesReport = new PrintWriter("saleReport.txt")){
            for(String itemName: inventorySales.keySet()){
                

                for(int i = 0 ; i < inventorySales.size(); i++){

                }
            }

        }
        catch(FileNotFoundException e){}

        //main for loop goes through map based on key
        //nested for loop goes through log file and compares key using a temp string
        //in nested forloop if the temp string is included in the line from the sales report
        //update the map for that item matching the key
        // update the total cost
        //after nested loop is done
        // print blank line
        //then print total cost




        //update total cost example
        //totalCost = totalCost.add(cost);

        //use to update list example
        //inventorySales.put(name, inventorySales.get(name) + 1);
    }

}
