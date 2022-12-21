package com.techelevator.currency;

import junit.framework.TestCase;
import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SalesReportTest extends TestCase {
    SalesReport salesReport = new SalesReport();

    public void testPopulateSales() {
        salesReport.updateSalesReport();
        File testVendInventory = new File("vendingmachine.csv");
        try(Scanner testPopulateMap = new Scanner (testVendInventory)) {

            //loop through file
            while (testPopulateMap.hasNextLine()) {

                //split each line into string array excluding |
                String[] testName = testPopulateMap.nextLine().split(Pattern.quote("|"));

                for( String tempName: salesReport.getInventorySales().keySet()) {
                   Assert.assertTrue(testName.equals(testName));
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found at" + testVendInventory.getAbsolutePath());
        }
    }
}