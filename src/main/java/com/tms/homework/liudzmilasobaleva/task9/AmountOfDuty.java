package com.tms.homework.liudzmilasobaleva.task9;


public class AmountOfDuty implements Countable {

    private double value;
    public static final double CUSTOMS_FEE = 5; // фиксированный сбор (в Евро)

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
        }
        if (costOfParcel > 22) {
            amountOfDuty = CUSTOMS_FEE + ((costOfParcel - 22) * 0.15);
        }
        if (weightOfParcel > 10) {
            amountOfDuty = CUSTOMS_FEE + ((weightOfParcel - 10) * 2);
        }
        if (costOfParcel > 22 && weightOfParcel > 10) {
            if ((CUSTOMS_FEE + ((costOfParcel - 22) * 0.15)) > (CUSTOMS_FEE + ((weightOfParcel - 10) * 2))) {
                amountOfDuty = CUSTOMS_FEE + ((costOfParcel - 22) * 0.15);
            }
            if ((CUSTOMS_FEE + ((costOfParcel - 22) * 0.15)) < (CUSTOMS_FEE + ((weightOfParcel - 10) * 2))) {
                amountOfDuty = CUSTOMS_FEE + ((weightOfParcel - 10) * 2);
            }
        }
        this.value = amountOfDuty;
    }


}