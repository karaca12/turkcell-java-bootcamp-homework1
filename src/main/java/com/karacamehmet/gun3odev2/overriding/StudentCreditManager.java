package com.karacamehmet.gun3odev2.overriding;

public class StudentCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
