package com.tms.homework.nikitaelenski.task19.exercise1;

public class Streams extends Thread{
    private int num;

    public Streams(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("T " + num);
    }
}
