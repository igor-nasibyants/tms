package com.tms.homework.pavelgrigoryev.task19.multithreading.task2;

public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
