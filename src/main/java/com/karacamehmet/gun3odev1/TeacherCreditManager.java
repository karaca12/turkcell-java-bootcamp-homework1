package com.karacamehmet.gun3odev1;

public class TeacherCreditManager extends BaseCreditManager implements CreditManager {
    @Override
    public void calculate() {
        System.out.println("Teacher credit calculated!");
    }
}
