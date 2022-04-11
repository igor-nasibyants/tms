package com.tms.task.task19;

public class MyThreadDemo {

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();

        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);

        t1.start();
        t2.start();
        t3.start();
    }
}
