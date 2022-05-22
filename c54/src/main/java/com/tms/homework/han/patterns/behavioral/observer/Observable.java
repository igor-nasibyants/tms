package com.tms.homework.han.patterns.behavioral.observer;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void updateNotify();
}
