package com.karacamehmet.classes.with.attributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription(":D");
        product.setPrice(52200);
        product.setStockAmount(3);
        product.setColor("Black");

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        Product product2 = new Product(2, "Mouse", ":DD", 2000, 50, "Green");
        productManager.add(product2);
    }
}