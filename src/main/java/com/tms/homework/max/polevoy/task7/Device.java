package com.tms.homework.max.polevoy.task7;

public abstract class Device implements Moveable {
    //реализация только одного метода интерфейса Moveable
    public void moveRight() {
        System.out.println("Девайс поворачивает вправо.");
    }
}
