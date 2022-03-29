package com.tms.homework.han.task18.streamsTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {

        //        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//        арифметическое элементов каждого массива и сообщите, для какого из
//        массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).

        List<Integer> firstArr = new ArrayList<>(new Random()
                .ints(5, 0, 20)
                .boxed()
                .toList());
        List<Integer> secondArr = new ArrayList<>(new Random()
                .ints(5, 0, 20)
                .boxed()
                .toList());
        firstArr.forEach(s -> System.out.print(s + " "));
        System.out.println();
        secondArr.forEach(s -> System.out.print(s + " "));
        System.out.println();

        double averageFirstArr = firstArr.stream()
                .mapToInt(v -> v)
                .average()
                .orElseThrow();
        double averageSecondArr = secondArr.stream()
                .mapToInt(v -> v)
                .average()
                .orElseThrow();
        if (averageFirstArr > averageSecondArr) {
            System.out.println("First");
        } else if (averageSecondArr > averageFirstArr) {
            System.out.println("Second");
        } else {
            System.out.println("Equals");
        }

        //      «Сожмите» массив, выбросив из него каждый второй элемент.
//      «Освободившиеся» места массива заполните нулями

        IntStream.iterate(0, i -> i < firstArr.size(), i -> i + 1)
                .filter(v -> v % 2 == 0)
                .forEach(s -> System.out.print(firstArr.get(s) + " "));

        System.out.println();

        IntStream.iterate(0, i -> i < firstArr.size(), i -> i + 1)
                .filter(v -> v % 2 != 0)
                .forEach(i -> firstArr.set(i, 0));

        firstArr.forEach(s -> System.out.print(s + " "));
    }
}
