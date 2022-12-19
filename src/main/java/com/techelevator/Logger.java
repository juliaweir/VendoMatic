package com.techelevator;

import com.techelevator.products.Inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    String filePath = "log.txt";
    static File log = new File("log.txt");

    public static void logFeedMoney(String moneyFed) throws FileNotFoundException {
       // String feedData = UserBalance.addBalance();
        try (
                PrintWriter writer = new PrintWriter(log);
        ) {
            writer.format(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
            //        writer.write(feedData);
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logSale(String message) throws FileNotFoundException {
        String saleData = String.valueOf(Inventory.getPrice());
        try (
                PrintWriter writer = new PrintWriter(log);
        ) {
            writer.format(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
            writer.write(saleData);
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void changeOutput(String message) throws FileNotFoundException {
       // String changeGiven =
        try (
                PrintWriter writer = new PrintWriter(log);
        ) {
            writer.format(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
         //   writer.write(changeGiven);
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
        //want to include a method logPurchase or Sale getting inventory and user bal
//logDeposit from getting user balance,
        //logChange get from user balance

//vendingmachine.csv
//taking user input into string var,
//logSale get price from inventory
//logFeedMoney get from user balance
//logGetChange done inside gui?, getting a double the GUI
//calling getPrice in
//calling inventory item into logger, get price method on item
//to log item you are pulling into param in method
//using item method .getprice from to populate logger
//use toString method for BigDecimal
//from user input, pull from where the user types into text box

//LocalDate.now().format(DateTimeFormatter.ISO_DATE)
