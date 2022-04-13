package com.tms.homework.han.task18.streamsTest;

import java.util.List;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {

        //        Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//        порядке (99 97 95 93 … 7 5 3 1).

        List<Integer> list = IntStream.range(0, 100)
                .boxed()
                .filter(v -> v % 2 != 0)
                .toList();
        list.forEach(v -> System.out.print(v + " "));
        System.out.println();

        IntStream.iterate(list.size() - 1, i -> i >= 0, i -> i - 1)
                .mapToObj(list::get)
                .forEach(v -> System.out.print(v + " "));
        System.out.println();

        //        Найти среднее арифметическое элементов с нечетными номерами

        double average = IntStream.iterate(list.size() - 1, i -> i >= 0, i -> i - 1)
                .average()
                .stream()
                .sum();
        System.out.println(average);
    }
}
