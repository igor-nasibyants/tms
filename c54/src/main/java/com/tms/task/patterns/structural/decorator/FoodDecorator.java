package com.tms.task.patterns.structural.decorator;

public abstract class FoodDecorator implements Food {
    private final Food newFood;

    public FoodDecorator(Food newFood) {

        this.newFood = newFood;

    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();

    }


    public double foodPrice() {
        return newFood.foodPrice();

    }

}
