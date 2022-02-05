package com.tms.homework.pavelgrigoryev.task1;

public class FirstTask {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int count = 1;
        System.out.println("Строка: ");
        for (int k : array) {
            System.out.print(k + " ");
            if (k % 3 == 0) {
                count *= k;
            }
        }
        System.out.println();
        System.out.println("Столбик: ");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("Произведение элементов массива кратных 3 : " + count);
    }
}
