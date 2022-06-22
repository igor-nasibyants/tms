package by.astakhnovich.patterns.generating.factory_method;

public class EconomyTaxiCar implements Transport{
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за мало денег");
    }
}