package com.tms.homework.artsiom.vladykouski.task19;

import static java.lang.Thread.sleep;

public class Geely implements Runnable{
    public void run(){
            try{
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("I'm Geely and I faster");}
        }


