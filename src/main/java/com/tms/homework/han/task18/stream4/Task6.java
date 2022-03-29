package com.tms.homework.han.task18.stream4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> arr = new Random()
                .ints(4, 0, 10)
                .boxed()
                .toList();
        arr.forEach(s -> System.out.print(s + " "));
        boolean a = IntStream.iterate(0, i -> i < arr.size() - 1, i -> i + 1)
                .allMatch(i -> arr.get(i) < arr.get(i + 1));
        System.out.println("\n" + a);

        Integer v = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();
        System.out.println(v);
    }
}
