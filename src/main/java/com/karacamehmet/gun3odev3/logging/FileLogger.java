package com.karacamehmet.gun3odev3.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logging to file: "+message);

    }
}
