package com.tms.homework.han.task19.task1;

public class Main {
    static Flow t1 = new Flow(1);
    static Flow t2 = new Flow(2);
    static Flow t3 = new Flow(3);

    public static void main(String[] args) {
        try {
            getFlow(t1, t2, t3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void getFlow(Flow t1, Flow t2, Flow t3) throws InterruptedException {
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
    }
}