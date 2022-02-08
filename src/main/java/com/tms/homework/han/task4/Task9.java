package com.tms.homework.han.task4;

import java.util.Scanner;

//        Пользователь должен указать с клавиатуры положительное число, а
//        программа должна создать массив указанного размера из случайных целых
//        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//        определить и сообщить пользователю о том, сумма какой половины массива
//        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//        пользователь введёт неподходящее число, то выдать соответствующее
//        сообщение


public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstArrSum = 0;
        int secondArrSum = 0;
        System.out.println("Введите положительное и четное число");
        int numbersOfArray = scanner.nextInt();
        while (numbersOfArray <= 0 || numbersOfArray % 2 != 0) {
            System.out.println("Вы ввели неподходящее число!!! Попробуйте еще раз. Оно должно быть положительным и четным");
            numbersOfArray = scanner.nextInt();
        }
        int[] arr = new int[numbersOfArray];
        System.out.print("Полученный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
            System.out.print(arr[i] + " ");
            if (i < arr.length / 2) {
                firstArrSum += arr[i];
            } else {
                secondArrSum += arr[i];
            }
        }
        System.out.println();
        System.out.println(firstArrSum > secondArrSum ? "Сумма чисел в левой части больше" : "Сумма чисел в правой части больше");
    }
}
