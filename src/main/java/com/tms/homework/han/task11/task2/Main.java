package com.tms.homework.han.task11.task2;


public class Main {
    public static void main(String[] args) {
        Plants[] plants = new Plants[5];
        plants[0] = new Plants(10, Color.RED, Type.PERENNIAL);
        plants[1] = new Plants(3, Color.BLUE, Type.ANNUAL);
        plants[2] = new Plants(9, Color.BLUE, Type.PERENNIAL);
        plants[3] = new Plants(1, Color.GREEN, Type.BIENNIAL);
        plants[4] = new Plants(10, Color.YELLOW, Type.ANNUAL);
        for (Plants plant : plants) {
            System.out.println(plant.toString());
        }
    }
}
