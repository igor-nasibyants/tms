package com.tms.homework.han.patterns.structural.adapter;

public class USB_A implements USB{
    @Override
    public void connect() {
        System.out.println("Подключили USB-A");
    }
}
