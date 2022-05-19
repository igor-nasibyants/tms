package com.tms.task.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;


public class Caretaker {

    private final List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
