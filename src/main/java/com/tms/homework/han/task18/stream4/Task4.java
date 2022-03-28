package com.tms.homework.han.task18.stream4;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(20, 0,21)
                .boxed()
                .toList();
        System.out.println(list);
        System.out.println(list);
    }
}
