package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.PersonnelDepartment;

public class HumanResourcesDepartment implements PersonnelDepartment {
    @Override
    public void firesAnEmployee() {
        System.out.println("Увальняет младшего контруктора за косяки");
    }
}
