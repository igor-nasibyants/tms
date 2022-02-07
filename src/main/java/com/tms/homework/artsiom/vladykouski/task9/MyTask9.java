package com.tms.homework.artsiom.vladykouski.task9;
import java.util.Random;
import java.util.Scanner;

public class MyTask9 {
    public static void main(String[] args) {
        //9)Пользователь должен указать с клавиатуры положительное число,
        // а программа должна создать массив указанного размера из случайных
        // целых чисел из [0;15] и вывести его на экран в строку.
        // После этого программа должна определить и сообщить пользователю о том,
        // сумма какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
        // Если пользователь введёт неподходящее число, то выдать соответствующее сообщение
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i = sc.nextInt();
        int j, b;
        int sum1 = 0, sum2 = 0;
        int[] arrays = new int[i];
        for (j = 0; j < i; j++) {
            arrays[j] = r.nextInt(16);
            System.out.print(" " + arrays[j] + " ");
        }
        System.out.println(" ");
        if (i > 1) {
            for (j = 0; j < i / 2; j++) {
                sum1 = sum1 + arrays[j];
            }
            System.out.print("Сумма левой половины = " +sum1);
            System.out.println("");
            for (j = i / 2; j < i; j++) {
                sum2 = sum2 + arrays[j];
            }
            System.out.print("Сумма правой половины = " +sum2);
        } else {
            System.out.print(" Введено неподходящее число");
        }
        System.out.println(" ");
        if (sum1 > sum2 & i > 1) {
            System.out.print("Сумма левой половины больше правой");
        } else {
            if (sum1 == sum2 & i > 1) {
                System.out.print("Суммы модулей равны ");
            } else {
                if (i > 1) {
                    System.out.print("Сумма правой половины больше левой");
                }
            }
        }
    }
}

