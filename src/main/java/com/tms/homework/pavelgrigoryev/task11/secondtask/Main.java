package com.tms.homework.pavelgrigoryev.task11.secondtask;

public class Main {
    public static void main(String[] args) {
        Plants[] plants = new Plants[5];

        try {
            plants[0] = new Plants(20,Color.color("GREEN"),Type.type("mosses"));
        } catch (ColorException | TypeException e) {
            e.printStackTrace();
        } finally {
            System.out.println(plants[0]);
        }
        try {
            plants[1] = new Plants(30,Color.color("YELLOW"),Type.type("SEAWEED"));
        } catch (ColorException | TypeException e) {
            e.printStackTrace();
        } finally {
            System.out.println(plants[1]);
        }
        try {
            plants[2] = new Plants(24,Color.color("Red"),Type.type("Сосна"));
        } catch (ColorException | TypeException e) {
            e.printStackTrace();
        } finally {
            System.out.println(plants[2]);
        }
        try {
            plants[3] = new Plants(55,Color.color("viOLet"),Type.type("FERNs"));
        } catch (ColorException | TypeException e) {
            e.printStackTrace();
        } finally {
            System.out.println(plants[3]);
        }
        try {
            plants[4] = new Plants(11,Color.color("Яловый"),Type.type("Цвяточык"));
        } catch (ColorException | TypeException e) {
            e.printStackTrace();
        } finally {
            System.out.println(plants[4]);
        }
    }
}
