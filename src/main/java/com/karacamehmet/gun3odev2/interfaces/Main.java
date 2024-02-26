package com.karacamehmet.gun3odev2.interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerDal customerDal = () -> System.out.println("Customer added!");
        customerDal.add();

        CustomerDal customerDal1 = new OracleCustomerDal();
        customerDal1.add();

        CustomerDal customerDal2 = new MySqlCustomerDal();
        customerDal2.add();

        CustomerManager customerManager = new CustomerManager(customerDal1);
        customerManager.add();


    }
}
