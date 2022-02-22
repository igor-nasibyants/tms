package com.tms.homework.asilius1.task6;

import java.util.Scanner;


public class Car {

    private static Scanner str = new Scanner(System.in);

    public static void info() {
        Engine diz = new Engine();

        System.out.println("Ввести тип двигателя ");
        diz.setType(str.next());
        System.out.println(System.lineSeparator());

        System.out.println("Ввести объём двигателя " + System.lineSeparator());
        diz.setPower(readDoubleput());
        System.out.println(System.lineSeparator());

        System.out.println(diz.toString() + System.lineSeparator());

    }

    public static double readDoubleput() {
        return str.nextDouble();
    }

}
