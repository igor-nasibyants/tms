package com.tms.task.task19;

public class SleepRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", i is " + i);
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}