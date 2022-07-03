package com.pizzacloud.pizza;

import lombok.Data;
@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        ROll,VEGGIES,CHEESE,SAUCE,TOMATO,FUNGUS,FISH
    }

}
