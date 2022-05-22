package com.tms.homework.han.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        USB usb_a = new USB_A();
        USB usb_c = new AdapterForUSB_C();

        usb_a.connect();
        usb_c.connect();
    }
}
