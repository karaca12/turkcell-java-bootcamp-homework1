package com.karacamehmet.gun3odev2.polymorphismdemo;

public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("Customer added!");
        baseLogger.log("Log");
    }
}
