package com.tms.homework.astakhnovich.task19;

public class Main {
    public static void main(String[] args) {
        Thr thr1 = new Thr(1);
        Thr thr2 = new Thr(2);
        Thr thr3 = new Thr(3);
        Thr thr4 = new Thr(4);
        Thr thr5 = new Thr(5);
        System.out.println("запускается поток 1");
        thr1.run();
        System.out.println("запускается поток 2");
        thr4.run();
        System.out.println("запускается поток 3");
        thr3.run();
        System.out.println("запускается поток 4");
        thr2.run();
        System.out.println("запускается поток 5");
        thr5.run();
    }
}