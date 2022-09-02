package Classes;

public class BankAccount {
    private  String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public  BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("constructor with all parameters created");
    }



    public BankAccount(){
        this("3434", 500, "namename", "default", "default");
        System.out.println("Default constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("333", 333, customerName, email, phoneNumber);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){
        this.balance = balance + funds;
        System.out.println("Current balance is "+ this.balance);
    }

    public void withdrawFunds(double funds){
        if(funds <= balance){
            this.balance = balance - funds;
            System.out.println("Current balance is " + balance);
        } else {
            System.out.println("Insufficient funds!!!");
        }
    }
}
