package com.tms.task.task19;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Working in thread " + getName());
    }
}
