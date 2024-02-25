package com.karacamehmet.gun3odev2.interfaces;

public class MySqlCustomerDal implements CustomerDalImpl,RepositoryImpl {
    @Override
    public void add() {
        System.out.println("MySql added!");
    }
}
