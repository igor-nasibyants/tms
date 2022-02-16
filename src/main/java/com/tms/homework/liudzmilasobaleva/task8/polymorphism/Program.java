package com.tms.homework.liudzmilasobaleva.task8.polymorphism;

public class Program {
    public static void main(String[] args) {
        Vehicle boeing737 = new Plane();
        boeing737.move();

        Vehicle saab = new Car();
        saab.move();
    }
}