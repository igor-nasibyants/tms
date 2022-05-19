package com.tms.task.patterns.behavioral.state;

public class Sales implements Connection {

    @Override
    public void open() {
        System.out.println("open database for sales");
    }

    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }

}
