package com.tms.homework.nikitaelenski.task30.patterns.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.patterns.abstractfactory.PersonnelDepartment;

public class HumanResourcesDepartment implements PersonnelDepartment {
    @Override
    public void firesAnEmployee() {
        System.out.println("Увальняет младшего контруктора за косяки");
    }
}
