package com.tms.homework.han.patterns.creational.builder.domain;

public class Car {
    StringBuilder data;

    public Car() {
        data = new StringBuilder("");
    }

    public StringBuilder getData() {
        return data;
    }

    public void appendData(String str) {
        data.append(str);
    }
}
