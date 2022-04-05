package com.tms.homework.astakhnovich.task19;

public class Thr implements Runnable {
    Integer i;
    Integer c = 0;

    public Thr(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Potok" + i);

        while (c < 100){

            System.out.println("Potok" + i+" "+c);
            c++;

        }
        System.out.println("Potok " + i + " закончил");
    }

}