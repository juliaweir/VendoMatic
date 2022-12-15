package com.techelevator.currency;

import com.techelevator.products.Inventory;
import java.util.Map;
import java.util.HashMap;

public class UserBalance extends Money implements Depositable {

    public UserBalance(double balance) {
        super(balance);
    }

    public void deposit(double deposit){
        this.addBalance(deposit);
    }

    public void purchaseItem(Inventory item){
        this.subtractBalance(item.getPrice());
    }

    public Map<String, Integer> returnChange(double balance){
        //separate the balance into the integer portion and decimal portion
        int intPart = (int)this.getBalance();
        double doublePart = balance - intPart;

        //declare coins
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        //loop through the decimal portion to get the change
        while (doublePart >= .25){
            doublePart -= .25;
            quarters++;
        }
        while (doublePart >= .10){
            doublePart -= .10;
            dimes++;
        }
        while (doublePart >= .5){
            doublePart -= .5;
            nickels++;
        }
        while (doublePart >= .1){
            doublePart -= .1;
            pennies++;
        }
        //fill a map with change to return
        Map<String, Integer> change = new HashMap<>();
        change.put("Quarters", quarters);
        change.put("Dimes", dimes);
        change.put("Nickels", nickels);
        change.put("Pennies", pennies);
        return change;
    }
}
