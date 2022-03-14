package com.tms.task.task14.functional;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Car audiA6 = new Car("Audi", "A6", Boolean.FALSE, Boolean.TRUE);
        Car audiA3 = new Car("Audi", "A3", Boolean.TRUE, Boolean.FALSE);

        printTest(audiA3, Car::getFullDrive);
        printTest(audiA3, Car::getGasEngine);
        printTest(audiA6, Car::getFullDrive);
        printTest(audiA6, Car::getGasEngine);
    }



    private static void printTest(Car car, CheckCar check) {
        if (check.test(car)) {
            System.out.println(car);
        }
    }
}
