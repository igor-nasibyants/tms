package com.tms.homework.astakhnovich.task33;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("nik", "huh", 18);
        Human h2 = new Human("nik", "huh", 19);
        Human h3 = new Human("nik", "huh", 18);
        Human h4 = new Human("nik", "huha", 18);

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(h4));

    }
}