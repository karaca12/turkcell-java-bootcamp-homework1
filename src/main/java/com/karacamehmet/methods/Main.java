package com.karacamehmet.methods;


public class Main {
    public static void main(String[] args) {
        searchingNumber(1);
        searchingNumber(2);
        searchingNumber(6);
        searchingNumber(8);
    }

    public static void searchingNumber(int searched) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};

        boolean isIn = false;
        for (int number : numbers) {
            if (searched == number) {
                isIn = true;
                break;
            }
        }

        if (isIn) {
            printMessage("Searched number is in the numbers array! The number is: " + searched);
        } else {
            printMessage("Searched number is not in the numbers array! The number is: " + searched);
        }

    }

    public static void printMessage(String message) {
        System.out.println(message);

    }
}