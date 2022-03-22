package com.tms.homework.han.task16;

import java.util.List;

public class BigArr {

    public static void getBigArr(List<Integer> firstArr, List<Integer> secondArr) {
        System.out.print("First array: ");
        firstArr.forEach(s -> System.out.print(s + " "));
        System.out.print("\nSecond array: ");
        secondArr.forEach(s -> System.out.print(s + " "));
        System.out.println();
        int firstSum = firstArr.stream().mapToInt(item -> item).sum();

//        int firstSum = 0;
//        for (Integer item : firstArr) {
//            firstSum += item;
//        }

        int secondSum = secondArr.stream().mapToInt(integer -> integer).sum();
        if (firstSum > secondSum) {
            System.out.println("First top");
        } else if (secondSum > firstSum) {
            System.out.println("Second top");
        } else {
            System.out.println("Arrays are equal");
        }
        System.out.println("======================================================");
    }
}
