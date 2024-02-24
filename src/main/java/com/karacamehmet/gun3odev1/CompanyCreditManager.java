package com.karacamehmet.gun3odev1;

public class CompanyCreditManager extends BaseCreditManager implements CreditManager{
    @Override
    public void calculate() {
        System.out.println("Company credit calculated!");
    }
}
