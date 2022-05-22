package com.tms.homework.han.patterns.structural.adapter;

public class USB_C implements USB{
    @Override
    public void connect() {
        System.out.println("Подключили USB-c");
    }
}
