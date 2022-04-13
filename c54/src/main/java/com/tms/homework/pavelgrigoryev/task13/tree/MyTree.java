package com.tms.homework.pavelgrigoryev.task13.tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class MyTree {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Poland");
        set.add("Belarus");
        set.add("Germany");
        set.add("Japan");
        set.add("Angola");
        set.add("Zanzibar");

        System.out.println(set);

        SortedSet<String> subSet = set.subSet("Belarus","Poland");
        System.out.println("Subset: " + subSet);

        System.out.println("HeadSet: " + set.headSet("Japan"));
        System.out.println("TailSet: " + set.tailSet("Japan"));
        System.out.println("FirstElement: " + set.first());
        System.out.println("LastElement: " + set.last());

        animal();
    }
    public static void animal(){
        TreeSet<Animal> animals = new TreeSet<>();
        animals.add(new Animal("Boa constructor"));
        animals.add(new Animal("Wolf"));
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Tiger"));

        System.out.println(animals);
    }
}
