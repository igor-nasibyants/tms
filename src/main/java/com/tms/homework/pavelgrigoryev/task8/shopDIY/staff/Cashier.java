package com.tms.homework.pavelgrigoryev.task8.shopDIY.staff;

import com.tms.homework.pavelgrigoryev.task8.shopDIY.Human;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.interfaces.Saleable;

public class Cashier extends Human implements Saleable {
    public Cashier(String name, int age, String mood, String efficiency) {
        super(name, age, mood, efficiency);
    }

    @Override
    public void sale() {
        System.out.println("Кассир " + getName() + " " + getAge() + " лет(года) " + " пробивает товар на кассе с " + getMood() + " настроением и " + getEfficiency() + " эффективностью ");
    }

    @Override
    public void lunch() {
        System.out.println("Пошла кушать диетическую еду!");
    }
}
