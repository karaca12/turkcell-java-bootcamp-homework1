package com.karacamehmet.gun3odev2.staticdemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product = new Product(1, "Laptop", 5000);

        productManager.add(product);

        Product product1 = new Product(1, "", 0);
        productManager.add(product1);

        DatabaseHelper.Connection.createConnection();

        DatabaseHelper.CRUD.create();
        DatabaseHelper.CRUD.read();
    }
}
