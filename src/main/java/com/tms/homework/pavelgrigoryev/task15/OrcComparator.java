package com.tms.homework.pavelgrigoryev.task15;

import com.tms.homework.pavelgrigoryev.task14.Orc;

import java.util.Comparator;

public class OrcComparator implements Comparator<Orc> {
    @Override
    public int compare(Orc o1, Orc o2) {
        if (o1.getLastname().compareTo(o2.getLastname()) != 0) {
            return o1.getLastname().compareTo(o2.getLastname());
        } else {
            return o1.getFirstname().compareTo(o2.getFirstname());
        }
    }
}
