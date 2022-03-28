package com.tms.homework.han.task18.stream4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 10)
                .boxed()
                .filter(v -> v % 2 != 0)
                .toList();
        list.forEach(v -> System.out.print(v + " "));
        System.out.println();
        IntStream.iterate(list.size() - 1, i -> i >= 0, i -> i - 1)
                .mapToObj(list::get)
                .forEach(v -> System.out.print(v + " "));
        System.out.println();
        double average = IntStream.iterate(list.size() - 1, i -> i >= 0, i -> i - 1)
                .average()
                .stream()
                .sum();
        System.out.println(average);
    }
}
