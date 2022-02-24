package com.tms.homework.liudzmilasobaleva.task9;

public class Parcel {

    private double costOfParcel;
    private double weightOfParcel;

    public Parcel(double costOfParcel, double weightOfParcel) {
        this.costOfParcel = costOfParcel;
        this.weightOfParcel = weightOfParcel;
    }

    public double getCostOfParcel() {
        return costOfParcel;
    }

    public void setCostOfParcel(double costOfParcel) {
        this.costOfParcel = costOfParcel;
    }

    public double getWeightOfParcel() {
        return weightOfParcel;
    }

    public void setWeightOfParcel(double weightOfParcel) {
        this.weightOfParcel = weightOfParcel;
    }

}