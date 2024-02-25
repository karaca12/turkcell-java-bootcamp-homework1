package com.karacamehmet.gun3odev2.interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerDalImpl customerDal = () -> System.out.println("Customer added!");
        customerDal.add();

        CustomerDalImpl customerDal1 = new OracleCustomerDal();
        customerDal1.add();

        CustomerDalImpl customerDal2 = new MySqlCustomerDal();
        customerDal2.add();

        CustomerManager customerManager = new CustomerManager(customerDal1);
        customerManager.add();


    }
}
