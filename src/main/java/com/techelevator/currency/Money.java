package com.techelevator.currency;

public abstract class Money {
    private double balance;

    public Money(double balance) {
        this.balance = balance;
    }

    public void printBalance() {
        //print balance in things like logs or the console with ensured precision and a dollar sign
        System.out.printf("$" + "'.2f'", balance);
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double deposit){
        this.balance += deposit;
    }

    public void subtractBalance(double withdrawl){
        this.balance -= withdrawl;
    }
}
