package com.karacamehmet.gun3odev2.interfaces;

public class CustomerManager {
    private final CustomerDalImpl customerDal;

    public CustomerManager(CustomerDalImpl customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
    }
}
