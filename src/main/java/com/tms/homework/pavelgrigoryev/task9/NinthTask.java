package com.tms.homework.pavelgrigoryev.task9;

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число : ");
        int input = scanner.nextInt();
        while (input <= 0) {
            System.out.println("Нужно ввести положительное число ! : ");
            input = scanner.nextInt();
        }
        int[] array = new int[input];
            for (int i = 0; i < args.length; i++) {
                array[i] = (int) (Math.random() * 15);
                System.out.print(array[i] + " ");
            }
    }
}
