package com.tms.homework.han.task16;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonWord {
    public static void commonWord(String text) {
        System.out.println("Max repeat word: " + Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow());
        System.out.println("======================================================");
    }
}
