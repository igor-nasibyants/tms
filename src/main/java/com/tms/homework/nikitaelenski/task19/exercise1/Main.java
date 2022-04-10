package com.tms.homework.nikitaelenski.task19.exercise1;

public class Main {
    static Streams t1 = new Streams(1);
    static Streams t2 = new Streams(2);
    static Streams t3 = new Streams(3);

    public static void main(String[] args) throws InterruptedException {
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();
    }

}
