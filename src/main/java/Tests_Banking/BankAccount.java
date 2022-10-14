package Tests_Banking;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    //the branch is true if the customer is performing the transaction at a branch, with a teller
//    it's a false if the customer is performing transaction at an ATM
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }


    public double withdraw(double amount, boolean branch){
        balance -=amount;
        return balance;
    }


    public double getBalance() {
        return balance;
    }

//    moroe methods using last name, first name, etc.

    public boolean isChecking() {
        return accountType == CHECKING;
    }
}
