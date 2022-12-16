package com.techelevator;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    public Logger() throws IOException {
    }

    public static void log(String message) throws FileNotFoundException{
    String filePath = "log.txt";
    File log = new File("log.txt");
    try (
            PrintWriter writer = new PrintWriter(log);
    ){
      //  writer.format(LocalDate.now().format(DateTimeFormatter.ISO_DATE, amountSpent, newBalance)) //after date, maybe string? string?
        writer.println();
    } catch (FileNotFoundException e) {
        System.out.println("Log file not found");
    } catch (IOException e){
        throw new RuntimeException(e);
    }
    }
    //want to include a method logPurchase that records when a purchase happens

}
//vendingmachine.csv


//LocalDate.now().format(DateTimeFormatter.ISO_DATE)
