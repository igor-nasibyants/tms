package com.tms.homework.maria.varabyova.task3;

/* 2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 … 7 5 3 1).*/

public class OneDimArray02 {
    public static void main(String args[]) {
        int a[] = new int[50];
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                a[(i - 1) / 2] = i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
}
