package com.tms.homework.max.polevoy.task7.interfaceImplementation;

public interface Moveable {
    //объявление переменных - константы.
    // Переменные чвляются public static final по умолчанию
    // и они не обязательны
    int RIGHT = 1;
    int LEFT = 2;
    int UP = 3;
    int DOWN = 4;

    //объявление методов
    void moveRight();

    void moveLeft();
}
