package com.tms.task.task14.functional;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LambdaApp {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(8));
        System.out.println(isPositive.test(-8));
    }

    private static boolean isPositive(Integer x) {
        return x > 0;
    }
}
