package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//does the salesreport go under data?
public class TransactionLog {
    public static String log() {
        File file = new File("salesreport.txt");
        FileWriter fw;
        // LocalDate.now().format(DateTimeFormatter.ISO_DATE);
        try {
            fw = new FileWriter(file, true); //constructor File object and a boolean, true would allow appending text into the File if it exists.
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(LocalDate.now().format(DateTimeFormatter.ISO_DATE) + "user selection" + "new balance"); //have to look into what these var names are
            //will parse user selection value/new balance  into strings
            bw.write("\n");
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; //just added
    }
}

//LocalDate.now().format(DateTimeFormatter.ISO_DATE)
    /*
    StreamHandler
The StreamHandler class in the Java Logging API is used to write messages to an output stream.
The following code snippet illustrates the two constructors of this class:
StreamHandler streamHandler = new StreamHandler();
StreamHandler streamHandler = new StreamHandler(outputStream, formatter);
While the first constructor can be used to create an instance of the StreamHandler class
without any output stream,
the second one can be used to create an instance of this class with an output stream and a formatter.
If you use the default constructor
you should use the setOutputStream() method to set an output stream for the handler.
     */
