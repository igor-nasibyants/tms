package com.tms.homework.han.task6;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(4, 1, "purple");
        Car car2 = new Car(4, 1);
        Car car3 = new Car(4, "yellow");
        Car car4 = new Car();
        Car car5 = new Car();

        Car[] cars = {car1, car2, car3};
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

//        car5.sa();
//        System.out.println("Двигатель: " + car1.getEngine() + " Колеса " + car1.getWheels() + " " +
//                " Цвет " + car1.getColor() + " Состояние " + car1.fly());
//        car1.setWheels(0);
//        System.out.println("Двигатель: " + car1.getEngine() + " Колеса " + car1.getWheels() + " " +
//                " Цвет " + car1.getColor() + " Состояние " + car1.fly());
//        car1.setColor("black");
//        System.out.println("Двигатель: " + car1.getEngine() + " Колеса " + car1.getWheels() + " " +
//                " Цвет " + car1.getColor() + " Состояние " + car1.fly());
//        car1.setWheels(4);
//        car1.setEngine(10);
//        System.out.println("Двигатель: " + car1.getEngine() + " Колеса " + car1.getWheels() + " " +
//                " Цвет " + car1.getColor() + " Состояние " + car1.fly());
//        System.out.println(car4);
    }
}
