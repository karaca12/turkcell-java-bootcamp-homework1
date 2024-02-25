package com.karacamehmet.gun3odev2.abstractdemo;

public class MysqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data has been brought: Mysql");
    }
}
