package com.karacamehmet.gun3odev1;

public class CustomerManager {
    public Customer customer;
    public CreditManager creditManager;

    public CustomerManager(Customer customer, CreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println("Customer saved: " + customer.getId());
    }

    public void delete() {
        System.out.println("Customer deleted: " + customer.getId());
    }

    public void giveCredit() {
        creditManager.calculate();
        System.out.println("Credit given to: " + customer.getId());
    }
}
