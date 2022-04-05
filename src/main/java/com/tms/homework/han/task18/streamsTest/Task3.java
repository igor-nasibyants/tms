package com.tms.homework.han.task18.streamsTest;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
//        Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//        это количество на экран на отдельной строке.

        List<Integer> list = new Random()
                .ints(15, 0, 100)
                .boxed()
                .toList();
        System.out.println(list);
        long countEven = list.stream()
                .filter(v -> v % 2 == 0)
                .count();
        System.out.println(countEven);

//      Найти средне арифметическое элементов массива, превосходящих некоторое число С

        double average = IntStream
                .range(0, list.size())
                .average()
                .orElseThrow();
        System.out.println(average);
    }
}
