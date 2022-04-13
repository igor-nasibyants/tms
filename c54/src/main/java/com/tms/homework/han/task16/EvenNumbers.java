package com.tms.homework.han.task16;

import java.util.List;
import java.util.stream.IntStream;

public class EvenNumbers {
    public static void getEvenNumbers(List<Integer> arr) {
        int mul;
        List<Integer> evenNumbers = arr.stream()
//                .takeWhile(number -> number <= 20)
                .filter(number -> number % 2 == 0).toList();
        evenNumbers.forEach(value -> System.out.print(value + " "));
        mul = IntStream.range(0, evenNumbers.size())
                .filter(i -> evenNumbers.get(i) % 3 == 0 && evenNumbers.get(i) != 0)
                .map(evenNumbers::get).reduce(1, (a, b) -> a * b);

//        for (int i = 0; i < evenNumbers.size(); i++) {
//            if (evenNumbers.get(i) % 3 == 0 && evenNumbers.get(i) != 0)
//                mul *= evenNumbers.get(i);
//        }

        System.out.println();
        evenNumbers.forEach(System.out::println);
        System.out.println("Mul: " + mul);
        System.out.println("======================================================");
    }
}
