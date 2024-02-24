package com.karacamehmet.gun2odev2.inheritancedemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new SoldierCreditManager());
        creditUI.calculateCredit(new TeacherCreditManager());
        creditUI.calculateCredit(new AgricultureCreditManager());
    }
}
