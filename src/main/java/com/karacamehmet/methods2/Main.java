package com.karacamehmet.methods2;

public class Main {
    public static void main(String[] args) {
        add();
        delete();
        update();

        String message = "Weather is great today!";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);

        String city = giveCity();
        System.out.println(city);

        int number = addition(1, 2);
        System.out.println(number);

        System.out.println(addition(1, 2, 3, 4, 5));
    }

    public static void add() {
        System.out.println("Added!");
    }

    public static void delete() {
        System.out.println("Deleted!");

    }

    public static void update() {
        System.out.println("Updated!");
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int... numbers) {
        int sum = 0;
        for (int number :
                numbers) {
            sum += number;
        }
        return sum;
    }

    public static String giveCity() {
        return "Ankara";
    }
}