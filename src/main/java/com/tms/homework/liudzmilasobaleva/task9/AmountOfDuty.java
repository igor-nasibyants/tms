package com.tms.homework.liudzmilasobaleva.task9;


public class AmountOfDuty implements Countable {

    private double value;
    final double customsFee = 5; // фиксированный сбор (в Евро)

    public double getValue() {
        return value;
    }

    @Override
    public void count(Parcel parcel) {  //считаем сумму таможенных платежей
        double costOfParcel = parcel.getCostOfParcel();
        double weightOfParcel = parcel.getWeightOfParcel();
        double amountOfDuty = 0;

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
        this.value = amountOfDuty;
    }


}