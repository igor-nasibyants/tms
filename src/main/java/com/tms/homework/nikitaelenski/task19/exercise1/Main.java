package com.tms.homework.nikitaelenski.task19.exercise1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static Streams t1 = new Streams(1);
    static Streams t2 = new Streams(2);
    static Streams t3 = new Streams(3);

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();
    }

}
