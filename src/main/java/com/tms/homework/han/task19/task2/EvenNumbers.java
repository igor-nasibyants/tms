package com.tms.homework.han.task19.task2;

import java.util.List;
import java.util.concurrent.locks.Lock;

public record EvenNumbers(List<Integer> list,
                          Lock lock) implements Runnable {

    @Override
    public void run() {
        lock.lock();
        list.stream()
                .filter(v -> v % 2 == 0)
                .map(v -> v * 2)
                .forEach(v -> System.out.printf("%s %d \n", Thread.currentThread().getName(), v));
        lock.unlock();
    }
}
