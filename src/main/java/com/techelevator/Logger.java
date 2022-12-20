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
                FileOutputStream writer = new FileOutputStream(log, true)

                //     PrintWriter writer = new PrintWriter(log);
        ) {
            String feedData = LocalDateTime.now() + " " + userFed + userBalance + "\n"; //getBytes for one string instead of multiple
                    writer.write(feedData.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logSale(String message) throws FileNotFoundException {
        String saleData = (Inventory.getPrice().toString());
        try (
                FileOutputStream writer = new FileOutputStream(log, true)
        ) {
            String saleInfo = LocalDateTime.now() + " " +saleData + "\n";
            writer.write(saleInfo.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void changeOutput(String message) throws FileNotFoundException {
        String changeGiven = Money.printBalance();
        try (
                FileOutputStream writer = new FileOutputStream(log, true)
        ) {
            String changeData = LocalDateTime.now() + " " +changeGiven + "\n";
            writer.write(changeData.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
