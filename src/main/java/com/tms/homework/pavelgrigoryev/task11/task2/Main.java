package com.tms.homework.pavelgrigoryev.task11.task2;

public class Main {
    public static void main(String[] args) {
        Plants[] plants = new Plants[5];
        String[] colors = new String[]{"GREEN", "YELLOW", "Red", "viOLet", "Яловый"};
        String[] types = new String[]{"mosses", "SEAWEED", "Сосна", "FERNs", "Цвяточык"};
        int[] sizes = new int[]{20, 30, 24, 55, 11};

        for (int i = 0; i < 5; i++) {
            try {
                plants[i] = buildPlants(sizes[i], colors[i], types[i]);
            } catch (ColorException | TypeException e) {
                e.printStackTrace();
            } finally {
                System.out.println(plants[i]);
            }
        }
    }

    private static Plants buildPlants(int size, String color, String type) throws ColorException, TypeException {
        return new Plants(size, Color.color(color), Type.type(type));
    }
}
