package com.tms.homework.pavelgrigoryev.task8.shopDIY.staff;

import com.tms.homework.pavelgrigoryev.task8.shopDIY.Human;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.interfaces.Saleable;

public class Vendor extends Human implements Saleable {
    public Vendor(String name, int age, String mood, String efficiency) {
        super(name, age, mood, efficiency);
    }

    @Override
    public void sale() {
        System.out.println("Продавец " + getName() + " " + getAge() + " лет(года) " + " предлогает товар с " + getMood() + " настроением и " + getEfficiency() + " эффективностью ");
    }

    @Override
    public void lunch() {
        System.out.println("Пошёл есть шаверму!!!");
    }
}
