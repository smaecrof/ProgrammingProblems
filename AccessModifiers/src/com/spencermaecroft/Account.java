package com.spencermaecroft;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by SMC on 08/04/2020
 */
public class Account {

    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName){
        this.accountName = accountName;
        transactions = new ArrayList<Integer>();
    }

    public int getBalance(){
        return this.balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println("$" + amount + " was deposited into " + accountName);
            System.out.println("Current balance: $" + getBalance());
        } else {
            System.out.println("Cannot deposit a negative amount");
        }
    }

    public void withdraw(int amount){
        int withdrawAmount = -amount;

        if(withdrawAmount < 0 && withdrawAmount + this.balance >= 0){
            this.transactions.add(withdrawAmount);
            this.balance += withdrawAmount;
            System.out.println("$" + amount + " was withdrawn from " + accountName);
            System.out.println("Current Balance: $" + this.getBalance());
        } else if(withdrawAmount + this.balance < 0) {
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("Cannot withdraw negative amounts");
        }

        /* The reason I did not implement this block of code below is due to the fact
        that for the transactions (ArrayList), I want to store the deposits as positive numbers
        and the withdraw transactions as negative numbers. So I simply needed to implement this method differently.
        if(amount > 0 && amount <= this.balance){
            transactions.add(amount);
            this.balance -= amount;
            System.out.println(amount + " was withdrawn from " + accountName);
            System.out.println("Current balance: $" + getBalance());
        } else if(amount < 0 ){
            System.out.println("Cannot withdraw a negative amount");
        } else {
            System.out.println("Insufficient Funds");
        } */
    }

    public void calculateBalance(){
        this.balance = 0;
        for(int i: transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance: $" + this.balance);
    }
}
