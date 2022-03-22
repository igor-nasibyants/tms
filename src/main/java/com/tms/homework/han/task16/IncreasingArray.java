package com.tms.homework.han.task16;

import java.util.List;
import java.util.stream.IntStream;

public class IncreasingArray {
    public static boolean isIncreasingArr(List<Integer> arr) {
        arr.forEach(s -> System.out.print(s + " "));
        return IntStream.range(0, arr.size() - 1).noneMatch(i -> arr.get(i) >= arr.get(i + 1));
//        for (int i = 0; i < arr.size() - 1; i++) {
//            if (arr.get(i) >= arr.get(i + 1)) {
//                return false;
//            }
//        }
//        return true;
    }
}
