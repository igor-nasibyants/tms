package com.tms.homework.artsiom.vladykouski.task15;

import  java.util.Comparator;

import java.util.List;

public class Chaynik <T> {
    private T model;
    private T price;
    private T responses;

    public Chaynik(T model, T price, T responses) {
        this.model = model;
        this.price = price;
        this.responses = responses;
    }

    public T getModel() {
        return model;
    }

    public T getPrice() {
        return price;
    }


    public T getResponses() {
        return responses;
    }
}
