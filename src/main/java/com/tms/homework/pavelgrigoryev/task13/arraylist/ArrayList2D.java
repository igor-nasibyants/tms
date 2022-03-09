package com.tms.homework.pavelgrigoryev.task13.arraylist;

import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(bakeryList);
        System.out.println(produceList);
        System.out.println(drinksList);

        System.out.println("Your choice is " + groceryList.get(2).get(1) + " with " + groceryList.get(0).get(2));
    }
}
