package com.techelevator;

import com.techelevator.currency.UserBalance;
import com.techelevator.products.Inventory;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Logger {
    public static String date_Time() {
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
            String feedData = date_Time() + " FEED MONEY:" + " $" + userFed + " $" + userBalance + "\n"; //getBytes for one string instead of multiple
            writer.write(feedData.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void logSale(String getProductName, String getVendPosition, BigDecimal price) throws FileNotFoundException {

        String saleData = getProductName + " " + getVendPosition + " $" + price.toString() + " " + UserBalance.printBalance();
        try (
                FileOutputStream writer = new FileOutputStream(log, true)
        ) {
            String saleInfo = date_Time() + " " + saleData + "\n";
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
            String changeData = date_Time() + " GIVE CHANGE:" + " $" +changeGiven + " $" + balance + "\n";
            writer.write(changeData.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
