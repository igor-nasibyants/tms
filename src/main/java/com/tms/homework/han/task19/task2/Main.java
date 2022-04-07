package com.tms.homework.han.task19.task2;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        List<Integer> numbers = IntStream.range(0, 99)
                .boxed()
                .toList();
        IntStream.range(0, 10)
                .forEach(i -> {
                    Thread thread = new Thread(new EvenNumbers(numbers, lock));
                    thread.setName("It's " + i + " thread");
                    thread.start();
                });
    }
}
