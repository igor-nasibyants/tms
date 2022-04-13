package com.tms.homework.han.task19.task3;

import java.util.List;

public record OddNumbers(List<Integer> list) implements Runnable {

    @Override
    public void run() {
        synchronized (list) {
            list.stream()
                    .map(v -> v * 2)
                    .forEach(v -> System.out.printf("%s %d \n", Thread.currentThread().getName(), v));
        }
    }
}
