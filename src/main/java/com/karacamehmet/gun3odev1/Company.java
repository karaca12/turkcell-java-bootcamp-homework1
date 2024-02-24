package com.karacamehmet.gun3odev1;

public class Company extends Customer {
    public String taxNumber;

    public Company(int id, String name, String city, String taxNumber) {
        super(id, name, city);
        this.taxNumber = taxNumber;
    }

    public Company(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
