package com.tms.homework.pavelgrigoryev.task19.multithreading.task1;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        thread1.setName("номер 1");
        MyThread thread2 = new MyThread();
        thread2.setName("номер 2");
        MyThread thread3 = new MyThread();
        thread3.setName("номер 3");

        thread3.start();
        thread3.join();
        thread2.start();
        thread2.join();
        thread1.start();
    }
}
