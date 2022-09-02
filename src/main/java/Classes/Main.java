package Classes;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        //constructor , bank account
        BankAccount bankAccount = new BankAccount();
        bankAccount.depositFunds(300);
        bankAccount.withdrawFunds(500);
        bankAccount.withdrawFunds(200);

        BankAccount newBankAccount = new BankAccount("12345", 200, "name", "email", "333");

        BankAccount wojciechAccount =  new BankAccount("Tim","emailemailemail", "0987");
        System.out.println(wojciechAccount.getAccountNumber() + " " +  wojciechAccount.getBalance());

        VIPCustomer vipCustomer = new VIPCustomer();
        System.out.println(vipCustomer.getEmail());

        VIPCustomer vipCustomer1 = new VIPCustomer(2500000, "emailMy");
        System.out.println(vipCustomer1.getName());
    }

}
