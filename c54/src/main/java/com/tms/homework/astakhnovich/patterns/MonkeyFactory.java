package com.tms.homework.astakhnovich.patterns;

public class MonkeyFactory implements AbstractFactory {
    Monkey monkey;
    @Override
    public Essence create() {
        return monkey = new Monkey(5,2,4);
    }
}
