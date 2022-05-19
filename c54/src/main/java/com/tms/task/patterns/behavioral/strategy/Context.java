package com.tms.task.patterns.behavioral.strategy;

public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float num1, float num2) {
        return strategy.calculation(num1, num2);
    }
}
