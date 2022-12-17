package com.techelevator.currency;

import java.math.BigDecimal;

public abstract class Money {
    private BigDecimal balance;

    public Money(BigDecimal balance) {
        this.balance = balance;
    }

    public String printBalance() {
        //print balance in things like logs or the console with ensured precision and a dollar sign
        return String.format("$%.2f", balance);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addBalance(BigDecimal deposit){
        this.balance = this.balance.add(deposit);
    }

    public void subtractBalance(BigDecimal withdrawl){
        this.balance = this.balance.subtract(withdrawl);
    }
}
