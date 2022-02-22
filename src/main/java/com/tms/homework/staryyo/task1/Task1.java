package com.tms.homework.staryyo.task1;

public class Task1 {
    public static void main(String[] args) {

        int[] arrays = new int[10];
        int a, b;
        for (a = 0, b = 2; a < arrays.length & b <= 20; a++, b += 2) {
            arrays[a] = b;
            System.out.print(arrays[a] + " "); // в строку
        }
        System.out.println();
        for (int c : arrays) {
            System.out.println(c + " ");// в столбик

        }

    }


}