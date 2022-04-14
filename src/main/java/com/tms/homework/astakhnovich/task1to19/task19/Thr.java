package com.tms.homework.astakhnovich.task1to19.task19;

public class Thr implements Runnable {
    Integer i;
    Integer c = 0;

    public Thr(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Potok" + i);
        while (c < 900000000){
            c++;
        }
        System.out.println("Potok " + i + " закончил");
    }

}