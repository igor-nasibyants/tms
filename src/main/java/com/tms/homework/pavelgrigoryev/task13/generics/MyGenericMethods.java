package com.tms.homework.pavelgrigoryev.task13.generics;

import com.tms.homework.pavelgrigoryev.task10.Task1;

public class MyGenericMethods extends Task1 {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
        Character[] charArray = {'H','E','L','L','O'};
        String[] stringArray = {"B","Y","E"};

        MyGenericClass<Integer, String> clown = new MyGenericClass<>(6,"Shawn");
        MyGenericClass<String, Double> bear = new MyGenericClass<>("Teddy",2.65);

        separator();

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        separator();

        System.out.println(getFirstIndex(intArray));
        System.out.println(getFirstIndex(doubleArray));
        System.out.println(getFirstIndex(charArray));
        System.out.println(getFirstIndex(stringArray));

        separator();

        System.out.println(clown);
        System.out.println(bear);

        separator();
    }
    public static <T> void displayArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
    public static <T> T getFirstIndex(T[] array) {
        return array[0];
    }
}
