package com.tms.homework.han.task6.oopTest;

class Man extends People {
    public String firstName;
    public int money;

    public Man(int age, String name, int height, String firstName, int money) {
        super(age, name, height);
        this.firstName = firstName;
        this.money = money;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Height: " + this.height +
                " firstName " + this.firstName + " money " + this.money);
    }
}
