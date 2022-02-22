package com.tms.homework.max.polevoy.task6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2;
        b2 = b1;

        b1.width = 20;
        b1.height = 30;
        b1.depth = 40;

        b2.width = 5;

        System.out.println("width " + b1.width);
        System.out.println("width " + b2.width);
    }
}
