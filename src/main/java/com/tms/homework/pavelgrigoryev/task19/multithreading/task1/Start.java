package com.tms.homework.pavelgrigoryev.task19.multithreading.task1;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread2.start();
        thread2.join();
        thread1.start();
        thread1.join();
        thread0.start();
    }
}
