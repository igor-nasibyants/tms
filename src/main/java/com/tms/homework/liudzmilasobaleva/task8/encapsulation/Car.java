package com.tms.homework.liudzmilasobaleva.task8.encapsulation;

public class Car {
    private String brand;
    private Integer yearOfIssue;

    public Car(String brand, Integer yearOfIssue) {
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        if (yearOfIssue > 1886)
            this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car " + brand + " " + yearOfIssue;
    }
}