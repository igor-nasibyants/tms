package com.tms.homework.pavelgrigoryev.patterns.behavioral.template.headfirst;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        System.out.println("*".repeat(50));

        TeaWithHook tea = new TeaWithHook();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
    }
}
