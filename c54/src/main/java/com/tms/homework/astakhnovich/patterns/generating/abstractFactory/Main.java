package by.astakhnovich.patterns.generating.abstractFactory;

public class Main {
    public static void main(String[] args) {
        TaxiFactory carTaxiFactory = new CarTaxiFactory();
        carTaxiFactory.transfer();

        TaxiFactory helicopterTaxiFactory = new HelicopterTaxiFactory();
        helicopterTaxiFactory.transfer();
    }
}
