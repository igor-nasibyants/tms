package com.tms.homework.han.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        CarModernisation modernisation = new CarModernisation(new BMWModernisation());
        String up = "BMW-Audi";
        modernisation.update(up);

        up = "Audi-BMW";
        modernisation.setModern(new AudiModernisation());
        modernisation.update(up);
    }
}
