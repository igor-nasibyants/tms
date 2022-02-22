package com.tms.homework.artsiom.vladykouski.task6;

import java.util.Scanner;

public class MyWatch extends Gadjet {

    private String pay;

    public MyWatch(String pay, String nameModel, String color, String price) {
        super(nameModel, color, price);
        this.pay = pay;
    }

    void alarm() {
        int i;
        double[] arr = new double[24];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 23) {
            for (i = 0, arr[i] = 00.00; i < arr.length - 1 & arr[i] < 24; i++, arr[i]++) {
                arr[i] = i;
                if (arr[i] == (double) n) {
                    System.out.print("Сигнал будильника установлен на " + arr[i]);
                }
            }
        } else {
            System.out.print("Введите число меньше 24");
        }
    }

    void pay() {
        pay = "Garmin Pay";
        System.out.print("Совершаем покупку с помощью  " + pay);
    }
}


