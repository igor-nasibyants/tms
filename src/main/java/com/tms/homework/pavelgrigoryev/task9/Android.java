package com.tms.homework.pavelgrigoryev.task9;

import static java.lang.System.out;

public final class Android extends Person {
    public Android(String name, String model, String speciality) {
        super(name, model, speciality);
    }

    @Override
    public void work() {
        out.println("Контролирую человеков ...");
    }

    @Override
    public void talk() {
        out.println("Человеки должны работать, а Андроид - отдыхать!");
    }
}
