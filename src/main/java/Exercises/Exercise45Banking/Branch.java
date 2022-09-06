package Exercises.Exercise45Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        Customer customer = new Customer(name, transaction);
        if(findCustomer(name) == null){
            this.customers.add(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction){
        if(findCustomer(name) == null){
            return false;
        } else {
           int index =  customers.indexOf(findCustomer(name));
           Customer customer = customers.get(index);
           customer.addTransaction(transaction);
            return true;
        }
    }

    private Customer findCustomer(String customer){
        for (int i = 0; i < customers.size(); i++) {
            Customer customer1 = customers.get(i);
            if(customer1.getName().equals(customer)){
                return customers.get(i);
            }
        }
        return null;
    }
}
