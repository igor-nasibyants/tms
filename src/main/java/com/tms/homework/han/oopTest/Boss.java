package com.tms.homework.han.oopTest;

class Boss extends Man {
    String roar;

    public Boss(int age, String name, int height, String firstName, int money, String roar) {
        super(age, name, height, firstName, money);
        this.roar = roar;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Height: " + this.height +
                " firstName " +
                this.firstName + " money " + this.money);
    }
}


