package com.tms.homework.han.epamTasks.basic;

//        Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//        все числа от 1 до введенного пользователем числа


import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число!");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Введите целое положительное число!");
            number = scanner.nextInt();
        }
        System.out.println(sum(number));
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
