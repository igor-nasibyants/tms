package com.tms.homework.han.task16;

import java.util.Collections;
import java.util.List;

public class OddNumber {
    public static void getOddNumber(List<Integer> arr) {
        List<Integer> oddNumbers = arr.stream()
                .filter(value -> value % 2 != 0).toList();
        oddNumbers.forEach(v -> System.out.print(v + " "));
        System.out.println();
        oddNumbers.stream()
                .sorted(Collections.reverseOrder())
                .forEach(v -> System.out.print(v + " "));
        System.out.println("\n======================================================");
    }
}
