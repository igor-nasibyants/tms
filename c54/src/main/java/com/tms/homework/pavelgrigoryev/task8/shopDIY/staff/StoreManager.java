package com.tms.homework.pavelgrigoryev.task8.shopDIY.staff;

import com.tms.homework.pavelgrigoryev.task8.shopDIY.Human;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.interfaces.Managedable;

public class StoreManager extends Human implements Managedable {

    public StoreManager(String name, int age) {
        super(name, age);
    }

    @Override
    public void manage() {
        System.out.println("Директор магазина " + getName() + " " + getAge() + " лет(года) " + " проводит профилактическую работу со всеми руководителями отделов ");
    }

    @Override
    public void lunch() {
        System.out.println("Пошёл кушать большущий торт!");
    }
}
