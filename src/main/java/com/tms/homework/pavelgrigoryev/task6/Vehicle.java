package com.tms.homework.pavelgrigoryev.task6;

public class Vehicle {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Cars : ");
        chooseACar();
        System.out.println("-------------------");
        System.out.println("Bicycles : ");
        chooseABicycle();
        System.out.println("-------------------");
        System.out.println("Tanks : ");
        chooseATank();
    }
    public static void chooseACar() {
        Car myCar1 = new Car("Chevrolet", "Corvette", 2020, "blue", 160000.535);
        Car myCar2 = new Car("Tesla", "Model S","Red");

        System.out.println("-------------------");
        System.out.println("Make : " + myCar1.getMake() + "\n" + "Model : " + myCar1.getModel() + "\n" + "Year : " + myCar1.getYear() + "\n" + "Color : " + myCar1.getColor() + "\n" + "Price : " + myCar1.getPrice());
        myCar1.drive();
        myCar1.brake();
        System.out.println("-------------------");

        myCar2.setYear(2021);
        myCar2.setPrice(250000.899);

        System.out.println("Make : " + myCar2.getMake() + "\n" + "Model : " + myCar2.getModel() + "\n" + "Color : " + myCar2.getColor() + "\n" + "Year : " + myCar2.getYear() + "\n" + "Price : " + myCar2.getPrice());
        myCar2.drive();
        myCar2.brake();
    }
    public static void chooseABicycle(){
        Bicycle myBicycle1 = new Bicycle("LTD", "Rocco", 2021, "black/red", 1099.00);
        Bicycle myBicycle2 = new Bicycle("Krakken" ,"Barbossa", 2019, "black/blue", 600.00);

        System.out.println("-------------------");
        System.out.println("Make : " + myBicycle1.getMake() + "\n" + "Model : " + myBicycle1.getModel() + "\n" + "Year : " + myBicycle1.getYear() + "\n" + "Color : " + myBicycle1.getColor() + "\n" + "Price : " + myBicycle1.getPrice());
        myBicycle1.drive();
        myBicycle1.brake();

        System.out.println("-------------------");
        System.out.println("Make : " + myBicycle2.getMake() + "\n" + "Model : " + myBicycle2.getModel() + "\n" + "Year : " + myBicycle2.getYear() + "\n" + "Color : " + myBicycle2.getColor() + "\n" + "Price : " + myBicycle2.getPrice());
        myBicycle2.drive();
        myBicycle2.brake();
    }
    public static void chooseATank(){
        Tank myTank1 = new Tank("T-14", "Армата", 2015, "military", 159644948965.46465);
        Tank myTank2 = new Tank("Leopard", "2A7", 2018,"grey/green", 144456464656.87998);

        System.out.println("-------------------");
        System.out.println("Make : " + myTank1.getMake() + "\n" + "Model : " + myTank1.getModel() + "\n" + "Year : " + myTank1.getYear() + "\n" + "Color : " + myTank1.getColor() + "\n" + "Price : " + myTank1.getPrice());
        myTank1.drive();
        myTank1.brake();
        myTank1.fire();

        System.out.println("-------------------");
        System.out.println("Make : " + myTank2.getMake() + "\n" + "Model : " + myTank2.getModel() + "\n" + "Year : " + myTank2.getYear() + "\n" + "Color : " + myTank2.getColor() + "\n" + "Price : " + myTank2.getPrice());
        myTank2.drive();
        myTank2.brake();
        myTank2.fire();
        System.out.println("-------------------");
    }
}
