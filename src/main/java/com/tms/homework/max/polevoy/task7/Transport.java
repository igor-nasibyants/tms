package com.tms.homework.max.polevoy.task7;

public class Transport  implements Moveable {
    //методы интерфейса Moveable
    public void moveRight() {
        System.out.println("Транспорт поворачивает вправо.");
    }

    public void moveLeft() {
        System.out.println("Транспорт поворачивает влево.");
    }
    //методы класса
    public void stop() {
        System.out.println("Транспорт останавливается.");
    }

    public void start() {
        System.out.println("Транспорт стартует.");
    }
}
