package com.tms.homework.nikitaelenski.task6;

public class Main {
    public static void main(String[] args) {
        Car Honda = new Car( 1999,"Honda","Celica");
        System.out.println(Honda);
        System.out.println(Honda.ageCar + " " +  Honda.carBranch + " " +  Honda.carModel);
        Honda.setAgeCar(1998);
        System.out.println(Honda.ageCar + " " +  Honda.carBranch + " " +  Honda.carModel);
    }
}
