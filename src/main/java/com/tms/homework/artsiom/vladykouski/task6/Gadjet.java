package com.tms.homework.artsiom.vladykouski.task6;
import java.util.Random;
import java.util.Scanner;

public class Gadjet {
    private String nameModel;
    private String color;
    private String price;

    static class MyPhone {
        public String operSystem;
        public int ram;
        public int cameraPix;
        int hardDisk;

        public MyPhone(String operSystem, int ram, int cameraPix, int hardDisk) {
            this.cameraPix = cameraPix;
            this.operSystem = operSystem;
            this.ram = ram;
            this.hardDisk = hardDisk;

        }

        void MakeView() {
            cameraPix = 48;
            System.out.print(" Снимаем на фотокамеру с разрешением  " + cameraPix);
        }
    }
       static class MyWatch{
            private String Pay;
            int [] arr;

            public MyWatch (String Pay){
                this.Pay = Pay;
            }
            void Alarm() {
           int i;
           double [] arr = new double[24];
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           if (n <= 23) {
               for (i = 0, arr[i] = 00.00; i < arr.length-1 & arr [i] < 24; i++, arr[i]++) {
                   arr[i] = i;
                   if (arr[i]==(double)n){
                       System.out.print("Сигнал будильника установлен на " + arr[i]);
                   }
               }
           } else {System.out.print("Введите число меньше 24");}
           }
            void Pay (){
                Pay = "Garmin Pay";
                System.out.print("Совершаем покупку с помощью  " + Pay);
            }
        }
    }


