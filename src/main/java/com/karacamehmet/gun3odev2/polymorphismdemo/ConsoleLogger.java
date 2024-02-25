package com.karacamehmet.gun3odev2.polymorphismdemo;

public class ConsoleLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Console logger: " + message);
    }
}
