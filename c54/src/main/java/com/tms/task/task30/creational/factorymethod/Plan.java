package com.tms.task.task30.creational.factorymethod;

import java.io.*;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}