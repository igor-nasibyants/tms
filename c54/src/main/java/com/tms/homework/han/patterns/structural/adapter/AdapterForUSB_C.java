package com.tms.homework.han.patterns.structural.adapter;

public class AdapterForUSB_C extends USB_C implements USB {
    @Override
    public void connect() {
        System.out.println("Адаптер для USB-C");
        super.connect();
    }
}
