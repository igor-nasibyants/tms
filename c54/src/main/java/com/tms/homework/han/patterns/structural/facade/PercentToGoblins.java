package com.tms.homework.han.patterns.structural.facade;

public class PercentToGoblins {
    public void taxOfEntry(int money) {
        System.out.println("Налог за вход на рынок: " + money + " gold");
    }

    public void percentOfSales(int percent) {
        System.out.println("Процент для гоблинов от продажи аккаунта составил - " + percent + "%");
    }
}
