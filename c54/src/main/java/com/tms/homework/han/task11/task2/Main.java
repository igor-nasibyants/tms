package com.tms.homework.han.task11.task2;

import java.util.Scanner;

import static com.tms.homework.han.task11.task2.CheckColor.checkColor;
import static com.tms.homework.han.task11.task2.CheckType.checkType;

public class Main {
    public static void main(String[] args) {
        Plants[] plants = new Plants[5];
        plants[0] = new Plants(10, Color.RED, Type.PERENNIAL);
        plants[1] = new Plants(3, Color.BLUE, Type.ANNUAL);
        plants[2] = new Plants(9, Color.BLUE, Type.PERENNIAL);
        plants[3] = new Plants(1, Color.GREEN, Type.BIENNIAL);
        plants[4] = new Plants(10, Color.YELLOW, Type.ANNUAL);
        getPlants(plants);
    }

    private static void getPlants(Plants[] plants) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет растения (red, yellow, blue, green)");
        String enterColor = scanner.nextLine();
        System.out.println("Введите тип растения (annual, perennial, biennial):");
        String enterType = scanner.nextLine();
        System.out.println("Подходящие по характеритикам растения: ");
        for (Plants plant : plants) {
            try {
                checkColor(enterColor);
                checkType(enterType);
            } catch (ColorException | TypeException c) {
                c.printStackTrace();
                System.exit(0);
            }
            if (enterColor.equalsIgnoreCase(plant.getColor().name()) &&
                    enterType.equalsIgnoreCase(plant.getType().name()))
            {
                System.out.println(plant);
            }
        }
    }
}
