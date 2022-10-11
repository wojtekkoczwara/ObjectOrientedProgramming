package Threads.Challenge.Challenge5_6;

import java.util.concurrent.TimeUnit;
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
        boolean status = false;
        try{
            if(reentrantLock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println("Deposing " + amount);
                balance += amount;
                status = true;
            }
            else {
                System.out.println("Couldn't get the lock");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();

        }

        System.out.println("Transaction status = " + status);

    }

    public void withdraw(double amount) {
        boolean status = false;

        try {
            if(reentrantLock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println("Withdrawing " + amount);
                balance -= amount;
                status = true;
            }
            else {
                System.out.println("Couldn't get the lock");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }

        System.out.println("Transaction status = " + status);

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