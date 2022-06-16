package com.tms.homework.nikitaelenski.task30.generative.builder.myBuilder;

public class Main {
    public static void main(String[] args) {
        People people = new PeopleBuilder().name("nikita").surname("elenski").build();
        System.out.println(people);
        People people1 = new PeopleBuilder().name("nikita1").build();
        System.out.println(people1);

        String name =people.getName();
        System.out.println(name +" " + people.getSurname());
    }
}
