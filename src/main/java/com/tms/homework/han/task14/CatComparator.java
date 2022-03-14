package com.tms.homework.han.task14;

import java.util.Comparator;

class CatNameComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat a, Cat b) {

        return a.getName().compareTo(b.getName());
    }
}

class CatAgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat a, Cat b) {
        return a.getAge().compareTo(b.getAge());
    }
}
