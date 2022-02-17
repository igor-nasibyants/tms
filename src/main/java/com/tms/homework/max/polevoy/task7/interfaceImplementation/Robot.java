package com.tms.homework.max.polevoy.task7.interfaceImplementation;

import com.tms.homework.max.polevoy.task7.interfaceImplementation.Moveable;

public class Robot  implements Moveable {
    public void moveRight() {
        System.out.println("Робот поворачивает вправо.");
    }

    public void moveLeft() {
        System.out.println("Робот поворачивает влево.");
    }
}
