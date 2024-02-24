package com.karacamehmet.gun2odev2.classes;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = customerManager;

        customerManager.add();
        customerManager.remove();
        customerManager.update();

        customerManager2.add();
        customerManager2.remove();
        customerManager2.update();

        System.out.println(customerManager);
        System.out.println(customerManager2);

        int num1=10;
        int num2=20;

        num2=num1;
        num1=30;

        System.out.println(num2);

        int[] nums1=new int[]{1,2,3};
        int[] nums2=new int[]{4,5,6};

        nums2=nums1;
        nums1[0]=10;
        System.out.println(nums2[0]);

    }
}