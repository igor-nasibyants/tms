package com.tms.homework.artsiom.vladykouski.task19;


public class Patok extends Thread {

    static Geely atlas;
    static Moskvich duet;

    public static void main(String[] args) {
        atlas = new Geely();
        Thread atlasThread = new Thread(atlas);
        duet = new Moskvich();
        Thread duetThread = new Thread(duet);
        duetThread.start();
        atlasThread.start();
        duetThread.setPriority(6);
        System.out.println(atlasThread.getPriority());
    }
    }

