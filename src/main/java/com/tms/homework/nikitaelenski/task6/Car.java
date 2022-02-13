package com.tms.homework.nikitaelenski.task6;

public class Car {
    int ageCar ;
    String carBranch ;
    String carModel ;

    public Car(int ageCar, String carBranch, String carModel) {
        this.ageCar = ageCar;
        this.carBranch = carBranch;
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ageCar=" + ageCar +
                ", carBranch='" + carBranch + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }

    public int getAgeCar() {
        return ageCar;
    }

    public void setAgeCar(int ageCar) {
        this.ageCar = ageCar;
    }

    public String getCarBranch() {
        return carBranch;
    }

    public void setCarBranch(String carBranch) {
        this.carBranch = carBranch;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;

    }

}

