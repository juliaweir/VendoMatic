package com.techelevator.currency;

import com.techelevator.products.Inventory;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

public class UserBalance extends Money implements Depositable {

    public UserBalance(BigDecimal balance) {
        super(balance);
    }

    public void deposit(BigDecimal deposit){
        this.addBalance(deposit);
    }

    public void purchaseItem(Inventory item){
        this.subtractBalance(item.getPrice());
    }

    public Map<String, Integer> returnChange(BigDecimal balance){
        //declare coins
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        //loop through the decimal portion to get the change
        while (balance.compareTo(BigDecimal.valueOf(.25)) >= 0){
            balance = balance.subtract(BigDecimal.valueOf(.25));
            quarters++;
        }
        while (balance.compareTo(BigDecimal.valueOf(.1)) >= 0){
            balance = balance.subtract(BigDecimal.valueOf(.1));
            dimes++;
        }
        while (balance.compareTo(BigDecimal.valueOf(.5)) >= 0){
            balance = balance.subtract(BigDecimal.valueOf(.5));
            nickels++;
        }
        //fill a map with change to return
        Map<String, Integer> change = new HashMap<>();
        change.put("Quarters", quarters);
        change.put("Dimes", dimes);
        change.put("Nickels", nickels);

        return change;
    }
}
