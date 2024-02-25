package com.karacamehmet.gun3odev2.abstractdemo;

public class Main {
    public static void main(String[] args) {

        OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();

        CustomerManager customerManager=new CustomerManager(oracleDatabaseManager);
        customerManager.getCustomers();
    }
}
