package com.pizzacloud.pizza;

import lombok.Data;

import java.util.List;

@Data
public class Pizza {
    private String name;
    private List<Ingredient>ingredients;
}
