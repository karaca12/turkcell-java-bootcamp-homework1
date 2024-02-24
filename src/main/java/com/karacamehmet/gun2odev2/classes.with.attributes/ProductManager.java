package com.karacamehmet.gun2odev2.classes.with.attributes;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Product added: " + product.getName() + ", " + product.getCode());
    }
}
