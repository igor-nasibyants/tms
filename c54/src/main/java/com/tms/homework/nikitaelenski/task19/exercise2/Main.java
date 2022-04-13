package com.tms.homework.nikitaelenski.task19.exercise2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws Exception {
        Lock lock = new ReentrantLock();
        Resource resource = new Resource(4,4);
        resource.changeI();
        resource.changeJ();
        Resource.MyThread myThread = new Resource.MyThread();
        myThread.setName("one");
        Resource.MyThread myThread1 = new Resource.MyThread();
        myThread.resource = resource;
        myThread1.resource = resource;
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        for(int x = 0 ; x <= 10 ; x++) {
            Thread.sleep(300);
            System.out.println(resource.i + " " + resource.j + "                                 " + resource.i + " " + resource.j);
            if(x==9){
                for(int s = 0 ; s < 18 ; s++) {
                    Thread.sleep(300);
                    System.out.print(resource.i + " ");
                }
            }else if (x == 10){
                for(int s = 0 ; s < 20 ; s++) {
                    Thread.sleep(300);
                    System.out.print(resource.i + " ");
                }

            }
        }
    }

    }

