package com.tms.homework.han.creational.builder;

import com.tms.homework.han.creational.builder.car.Audi;
import com.tms.homework.han.creational.builder.car.BMW;
import com.tms.homework.han.creational.builder.domain.Car;
import com.tms.homework.han.creational.builder.domain.Director;
import com.tms.homework.han.creational.builder.domain.IConstructor;

public class Main {
    public static void main(String[] args) {
        IConstructor BMWConstructor = new BMW();
        Director directorBMW = new Director(BMWConstructor);
        Car BMW = directorBMW.releaseCar();
        System.out.println(BMW.getData());

        IConstructor audiConstructor = new Audi();
        Director directorAudi = new Director(audiConstructor);
        Car audi = directorAudi.releaseCar();
        System.out.println(audi.getData());
    }
}