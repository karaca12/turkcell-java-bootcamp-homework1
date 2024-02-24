package com.karacamehmet.gun3odev1;

public class Person extends Customer {
    private String nationalId;

    public Person(int id, String name, String city, String nationalId) {
        super(id, name, city);
        this.nationalId = nationalId;
    }

    public Person(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
