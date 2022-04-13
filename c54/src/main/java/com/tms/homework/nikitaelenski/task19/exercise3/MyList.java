package com.tms.homework.nikitaelenski.task19.exercise3;

public class MyList implements Runnable {

    @Override
    public void run() {
        for (int i = 0 ; i<100 ; i ++){
            Main.increceNumber();
        }
    }

}
