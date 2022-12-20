package com.techelevator.products;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InventoryTest {
    //making a new inventory
    private UpdateInventory inventory = new UpdateInventory();
    //reference to cvs file for inventory
    private File inventoryInfo = new File("vendingmachine.csv");
    // list for inventory so i wont have to make a new one each test case
     private List<Inventory> testInventory = new ArrayList<>();



    @Test
    public void TestItemCreation(){
        //making a new item
        Candy candyBar = new Candy("C4", "nuget Bar", new BigDecimal(2.00), "Candy" );

        Assert.assertEquals("C4", candyBar.getVendPosition());
        //System.out.println(candyBar.getVendPosition());
        Assert.assertEquals("nuget Bar", candyBar.getProductName());
        //System.out.println(candyBar.getProductName());
        Assert.assertEquals(new BigDecimal(2.00), candyBar.getPrice());
        //System.out.println(candyBar.getPrice());
        Assert.assertEquals("Candy", candyBar.getType());
        //System.out.println(candyBar.getType());
    }

    @Test
    public void TestItemSetterBigDecimal(){
        //making a new item
        Candy candy = new Candy("A1", "Cavity Bar", new BigDecimal(1.00), "Candy" );

        Assert.assertEquals(new BigDecimal(1.00), candy.getPrice());
        //System.out.println(candy.getPrice());

        candy.setPrice(new BigDecimal(40.00));
        Assert.assertEquals(new BigDecimal(40.00), candy.getPrice());
        //System.out.println(candy.getPrice());

    }

    @Test
    public void TestType(){
        //making a new item
        Candy candyBar = new Candy("C4", "nuget Bar", new BigDecimal(2.00), "Candy" );

        String itemTypeOne = candyBar.getType();
        Assert.assertEquals(candyBar.getType(), itemTypeOne);
        //System.out.println(candyBar.getType());

        candyBar.setType("Chips");
        String itemTypeTwo = candyBar.getType();
        Assert.assertEquals(candyBar.getType(), itemTypeTwo);
        //System.out.println(candyBar.getType());
        Assert.assertFalse(candyBar.getType(), candyBar.getType().equals(itemTypeOne) );

    }


    @Test
    public void TestUpdateInventoryValues() {
        // make new list


        //set test inventory to the output of update inventory
        testInventory = inventory.updateInventory();

        try (Scanner readInventory = new Scanner(inventoryInfo)) {
            //while loop to avoid out of bounds exception
            while (readInventory.hasNextLine()) {
                //for loop to move through the cvs file and check if the items match.

                for (int i = 0; i < testInventory.size(); i++) {
                    // split current line into a list
                    String[] compareValue = readInventory.nextLine().split(Pattern.quote("|"));
                    //compare vend position
                    Assert.assertEquals(testInventory.get(i).getVendPosition(), compareValue[0]);

                    //compare product name
                    Assert.assertEquals(testInventory.get(i).getProductName(), compareValue[1]);

                    //compare price value
                    Assert.assertEquals(testInventory.get(i).getPrice(), new BigDecimal(compareValue[2]));

                    //compare type
                    Assert.assertEquals(testInventory.get(i).getType(), compareValue[3]);
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("no inventory found");
        }
    }
    
}

