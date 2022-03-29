package com.tms.homework.han.task18.stream4;

import java.util.*;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(20, 0, 21)
                .boxed()
                .toList();
        List<Integer> b = new ArrayList<>(list);
        System.out.println(b);
        IntStream.range(0, b.size()).filter(i -> i % 2 != 0).forEach(i -> b.set(i, 0));
        b.forEach(v -> System.out.print(v + " "));
        System.out.println();
        int a = b.stream()
                .filter(v -> v % 2 != 0)
                .min(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println(a);
    }
}
