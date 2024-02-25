package com.karacamehmet.gun3odev2.staticdemo;

public class ProductValidator {
    static {
        System.out.println("Static block has been initialized!");
    }

    public static boolean isValid(Product product) {
        return product.getPrice() > 0 && !product.getName().isEmpty();
    }

    public static class InnerClass {
        public static void doAThing(){
            System.out.println("Something...");
        }
    }

}
