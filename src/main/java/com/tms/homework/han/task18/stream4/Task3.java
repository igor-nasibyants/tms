package com.tms.homework.han.task18.stream4;

import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(15, 0, 100)
                .boxed()
                .toList();
        System.out.println(list);
        long countEven = list.stream().filter(v -> v % 2 == 0).count();
        System.out.println(countEven);

        long sum = list.stream().filter(v -> v > 50)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
