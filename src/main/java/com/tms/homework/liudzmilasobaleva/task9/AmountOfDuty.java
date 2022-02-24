package com.tms.homework.liudzmilasobaleva.task9;

import java.util.Scanner;

public class AmountOfDuty implements Readable, Countable {

    final double customsFee = 5; // фиксированный сбор (в Евро)

    @Override
    public void count() {  //считаем сумму таможенных платежей
        double costOfParcel = getCostOfParcel();
        double weightOfParcel = getWeightOfParcel();
        double amountOfDuty;

        if (costOfParcel < 22 && weightOfParcel < 10) {
            amountOfDuty = 0;
            System.out.println("Amount of duties is " + amountOfDuty);
        }
        if (costOfParcel > 22) {
            amountOfDuty = customsFee + ((costOfParcel - 22) * 0.15);
            System.out.println("Amount of duties is " + amountOfDuty);
        }
        if (weightOfParcel > 10) {
            amountOfDuty = customsFee + ((weightOfParcel - 10) * 2);
            System.out.println("Amount of duties is " + amountOfDuty);
        }
        if (costOfParcel > 22 && weightOfParcel > 10) {
            if ((customsFee + ((costOfParcel - 22) * 0.15)) > (customsFee + ((weightOfParcel - 10) * 2))) {
                amountOfDuty = customsFee + ((costOfParcel - 22) * 0.15);
                System.out.println("Amount of duties is " + amountOfDuty);
            }
            if ((customsFee + ((costOfParcel - 22) * 0.15)) < (customsFee + ((weightOfParcel - 10) * 2))) {
                amountOfDuty = customsFee + ((weightOfParcel - 10) * 2);
                System.out.println("Amount of duties is " + amountOfDuty);
            }
        }
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
    }
}