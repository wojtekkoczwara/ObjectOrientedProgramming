package Threads.Challenge;

class BankAccount {

    private double balance;
    private String accountNumber;


    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        synchronized (this){
            System.out.println("Deposing " + amount);
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        synchronized (this){
            System.out.println("Withdrawing " + amount);
            balance -= amount;
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