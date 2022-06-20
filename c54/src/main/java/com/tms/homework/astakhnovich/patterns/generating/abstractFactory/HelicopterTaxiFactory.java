package by.astakhnovich.patterns.generating.abstractFactory;

public class HelicopterTaxiFactory implements TaxiFactory{
    @Override
    public void transfer() {
        Transport helicopter = new Helicopter(" воздушное такси ");
        helicopter.move();
    }
}
