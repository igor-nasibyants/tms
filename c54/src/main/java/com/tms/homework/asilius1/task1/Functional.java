package com.tms.homework.asilius1.task1;

import static com.tms.homework.asilius1.Main.readInput;

public class Functional {

    public static void bitReset() {

        System.out.println("Введите значение, над которым будут проводиться действия: ");
        int i = readInput();

        System.out.println(" " + System.lineSeparator() + "Значение i в десятичном виде " + i + System.lineSeparator()
                + "Значение i в двоичном виде " + Integer.toBinaryString(i) + System.lineSeparator() + " ");

        System.out.println("Введите значение необходимого бита= ");
        int g = readInput();

        int res = i & ~(1 << g);
        System.out.println(" " + System.lineSeparator() + "Результат в десятичном виде: " + res + System.lineSeparator()
                + "Результат в двоичном виде: " + Integer.toBinaryString(res) + System.lineSeparator() + " ");
    }

    public static void bitShift() {

        System.out.println("Введите значение, над которым будут проводиться действия: ");
        int i = readInput();

        System.out.println(" " + System.lineSeparator() + "Значение i в десятичном виде " + i + System.lineSeparator()
                + "Значение i в двоичном виде " + Integer.toBinaryString(i) + System.lineSeparator() + " ");

        if (i > 0) {
            System.out.println("Введите значение, на сколько бит необходимо произвести сдвиг: ");
            int g = readInput();
            int res = i >> g;
            System.out.println(" " + System.lineSeparator() + "---побитовый сдвиг вправо ---");
            System.out.println("Результат в десятичном виде: " + res + System.lineSeparator()
                    + "Результат в двоичном виде: " + Integer.toBinaryString(res) + System.lineSeparator() + " ");
            res = i << g;
            System.out.println("---побитовый сдвиг влево---" + System.lineSeparator()
                    + "Результат в десятичном виде: " + res + System.lineSeparator()
                    + "Результат в двоичном виде: " + Integer.toBinaryString(res) + System.lineSeparator()
                    + "Число " + i + " увеличилась в " + Math.pow(2.0D, g) + " раз при сдвиге влево." + System.lineSeparator() + " ");
        } else {
            System.out.println("значение " + i + " отрицательное." + System.lineSeparator() + " ");
        }
    }

}
