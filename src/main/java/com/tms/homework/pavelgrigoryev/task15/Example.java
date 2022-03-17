package com.tms.homework.pavelgrigoryev.task15;

import com.tms.homework.pavelgrigoryev.task14.Orc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Orc> orcList = new ArrayList<>();
        Collections.addAll(orcList,
                new Orc("Someone","SomeWhere"),
                new Orc("Петров","Сергей"),
                new Orc("Whatever","To"),
                new Orc("Алексеев","Алексей"),
                new Orc("Alexander","Zoom"),
                new Orc("Something is going","Wrong"));
        Stream<Orc> orcStream = orcList.stream();
        orcStream
                .filter(p -> p.getLastname().length() < 17)
                .sorted(new OrcComparator())
                .forEach(p -> System.out.println("Lastname : " + p.getLastname() + "," + " Firstname : " + p.getFirstname()));
    }
}
