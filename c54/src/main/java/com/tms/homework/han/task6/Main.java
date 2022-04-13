package com.tms.homework.han.task6;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(4, 1, "purple");
        Car car2 = new Car(4, 1);
        Car car3 = new Car(4, "yellow");

        Car[] cars = {car1, car2, car3};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
