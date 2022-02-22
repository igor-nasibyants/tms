package com.tms.homework.maria.varabyova.task3;
/*
6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
 */

public class OneDimArray06 {
    public static void main(String args[]) {
        int a1[] = new int[5];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = (0 + (int) (Math.random() * 15));
            System.out.print(a1[i] + " ");
        }

        for (int i = 0; i < a1.length; i++) {
            if (i > 0) {
                if (a1[i - 1] >= a1[i]) {
                    System.out.println("Не является строго возрастающей последовательностью.");
                    break;
                }
            }
            if (i == a1.length - 1)
                System.out.println("Строго возрастающая последовательность.");
        }
    }
}
