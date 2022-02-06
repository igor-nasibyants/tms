package com.tms.homework.nikitaelenski.task1;

import java.util.Random;
import java.util.Scanner;

public class LessonOne {

    public static void EvenNumbers() {
        int[] Arr = new int[10];
        System.out.println("массив из всех чётных чисел от 2 до 20");
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Arr[b] = i;
                System.out.print(Arr[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        System.out.println("в столбик");
        for (int s = 0; s < Arr.length; s++) {
            System.out.println(Arr[s] + " ");
        }
    }
    public static void OddNumbers() {
        int num = 0;
        System.out.println("массив из всех нечётных чисел от 1 до 99");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) ;
            num++;
        }
        int[] arrays = new int[num];
        for (int u = 1, v = 0; u <= 99; u++) {
            if (u % 2 == 1) {
                arrays[v] = u;
                System.out.print(arrays[v] + " ");
            }
        }
        System.out.print(" ");
        System.out.println("массив из всех нечётных чисел от 1 до 99 ,  но на оборот");
        for (int u = 99, v = 0; u >= 1; u--) {
            if (u % 2 == 1) {
                arrays[v] = u;
                System.out.print(arrays[v] + " ");
            }
        }

    }
    public static void RandomNinetyNine() {
        int b = 0;
        int[] array = new int[15];
        System.out.println("15 случайных целых чисел из отрезка [0; 99]");
        for (int x = 0; x < array.length; x++) {
            Random rnd = new Random();
            array[x] = rnd.nextInt(99);
            System.out.print(b + " ");
            System.out.print(array[x] + " ");
            if (array[x] > 0 & array[x] % 2 == 0) {
                b++;
            }
        }
        System.out.println(" ");
        System.out.print("в массиве " + b + " чётных элементов");
    }
    public static void ZeroReplecement() {
        Random rnd = new Random();
        int[] arr = new int[20];
        System.out.println("массив из 20 случайных целых чисел из отрезка [0;20]");
        for (int x = 0; x < arr.length; x++) {
            arr[x] = rnd.nextInt(20);
            System.out.print(arr[x] + " ");
            if (arr[x] > 0 & arr[x] % 2 == 1) {
                arr[x] = 0;
            }
        }
        System.out.println(" ");
        System.out.println("Замена нечетных знаков на '0' ");
        for (int s = 0; s < arr.length; s++) {
            System.out.print(arr[s] + " ");
        }
    }
    public static void RandomDoubleArr() {
        Random rand = new Random();
        int[] FirstArray = new int[5];
        int[] SecondArray = new int[5];
        System.out.println("Первый массив");
        for (int s = 0; s < FirstArray.length; s++) {
            FirstArray[s] = rand.nextInt(15);
            System.out.print(FirstArray[s] + " ");
        }
        System.out.println(" ");
        System.out.println("Второй массив");
        for (int d = 0; d < SecondArray.length; d++) {
            SecondArray[d] = rand.nextInt(15);
            System.out.print(SecondArray[d] + " ");
        }
        System.out.println(" ");
        int d = SummArray(FirstArray);
        int h = SummArray(SecondArray);
        System.out.print("Среднее арифметическое , Первого массива ");
        System.out.println(d);
        System.out.print("Среднее арифметическое , Второго массива ");
        System.out.println(h);
        if (d > h) {
            System.out.print("Первый массив больше");
        } else {
            System.out.print("Второй массив больше");
        }


    }
    public static int SummArray(int[] arr) {
        int j = 0;
        for (int d = 0; d < arr.length; d++) {
            j = arr[d] + j;
        }
        return j / arr.length;
    }
    public static String ArrayIsStrictlyIncreasing() {
        Random rand = new Random();
        String y = " ";
        int[] Array = new int[4];
        for (int x = 0; x < Array.length; x++) {
            Array[x] = rand.nextInt(10);
            System.out.print(Array[x] + " ");
        }
        for (int s = 0; s < Array.length - 1; s++) {
            if (Array[s] > Array[s + 1]) {
                y = "Массив является строго возрастающей последовательностью";
            } else {
                y = "Массив не является строго возрастающей последовательностью";
            }
        }
        return y;
    }
    public static int MaximumArrayIndex() {
        int b = 0;
        int MaxValue = 0;
        int[] array = new int[13];
        for (int x = 0; x < array.length; x++) {
            Random rnd = new Random();
            array[x] = rnd.nextInt(15);
            if (array[x] > b) {
                b = array[x];
            }
        }
        for (int s = 0; s < array.length; s++) {
            if (array[s] == b) {
                MaxValue = s;
            }
        }
        return MaxValue;
    }
    public static void NumberOfIntegers() {
        int count = 0;
        int[] FirstArray = new int[10];
        int[] SecondArray = new int[10];
        double[] ThirtArray = new double[10];
        System.out.print("Первый массив: ");
        PrintRandomArrInt(FirstArray);
        System.out.print("Второй массив: ");
        PrintRandomArrInt(SecondArray);
        System.out.print("Третий массив: ");
        PrintRandomArrDouble(ThirtArray);
        System.out.print("Третий массив измененный : ");
        for (int s = 0; s < ThirtArray.length; s++) {
            ThirtArray[s] = (double) SecondArray[s] / FirstArray[s];
            System.out.print(ThirtArray[s] + " ");
            if (ThirtArray[s] % 1 == 0) {
                count++;
                if (ThirtArray[s] == 0) {
                    count--;
                }
            }
        }
        System.out.println();
        System.out.println("Количество целых элементов в 3 массиве: " + count);

    }
    public static void PrintRandomArrInt(int arr[]) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(9);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void PrintRandomArrDouble(double arr[]) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(9);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void LeftOrRrightMore(int ArraySize) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int RightPart = 0;
        int LeftPart = 0;
        while (ArraySize <= 0) {
            System.out.println("Вы ввели неправильное число попробуйте еще раз. ");
            ArraySize = scanner.nextInt();
        }
        int[] Size = new int[ArraySize];
        System.out.println("Распечатаем массив который получился");
        for (int i = 0; i < Size.length; i++) {
            Size[i] = rnd.nextInt(15);
            System.out.print(Size[i] + " ");
            if (i < Size.length / 2) {
                LeftPart += Size[i];
            } else {
                RightPart += Size[i];
            }
        }

        System.out.println(" ");
        if (LeftPart > RightPart ) {
            System.out.println("Сумма чисел в левой части больше");
        }else if (LeftPart < RightPart ) {
            System.out.println("Сумма чисел в правой части больше");
        }else {
            System.out.println("Сумма чисел равна");

        }
    }
}
