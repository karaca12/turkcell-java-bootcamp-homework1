package com.karacamehmet.gun3odev3.logging.impl;

import com.karacamehmet.gun3odev3.logging.interf.Logger;

public class EmailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging to email: "+message);
    }
}
