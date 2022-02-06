package com.tms.homework.liudzmilasobaleva.task1;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    //9)Пользователь должен указать с клавиатуры положительное число, а
    //программа должна создать массив указанного размера из случайных целых
    //чисел из [0;15] и вывести его на экран в строку. После этого программа должна
    //определить и сообщить пользователю о том, сумма какой половины массива
    //больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
    // то выдать соответствующее сообщение

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("============================================================================");
        System.out.println("Please enter a number to set array size");

        double n = sc.nextDouble();

        while (n <= 0 || n != Math.floor(n) || n % 2 != 0) {      //проверяем, подходит ли число
            if (n < 0) {
                System.out.println("Please enter a positive number");
            }
            if (n == 0) {
                System.out.println("Please don't enter zero to create an array");
            }
            if (n != Math.floor(n)) {
                System.out.println("Please enter an integer number");
            }
            if (n % 2 != 0) {
                System.out.println("Please enter an even number to divide the array into two halves");
            }
            n = sc.nextDouble();
        }

        int size = (int) n;                     //если число подходит, выводим массив
        int array[] = new int[size];
        System.out.print("Your array is: ");
        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum1 = 0;                          //находим суммы левой и правой половин массива
        int sum2 = 0;
        for (int i = 0; i <= size / 2 - 1; i++) {
            sum1 = sum1 + array[i];
        }
        for (int i = size / 2; i <= size - 1; i++) {
            sum2 = sum2 + array[i];
        }
        System.out.println("The sum of the first half is " + sum1); //для наглядности
        System.out.println("The sum of the second half is " + sum2);


        if (sum1 > sum2) {                      //сравниваем суммы двух половин массива
            System.out.println("The sum of the first half of the array is greater");
        } else if (sum1 < sum2) {
            System.out.println("The sum of the second half of the array is greater");
        } else {
            System.out.println("The sums of the two halves of the array are equal");
        }
        System.out.println("============================================================================");
    }
}



