package com.tms.homework.pavelgrigoryev.task18.json;

import java.util.List;

public class Bakery {
    private String name;
    private List<Pizza> pizzas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Bakery(String name, List<Pizza> pizzas) {
        this.name = name;
        this.pizzas = pizzas;
    }

    public Bakery() {

    }

    @Override
    public String toString() {
        return "Bakery{" +
                "name='" + name + '\'' +
                ", pizzas=" + pizzas +
                '}';
    }
}
