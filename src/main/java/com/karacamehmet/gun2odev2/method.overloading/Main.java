package com.karacamehmet.gun2odev2.method.overloading;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        System.out.println(operations.add(2, 3));
        System.out.println(operations.add(2, 3, 5));
    }
}