package com.tms.homework.han.patterns.creational.builder.domain;

public interface IConstructor {
    void createEngine();

    void createBody();

    void createElectronic();

    Car getReadyCar();
}
