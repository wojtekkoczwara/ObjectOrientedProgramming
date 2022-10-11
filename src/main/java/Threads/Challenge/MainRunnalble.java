package Threads.Challenge;

public class MainRunnalble {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345-678", 1000.00);

//        Tims
        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (account) {
                    account.deposit(300.00);
                    account.withdraw(50.00);
                }
            }
        });

        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (account) {
                    account.deposit(203.75);
                    account.withdraw(100.00);
                }
            }
        });

        trThread1.start();
        trThread2.start();


    }
}
