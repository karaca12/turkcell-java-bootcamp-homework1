package com.karacamehmet.gun3odev2.staticdemo;

public class ProductManager {
    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println("Product added!");
            ProductValidator.InnerClass.doAThing();
        } else {
            System.out.println("Couldn't add the product!");
        }

    }
}
