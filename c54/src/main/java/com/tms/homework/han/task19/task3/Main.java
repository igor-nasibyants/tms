package com.tms.homework.han.task19.task3;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new Random().ints(20, 0, 100)
                .boxed()
                .toList();
        IntStream.range(0, 5)
                .forEach(i -> {
                    Thread thread = new Thread(new OddNumbers(numbers));
                    thread.setName("It's " + i + " thread");
                    thread.start();
                });
    }
}
