package com.tms.homework.han.task16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Numbers {
    public static List<Integer> getNumbers(int count) {
        return IntStream.rangeClosed(1, count).boxed().collect(Collectors.toList());

//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= count; i++) {
//            list.add(i);
//        }
//        return list;
    }

    public static List<Integer> getRandomNumber(int count, int maxNumber) {
        List<Integer> arr = new ArrayList<>();
        IntStream.rangeClosed(0, count - 1).forEach(i -> arr.add(i, (int) (Math.random() * maxNumber)));
        return arr;
//        for (int i = 0; i <= count - 1; i++) {
//            arr.add(i, (int) (Math.random() * maxNumber));
//        }
//        return arr;
    }
}
