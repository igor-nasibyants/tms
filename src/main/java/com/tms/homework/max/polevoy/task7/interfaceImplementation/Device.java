package com.tms.homework.max.polevoy.task7.interfaceImplementation;

public abstract class Device implements Moveable {
    //реализация только одного метода интерфейса Moveable.
    //класс который реализует не все методы интерфейса  наз. абстрактным классом
    public void moveRight() {
        System.out.println("Девайс поворачивает вправо.");
    }
}
