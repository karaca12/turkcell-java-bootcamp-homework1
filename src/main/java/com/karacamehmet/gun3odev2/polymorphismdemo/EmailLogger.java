package com.karacamehmet.gun3odev2.polymorphismdemo;

public class EmailLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Email logger: " + message);
    }
}
