package com.tms.homework.nikitaelenski.task19.exercies4;

import java.util.ArrayList;
import java.util.Random;

public class Worker {
    private ArrayList<Integer> list1 = new ArrayList<Integer>();
    private ArrayList<Integer> list2 = new ArrayList<Integer>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    private Random random = new Random();

    private void partOne() {
        synchronized(lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }
    private  void partTwo(){
        synchronized(lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }
    private   void  proceed(){
    for (int i = 0 ; i <1000;i++){
        partOne();
        partTwo();
    }
    }
    public void start(){
        System.out.println("Начинаем ");
        Long startTime = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                proceed();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                proceed();
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("Потраченое вермя " + (endTime - startTime)+"\n"
        + "Лиси 1 :" + list1.size() + "\n"
        + "Лист 2 :" + list2.size());

    }
}
