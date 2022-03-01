package com.tms.homework.maria.varabyova.task2;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        double rateUSD = 78;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        System.out.println("Введите команду. Доступные команды: convert и advice.");
        String command = scanner.next();

        if (command.equals("convert")) {

            System.out.println("В какую валюту хотите конвертировать рубли? Доступные варианты: USD, EUR, JPY.");
            String currency = scanner.next(); // Считайте это значение с помощью scanner
            if (currency.equals("USD")) {
                System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
            } else if (currency.equals("EUR")) {
                System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
            } else if (currency.equals("JPY")) {
                System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
            } else {
                System.out.println("Валюта не поддерживается.");
            }

        } else if (command.equals("advice")) {
            if (moneyBeforeSalary < 3000) {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            } else if (moneyBeforeSalary < 10000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Окей, пора в Макдак!");
                } else {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                }
            } else if (moneyBeforeSalary < 30000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                } else {
                    System.out.println("Окей, пора в Макдак!");
                }
            } else {
                if (daysBeforeSalary < 10) {
                    System.out.println("Отлично! Заказывайте крабов!");
                } else {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                }
            }
        } else {
            System.out.println("Извините, такой команды пока нет.");
        }
    }
}
