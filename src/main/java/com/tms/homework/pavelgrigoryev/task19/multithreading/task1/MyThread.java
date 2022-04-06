package com.tms.homework.pavelgrigoryev.task19.multithreading.task1;

import java.util.stream.Stream;

public class MyThread extends Thread {
    public void run() {
        Stream.of("Стартовал поток ")
                .forEach(x -> System.out.println(x + getName()));
    }
}
