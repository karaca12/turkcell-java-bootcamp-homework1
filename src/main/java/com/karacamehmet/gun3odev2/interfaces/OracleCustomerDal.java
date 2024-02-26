package com.karacamehmet.gun3odev2.interfaces;

public class OracleCustomerDal implements CustomerDal, Repository {
    @Override
    public void add() {
        System.out.println("Oracle added!");
    }
}
