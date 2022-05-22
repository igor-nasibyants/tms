package com.tms.homework.han.patterns.structural.bridge;

public class FileReader implements DateRead{
    @Override
    public void read() {
        System.out.println("Данные из файла");
    }
}
