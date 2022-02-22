package com.tms.homework.pavelgrigoryev.task4;

public class Task3 {
    public static void main(String[] args) {
        jump();
    }

    public static void jump() {
        int[] array;
        int count = 0;
        int count2 = 0;
        int c = (int) (Math.random() * 3 + 1);
        for (int i = 0; i < 15; i++) {
            array = new int[(int) (Math.random() * 99)];
            System.out.print(array.length + " ");
            if (array.length % 2 == 0) {
                count2 += array.length;
                count++;
            }
        }
        System.out.println();
        System.out.println(count2);
        System.out.println("Количество четных элементов : " + count);
        System.out.println("Средне арифметическое четных элементов массива " + (double) count2 / count + ", превосходящее число С равное " + c);
    }
}

