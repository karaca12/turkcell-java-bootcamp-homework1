package com.karacamehmet.gun3odev2.abstractdemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public CustomerManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void getCustomers() {
        databaseManager.getData();
    }
}
