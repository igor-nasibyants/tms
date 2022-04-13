package com.tms.homework.pavelgrigoryev.task8.shopDIY.staff;

import com.tms.homework.pavelgrigoryev.task8.shopDIY.Human;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.interfaces.Managedable;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.interfaces.Saleable;

public class DepartmentHead extends Human implements Managedable, Saleable {
    public DepartmentHead(String name, int age, String mood, String efficiency) {
        super(name, age, mood, efficiency);
    }

    @Override
    public void manage() {
        System.out.println(getName() + " проводит профилактическую работу со своими подчинёнными ");
    }

    @Override
    public void sale() {
        System.out.println("Руководитель отдела " + getName() + " " + getAge() + " лет(года) " + " предлогает товар с " + getMood() + " настроением и " + getEfficiency() + " эффективностью ");
    }

    @Override
    public void lunch() {
        System.out.println("Пошла кушать пельмени !!!");
    }
}
