package com.tms.homework.han.patterns.structural.decorator;

public class Translator implements Processor {
    private String data;

    public Translator(String data) {
        this.data = data;
    }

    @Override
    public void process() {
        System.out.println("Строка: " + data + " переведена");
    }
}
