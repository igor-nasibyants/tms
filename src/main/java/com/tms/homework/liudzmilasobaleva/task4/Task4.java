package com.tms.homework.liudzmilasobaleva.task4;

import java.util.Random;

public class Task4 {
    //4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
    // массив на экран в строку. Замените каждый элемент с нечётным индексом на
    //ноль. Снова выведете массив на экран на отдельной строке.
    public static void main(String[] args) {
        Random r = new Random();
        Integer array[] = new Integer[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(20);
        }
        System.out.println("================================================================");
        System.out.println("                                                                ");
        System.out.print("Array:     ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("New array: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("                                                                ");
        System.out.println("================================================================");
    }
}


