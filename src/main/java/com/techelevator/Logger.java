package com.techelevator;

import com.techelevator.currency.UserBalance;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {

    public static void log(String message) throws FileNotFoundException{
    String filePath = "log.txt";
    File log = new File("log.txt");
    try (
            PrintWriter writer = new PrintWriter(log);
    ){
       // writer.format(LocalDate.now().format(DateTimeFormatter.ISO_DATE,)) //after date, maybe string? string?
        writer.println();
    } catch (FileNotFoundException e) {
        System.out.println("Log file not found");
    } catch (IOException e){
        throw new RuntimeException(e);
    }
    }
    //want to include a method logPurchase or Sale getting inventory and user bal
//logDeposit from getting user balance
    //logChange get from user balance
}
//vendingmachine.csv


//LocalDate.now().format(DateTimeFormatter.ISO_DATE)
