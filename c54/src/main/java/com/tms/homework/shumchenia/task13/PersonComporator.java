package com.tms.homework.shumchenia.task13;

import java.util.Comparator;

public class PersonComporator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getId().compareTo(b.getId());
    }
}
