package com.tms.task.task19;

public class JoinRunnable extends Thread {
    public JoinRunnable(String name) {
        super(name);
    }

    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThreadName + " is running! " + i);
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        System.out.println(currentThreadName + " completed");
    }
}
