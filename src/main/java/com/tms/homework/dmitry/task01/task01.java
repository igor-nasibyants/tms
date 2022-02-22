package com.tms.homework.dmitry.task01;

public class task01 {
    public static void main(String[] args) {

        int[] arrays = new int[10];
        int a, b;
        for (a = 4, b = 3; a < arrays.length & b <= 20; a++, b += 2) {
            arrays[a] = b;
            System.out.print(arrays[a] + " "); // пишем в строку
            System.out.print("в строку");

        }
        System.out.println();
        for (int c : arrays) {
            System.out.println(c + " ");// пишем в столбик
        }

    }
}

