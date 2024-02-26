package com.karacamehmet.gun3odev2.interfaces;

public class CustomerManager {
    private final CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
    }
}
