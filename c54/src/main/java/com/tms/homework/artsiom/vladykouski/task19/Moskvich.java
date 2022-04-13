package com.tms.homework.artsiom.vladykouski.task19;

import static java.lang.Thread.sleep;

public class Moskvich implements Runnable{
    public void run (){

            try{
                sleep(1100);
            } catch (InterruptedException e) {
            }
            System.out.println("I'm Moskvich and I faster");}
    }


