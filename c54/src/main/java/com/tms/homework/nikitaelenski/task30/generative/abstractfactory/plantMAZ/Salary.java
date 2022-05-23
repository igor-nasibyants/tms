package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.Accountant;

public class Salary implements Accountant {
    @Override
    public void transfersSalary() {
        System.out.println("Перечислят зарплату всем работникак , кроме младшего конструктора ");
    }
}
