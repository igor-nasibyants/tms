package com.tms.task.patterns.behavioral.strategy;

public class Subtraction implements Strategy {

    @Override
    public float calculation(float a, float b) {
        return a - b;
    }

}
