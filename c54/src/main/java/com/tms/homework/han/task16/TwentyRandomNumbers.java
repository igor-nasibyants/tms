package com.tms.homework.han.task16;

import java.util.List;
import java.util.stream.IntStream;

public class TwentyRandomNumbers {
    public static void getTwentyRandomNumbers(List<Integer> arr) {
        arr.forEach(v -> System.out.print(v + " "));
        IntStream.range(0, arr.size()).filter(i -> i % 2 == 1).forEach(i -> arr.set(i, 0));

//        for (int i = 0; i < arr.size(); i++) {
//            if (i % 2 == 1) {
//                arr.set(i, 0);
//            }
//        }

        System.out.println();
        arr.forEach(v -> System.out.print(v + " "));
        System.out.println("\n======================================================");
    }
}
