package com.karacamehmet.classes.with.attributes;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Product added: " + product.getName() + ", " + product.getCode());
    }
}
