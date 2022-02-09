package com.tms.homework.pavelgrigoryev.task4;

public class Task2 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        int[] array = new int[99];
        int count = 0;
        int count2 = 0;
        System.out.println("Вывод нечётных чисел от 1 до 99 : ");
        for (int i = 0; i < array.length; i += 2) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
            count += array[i];
            count2 ++;
        }
        System.out.println();
        System.out.println("Вывод нечётных чисел в обратном порядке : ");
        for (int i = 0; i < array.length; i += 2) {
            array[i] = 99 - i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифметическое значение элементов с нечётными номерами равно : " + count/count2);
    }
}
