package by.astakhnovich.patterns.generating.factory_method;

public class Main {
    public static void main(String[] args) {
        TaxiCarFactory taxiCarFactory = new TaxiCarFactory();
        Transport taxiCar = taxiCarFactory.createTransport(CarType.BUSINESS);
        taxiCar.move();
    }
}
