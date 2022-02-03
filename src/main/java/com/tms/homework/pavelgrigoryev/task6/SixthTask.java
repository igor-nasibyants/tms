package com.tms.homework.pavelgrigoryev.task6;

public class SixthTask {
    public static void main(String[] args) {
        laugh();
    }

    public static void laugh() {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("Массив не является строго возрастающей последовательностью.");
                    break;
                }
            }
            if (i == array.length - 1) {
                System.out.println("Массив является строго возрастающей последовательностью.");
            }
        }
    }
}