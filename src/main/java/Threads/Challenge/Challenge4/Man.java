package Threads.Challenge.Challenge4;

import java.util.concurrent.locks.ReentrantLock;

public class Man {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        BankAccount account = new BankAccount("12345-678", 1000.00, reentrantLock);

        new Thread(){
            public void run(){
                synchronized (account) {
                    account.deposit(300.00);
                    account.withdraw(50.00);
                }
            }
        }.start();

        new Thread(){
            public void run(){
               account.deposit(203.75);
               account.withdraw(100);
            }
        }.start();

        System.out.println(account.getBalance());

//        Tims
        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (account) {
                    account.deposit(203.75);
                    account.withdraw(100.00);
                }
            }
        });

        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });

        trThread1.start();
        trThread2.start();


    }
}
