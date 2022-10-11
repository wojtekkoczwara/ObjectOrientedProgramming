package Threads.Challenge.Challenge4;

import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private double balance;
    private String accountNumber;

    private final ReentrantLock reentrantLock;

    public BankAccount(String accountNumber, double initialBalance, ReentrantLock reentrantLock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.reentrantLock = reentrantLock;
    }

    public synchronized void deposit(double amount) {
        try{
            reentrantLock.lock();
            System.out.println("Deposing " + amount);
            balance += amount;
        } finally {
            reentrantLock.unlock();

        }

    }

    public void withdraw(double amount) {

        try {
            reentrantLock.lock();
            System.out.println("Withdrawing " + amount);
            balance -= amount;
        } finally {
            reentrantLock.unlock();
        }

    }

//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public  void withdraw(double amount) {
//        balance -= amount;
//    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }
}