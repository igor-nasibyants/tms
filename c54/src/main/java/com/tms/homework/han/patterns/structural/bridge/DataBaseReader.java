package com.tms.homework.han.patterns.structural.bridge;

public class DataBaseReader implements DateRead{
    @Override
    public void read() {
        System.out.println("Данные из БД");
    }
}
