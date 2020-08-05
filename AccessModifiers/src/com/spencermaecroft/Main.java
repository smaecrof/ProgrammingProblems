package com.spencermaecroft;

public class Main {

    public static void main(String[] args) {
        Account spencersAccount = new Account("Spencer");
        spencersAccount.deposit(1000);
        spencersAccount.withdraw(400);
        spencersAccount.withdraw(-300);
        spencersAccount.deposit(150);
        spencersAccount.withdraw(10000);
        spencersAccount.calculateBalance();

        System.out.println("Balance on account is $" + spencersAccount.getBalance());
    }
}
