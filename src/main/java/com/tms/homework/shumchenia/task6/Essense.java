package com.tms.homework.shumchenia.task6;

public class Essense {
    private double weight;
    private double height;
    private int age;
    public static int kolvoEsense=0;
    private int numberEsense;
    private int energy;

    public Essense(double weight, double height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        kolvoEsense++;
        this.numberEsense=kolvoEsense;
        energy=0;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public static int getKolvoEsense() {
        return kolvoEsense;
    }

    public int getNumberEsense() {
        return numberEsense;
    }

    public void run() {
    }

    public void eat(Food food){
        System.out.println("Кто-то съел "+food.getName());
        energy+=food.getCalories();
        food = null;
    }




}
