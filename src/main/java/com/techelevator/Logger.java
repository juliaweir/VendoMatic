package com.techelevator;

import com.techelevator.currency.Money;
import com.techelevator.products.Inventory;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Logger {
    String filePath = "log.txt";
    static File log = new File("log.txt");

    public static void logFeedMoney(BigDecimal userFed,BigDecimal userBalance) throws FileNotFoundException {
        try (
                PrintWriter writer = new PrintWriter(new FileOutputStream(log), true );
        ) {
            writer.println(LocalDateTime.now() + "USER FED MONEY" + userFed + userBalance);
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logSale(String message) throws FileNotFoundException {
        String saleData = String.valueOf(Inventory.getPrice());
        try (
                PrintWriter writer = new PrintWriter(new FileOutputStream(log), true);
        ) {
            writer.println(LocalDateTime.now() + " " +saleData);
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void changeOutput(String message) throws FileNotFoundException {
        String changeGiven = Money.printBalance();
        try (
                PrintWriter writer = new PrintWriter(new FileOutputStream(log), true);
        ) {
            writer.println(LocalDateTime.now() + " " +changeGiven);
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
