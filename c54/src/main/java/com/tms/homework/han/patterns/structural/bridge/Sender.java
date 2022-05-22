package com.tms.homework.han.patterns.structural.bridge;

abstract class Sender {
    protected DateRead read;

    public void setRead(DateRead read) {
        this.read = read;
    }

    public Sender(DateRead read) {
        this.read = read;
    }

    public abstract void send();
}
