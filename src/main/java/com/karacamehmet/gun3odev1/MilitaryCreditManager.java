package com.karacamehmet.gun3odev1;


public class MilitaryCreditManager extends BaseCreditManager implements CreditManager {

    @Override
    public void calculate() {
        System.out.println("Soldier credit calculated!");
    }
}
