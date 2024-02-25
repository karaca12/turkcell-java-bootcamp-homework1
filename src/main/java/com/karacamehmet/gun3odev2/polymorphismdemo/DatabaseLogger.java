package com.karacamehmet.gun3odev2.polymorphismdemo;

public class DatabaseLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Database logger: " + message);
    }
}
