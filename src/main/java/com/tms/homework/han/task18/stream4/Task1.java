package com.tms.homework.han.task18.stream4;

import java.util.List;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(2, 20)
                .boxed()
                .filter(v -> v % 2 == 0).toList();
        list.forEach(System.out::println);
        int mul = list.stream()
                .filter(v -> v % 3 == 0)
                .reduce(1, (a, b) -> a * b);
        System.out.println(mul);
    }
}
