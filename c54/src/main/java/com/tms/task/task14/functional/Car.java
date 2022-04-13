package com.tms.task.task14.functional;

import java.util.Objects;

public class Car {
    private final String model;
    private final String brand;

    private final Boolean isFullDrive;
    private final Boolean isGasEngine;


    public Car(String model, String brand, Boolean isFullDrive, Boolean isGasEngine) {
        this.model = model;
        this.brand = brand;
        this.isFullDrive = isFullDrive;
        this.isGasEngine = isGasEngine;
    }

    public Boolean getFullDrive() {
        return isFullDrive;
    }

    public Boolean getGasEngine() {
        return isGasEngine;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
