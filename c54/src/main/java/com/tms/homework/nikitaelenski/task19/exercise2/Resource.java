package com.tms.homework.nikitaelenski.task19.exercise2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource extends Thread {
    int i;
    int j;
    Lock lock = new ReentrantLock();

    public Resource(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void changeI() {
        lock.lock();
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        this.i = i;
    }
    void changeJ() {
        int j = this.j;
        if ("one".equals(Thread.currentThread().getName())) {
            Thread.yield();
        }
        j++;
        this.j = j;
        lock.unlock();
    }

    static class MyThread extends Thread {
        Resource resource;

        public void run() {
            resource.changeI();
            resource.changeJ();
        }
    }
}

