package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.Worker;

public class Mechanic implements Worker {

    @Override
    public void collectsFromBlueprints() {
        System.out.println("Собирает детали которые нарисовал конструктор");
    }
}
