package redoMidterm;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Bank(){}

    public void addCustomer(Customer customer){
        //todo-create function for adding customer [DONE]
        customers.add(customer);

    }

    public void printAllCustomersAccountInfo(){
        //todo-create function for printing all customer account info [DONE]
        for(Customer customer: customers){
            System.out.println(customer.getACCOUNT().printAccountInfo());
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
