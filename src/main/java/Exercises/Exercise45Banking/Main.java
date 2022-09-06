package Exercises.Exercise45Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("pko");
        bank.addBranch("wroc");
        boolean isAdded = bank.addBranch("wroc");

        boolean isCustomerAdded = bank.addCustomer("kuku", "wojtaz", 30);
        boolean isCustomerAdded2 = bank.addCustomer("wroc", "wojtaz", 30);
        boolean isCustomerAdded3 = bank.addCustomer("wroc", "wojtaz", 30);

    }

}
