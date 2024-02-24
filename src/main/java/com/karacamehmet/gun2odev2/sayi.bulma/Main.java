package com.karacamehmet.gun2odev2.sayi.bulma;


public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int searched = 5;

        boolean isIn=false;
        for (int number : numbers) {
            if (searched == number) {
                isIn = true;
                break;
            }
        }
        if (isIn){
            System.out.println("Searched number is in the numbers array!");
        }else {
            System.out.println("Searched number is not in the numbers array!");

        }
    }
}