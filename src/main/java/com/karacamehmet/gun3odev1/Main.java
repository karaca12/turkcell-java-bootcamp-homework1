package com.karacamehmet.gun3odev1;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(1, "Mehmet", "Denizli"), new TeacherCreditManager());
        customerManager.save();
        customerManager.giveCredit();

        CustomerManager customerManager1 = new CustomerManager(new Company(2, "Turkcell", "İstanbul", "123"), new CompanyCreditManager());
        customerManager1.save();
        customerManager1.giveCredit();
    }
}
