package com.tms.homework.han.patterns.creational.prototype;

interface Car {
    void setName(String name);
    String getName();
    Car clone();
}
