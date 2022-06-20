package by.astakhnovich.patterns.generating.abstractFactory;

public class CarTaxiFactory implements TaxiFactory {

    @Override
    public void transfer() {
        Transport car = new Car(" наземное такси ");
        car.move();
    }
}
