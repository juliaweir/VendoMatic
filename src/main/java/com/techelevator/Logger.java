package com.techelevator;

import com.techelevator.currency.Money;
import com.techelevator.currency.UserBalance;
import com.techelevator.products.Inventory;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Logger {
    public static String getDate_Time() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        String s_Date = formatter.format(date);
        return s_Date;
    }
    String filePath = "log.txt";
    static File log = new File("log.txt");

    public static void logFeedMoney(BigDecimal userFed,BigDecimal userBalance) throws FileNotFoundException {

        try (
                FileOutputStream writer = new FileOutputStream(log, true)
        ) {
            String feedData = getDate_Time() + " $" + userFed + " $" + userBalance + "\n"; //getBytes for one string instead of multiple
            writer.write(feedData.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logSale(BigDecimal price) throws FileNotFoundException {
        String saleData = " $" + price.toString() + " " + UserBalance.printBalance();
        try (
                FileOutputStream writer = new FileOutputStream(log, true)
        ) {
            String saleInfo = getDate_Time() +saleData + "\n";
            writer.write(saleInfo.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void changeOutput(String message, String balance) throws FileNotFoundException {
        String changeGiven = message;
        try (
                FileOutputStream writer = new FileOutputStream(log, true)
        ) {
            String changeData = getDate_Time() + " $" +changeGiven + " $" + balance + "\n";
            writer.write(changeData.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
