package com.tms.task.task19;

public class JoinRunnableDemo {

    public static void main(String[] args) {
        JoinRunnable a = new JoinRunnable("A");
        JoinRunnable b = new JoinRunnable("B");
        JoinRunnable c = new JoinRunnable("C");

        a.start();
        try {
            a.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        b.start();
        c.start();
    }
}
