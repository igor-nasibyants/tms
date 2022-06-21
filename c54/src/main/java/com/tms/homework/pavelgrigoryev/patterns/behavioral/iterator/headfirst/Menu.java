package com.tms.homework.pavelgrigoryev.patterns.behavioral.iterator.headfirst;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
