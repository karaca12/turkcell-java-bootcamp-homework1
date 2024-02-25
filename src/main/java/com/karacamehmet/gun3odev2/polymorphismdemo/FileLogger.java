package com.karacamehmet.gun3odev2.polymorphismdemo;

public class FileLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
    }
}
