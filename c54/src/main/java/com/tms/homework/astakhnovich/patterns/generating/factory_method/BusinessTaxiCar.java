package by.astakhnovich.patterns.generating.factory_method;

public class BusinessTaxiCar implements Transport{
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за много денег");
    }
}