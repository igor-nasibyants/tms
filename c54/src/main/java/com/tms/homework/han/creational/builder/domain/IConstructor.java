package com.tms.homework.han.creational.builder.domain;

public interface IConstructor {
    void createEngine();

    void createBody();

    void createElectronic();

    Car getReadyCar();
}
