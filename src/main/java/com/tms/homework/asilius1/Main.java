package com.tms.homework.asilius1;

import com.tms.homework.asilius1.task1.Enter;
import com.tms.homework.asilius1.task4.Arrprint;
import com.tms.homework.asilius1.task6.Car;

import java.util.Scanner;

public class Main {
    private static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {

        int i;
        do {
            System.out.println("Меню выбора задания, введите из клавиатуры число из списка:");
            System.out.println("1. Задание с побитовыми операциями.");
            System.out.println("2. Задание с двумерными массивами.");
            System.out.println("3. Задание с классами.");
            System.out.println("0. Выход");

            i = readInput();

            switch (i) {
                case 1:
                    Enter.menu();
                    break;
                case 2:
                    Arrprint.arrPrint();
                    break;
                case 3:
                    Car.info();
                case 0:
                    break;
            }
        }
        while (i != 0);
    }

    public static int readInput() {
        return str.nextInt();
    }


}
