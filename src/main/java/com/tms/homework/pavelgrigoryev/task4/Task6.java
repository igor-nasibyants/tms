package com.tms.homework.pavelgrigoryev.task4;

public class Task6 {
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
        if (array[0] == array[1]){
            System.out.println("Нулевой элемент равен первому элементу массива ");
        }
        if (array[1] == array[2]){
            System.out.println("Первый элемент равен второму элементу массива ");
        }
        if (array[2] == array[3]){
            System.out.println("Второй элемент равен третьему элементу массива ");
        }
        if (array[0] == array[2]){
            System.out.println("Нулевой элемент равен второму элементу массива");
        }
        if (array[1] == array[3]) {
            System.out.println("Первый элемент равен третьему элементу массива");
        }
        if (array[0] == array[3]) {
            System.out.println("Нулевой элемент равен третьему элементу массива");
        }
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