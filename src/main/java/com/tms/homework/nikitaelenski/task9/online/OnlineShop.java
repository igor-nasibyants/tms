package com.tms.homework.nikitaelenski.task9.online;

import com.tms.homework.nikitaelenski.task9.Opening;
import com.tms.homework.nikitaelenski.task9.Shop;

public class OnlineShop extends Shop implements Opening {

    private final Integer numberofOperatorsInTheCallCenter;


    public OnlineShop(String adress, Integer quantityGoods, Integer productVariable, String salesMarket,
                      Integer numberofOperatorsInTheCallCenter) {
        super(adress, quantityGoods, productVariable, salesMarket);
        this.numberofOperatorsInTheCallCenter = numberofOperatorsInTheCallCenter;
    }

    public void addressСorrection() {
        if (getSalesMArket().equalsIgnoreCase("Беларусь")) {
            if (getAdress().endsWith("com")) {
                String newAdress = getAdress().replace(".com", ".by");
                setAdress(newAdress);
                System.out.println(newAdress);
            }
        } else {
            System.out.println(getAdress());
        }
    }

    public void printbl(String B) {
        if (B.equals("Беларусь")) {
            System.out.println("Отлично");
        } else {
            System.out.println("Плохо");
        }

    }

    public void seatCalculationForOperators() {
        if (numberofOperatorsInTheCallCenter > 5) {
            System.out.println("Нужен небольшой офис.");
        } else if (numberofOperatorsInTheCallCenter > 10) {
            System.out.println("Нужен офис побольше ");
        } else if (numberofOperatorsInTheCallCenter > 20) {
            System.out.println("Нужен офис достаточной вместительностью .");
        } else if (numberofOperatorsInTheCallCenter > 50) {
            System.out.println("Нужен ужасно большой офис .");
        } else {
            System.out.println("Нужен гиганский офис.");
        }
        System.out.println("инвентарь в офисе:\nСтолы : " + numberofOperatorsInTheCallCenter +
                "\nСтулья " + numberofOperatorsInTheCallCenter
        );
    }

    @Override
    public String timeJob() {
        Integer timeJob = 24;
        return "Время работы нашего онлайн магазина " + timeJob + " часа";
    }

    public String openShop() {
        return "Мы открыт ";
    }

    public String closeShop() {
        return "Мы закрыт ";
    }

}
