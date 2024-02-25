package com.karacamehmet.gun3odev2.abstractclasses;

public abstract class GameCalculator {
    public abstract void calculate();

    public void gameOver() {
        System.out.println("Game Over!");
    }
}
