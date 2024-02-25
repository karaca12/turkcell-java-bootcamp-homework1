package com.karacamehmet.gun3odev2.abstractclasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void calculate() {
                System.out.println("Your points: 50");
            }
        };
        gameCalculator.calculate();
        gameCalculator.gameOver();

        GameCalculator gameCalculator1=new KidsGameCalculator();
        gameCalculator1.calculate();
        gameCalculator1.gameOver();
    }
}
