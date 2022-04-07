package com.tms.homework.han.task19.task1;

public class Flow extends Thread {
    private final int number;

    public Flow(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Поток " + number);
    }
}
