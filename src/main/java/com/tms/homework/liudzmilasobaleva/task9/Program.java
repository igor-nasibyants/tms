package com.tms.homework.liudzmilasobaleva.task9;


import java.util.Scanner;

public class Program implements Readable {
    public static void main(String[] args) {
        Program p = new Program();
        p.read();
    }

    @Override
    public void read() {

        System.out.println("Please enter the cost and the weight of the parcel"); //вводим стоимость посылки с клавиатуры
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        System.out.println();

        while (m <= 0) {      //проверяем, подходит ли число (для стоимости)
            if (m < 0) {
                System.out.println("Please enter a positive number");
            }
            if (m == 0) {
                System.out.println("Please don't enter zero");
            }
            m = sc.nextDouble();
        }

        while (n <= 0) {      //проверяем, подходит ли число (для веса)
            if (n < 0) {
                System.out.println("Please enter a positive number");
            }
            if (n == 0) {
                System.out.println("Please don't enter zero");
            }
            n = sc.nextDouble();
        }

        Parcel parcel = new Parcel();// если число подходит, создаем объект Parcel()

        parcel.setCostOfParcel(m);
        parcel.setWeightOfParcel(n);

        System.out.println("Cost of parcel is " + m + ", " + "weight of parcel is " + n);

        AmountOfDuty a = new AmountOfDuty();
        a.count(parcel);
    }
}