package com.karacamehmet.gun3odev2.interfaces;

public class MySqlCustomerDal implements CustomerDal, Repository {
    @Override
    public void add() {
        System.out.println("MySql added!");
    }
}
