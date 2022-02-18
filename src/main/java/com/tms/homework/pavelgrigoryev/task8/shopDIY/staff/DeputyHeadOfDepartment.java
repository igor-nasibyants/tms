package com.tms.homework.pavelgrigoryev.task8.shopDIY.staff;

import com.tms.homework.pavelgrigoryev.task8.shopDIY.Human;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.interfaces.Managedable;
import com.tms.homework.pavelgrigoryev.task8.shopDIY.interfaces.Saleable;

public class DeputyHeadOfDepartment extends Human implements Managedable, Saleable {
    public DeputyHeadOfDepartment(String name, int age, String mood, String efficiency) {
        super(name, age, mood, efficiency);
    }

    @Override
    public void manage() {
        System.out.println(getName() +  " выписывает лещей продавцам ");
    }

    @Override
    public void sale() {
        System.out.println("Заместитель руководителя отдела " + getName() + " " + getAge() + " лет(года) " + " предлогает товар с " + getMood() + " настроением и " + getEfficiency() + " эффективностью ");
    }

    @Override
    public void lunch() {
        System.out.println("Пошёл кушать борщ со сметаной и прятаться от Ксении");
    }
}
