package com.tms.homework.pavelgrigoryev.Task1;

public class FirstTask {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Строка: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Столбик: ");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
