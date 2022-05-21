package com.tms.homework.han.creational.newabstractfactory;

import com.tms.homework.han.creational.newabstractfactory.factories.HanFactory;
import com.tms.homework.han.creational.newabstractfactory.factories.ProductFactory;
import com.tms.homework.han.creational.newabstractfactory.factories.TeslaFactory;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static void configApp() {
        App app;
        ProductFactory factory;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name factory (han, tesla)");
        String nameCompany = scanner.nextLine();
        switch (nameCompany.toLowerCase(Locale.ROOT)) {
            case "han" -> {
                factory = new HanFactory();
                app = new App(factory);
            }
            case "tesla" -> {
                factory = new TeslaFactory();
                app = new App(factory);
            }
            default -> throw new IllegalStateException("Unexpected value: "
                    + nameCompany.toLowerCase(Locale.ROOT));
        }
    }

    public static void main(String[] args) {
        configApp();
    }
}
