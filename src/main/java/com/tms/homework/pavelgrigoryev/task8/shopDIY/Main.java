package com.tms.homework.pavelgrigoryev.task8.shopDIY;

import com.tms.homework.pavelgrigoryev.task8.shopDIY.departments.StoreDepartments;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.staff.*;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier("Татьяна", 35,"веселым", "высокой");
        System.out.println("***************************************************************************************************************************************************");
        cashier.sale();
        StoreDepartments storeDepartments5 = StoreDepartments.DEPARTMENT_NUM_FIVE;
        System.out.println(storeDepartments5);
        cashier.lunch();
        System.out.println("***************************************************************************************************************************************************");

        Vendor vendorSeven = new Vendor("Альбина", 31, "пляшущим", "низкой");
        vendorSeven.sale();
        StoreDepartments storeDepartments8 = StoreDepartments.DEPARTMENT_NUM_EIGHT;
        System.out.println(storeDepartments8);
        System.out.println("***************************************************************************************************************************************************");

        Vendor vendorSix = new Vendor("Джонаджеймсон", 49, "американским", "бургерской");
        vendorSix.sale();
        StoreDepartments storeDepartments7 = StoreDepartments.DEPARTMENT_NUM_SEVEN;
        System.out.println(storeDepartments7);
        System.out.println("***************************************************************************************************************************************************");

        Vendor vendorFive = new Vendor("Михаил", 25, "напольным", "кавровой");
        vendorFive.sale();
        StoreDepartments storeDepartments6 = StoreDepartments.DEPARTMENT_NUM_SIX;
        System.out.println(storeDepartments6);
        vendorFive.lunch();
        System.out.println("***************************************************************************************************************************************************");

        Vendor vendorFour = new Vendor("Евгений", 19, "демонским", "орковской");
        vendorFour.sale();
        StoreDepartments storeDepartments4 = StoreDepartments.DEPARTMENT_NUM_FOUR;
        System.out.println(storeDepartments4);
        vendorFour.lunch();
        System.out.println("***************************************************************************************************************************************************");

        Vendor vendorThree = new Vendor("Виктор", 26, "ангельским", "гейской");
        vendorThree.sale();
        StoreDepartments storeDepartments3 = StoreDepartments.DEPARTMENT_NUM_THREE;
        System.out.println(storeDepartments3);
        System.out.println("***************************************************************************************************************************************************");

        Vendor vendorTwo = new Vendor("Вася", 29, "классным", "мутной");
        vendorTwo.sale();
        StoreDepartments storeDepartments1 = StoreDepartments.DEPARTMENT_NUM_ONE;
        System.out.println(storeDepartments1);
        System.out.println("***************************************************************************************************************************************************");

        Vendor vendor = new Vendor("Димас", 23,"грустным", "вялой");
        vendor.sale();
        StoreDepartments storeDepartments2 = StoreDepartments.DEPARTMENT_NUM_TWO;
        System.out.println(storeDepartments2);
        vendor.lunch();
        System.out.println("***************************************************************************************************************************************************");

        Customer customer = new Customer("Ксения", 45);
        customer.pay();
        customer.lunch();
        System.out.println("***************************************************************************************************************************************************");

        DeputyHeadOfDepartment deputyHeadOfDepartment = new DeputyHeadOfDepartment("Алексей", 37, "бодипозитивным", "космической");
        deputyHeadOfDepartment.sale();
        System.out.println(storeDepartments2);
        deputyHeadOfDepartment.manage();
        deputyHeadOfDepartment.lunch();
        System.out.println("***************************************************************************************************************************************************");

        DepartmentHead departmentHead = new DepartmentHead("Анна", 37, "энергечным", "супер");
        departmentHead.sale();
        StoreDepartments storeDepartments9 = StoreDepartments.DEPARTMENT_NUM_NINE;
        System.out.println(storeDepartments9);
        departmentHead.manage();
        departmentHead.lunch();
        System.out.println("***************************************************************************************************************************************************");

        StoreManager storeManager = new StoreManager("Александр", 40);
        storeManager.manage();
        storeManager.lunch();
        System.out.println("***************************************************************************************************************************************************");
    }
}
