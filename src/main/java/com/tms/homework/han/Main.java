package com.tms.homework.han;

class People {
    int age;
    String name;
    int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Name: " + name + "Age: " + age + "Height: " + height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public People(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

}

class Man extends People {
    public String firstName;
    public int money;

    public Man(int age, String name, int height, String firstName, int money) {
        super(age, name, height);
        this.firstName = firstName;
        this.money = money;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Height: " + this.height + " firstName " + this.firstName + " money " + this.money);
    }
}

class Boss extends Man {
    String roar;

    public Boss(int age, String name, int height, String firstName, int money, String roar) {
        super(age, name, height, firstName, money);
        this.roar = roar;
    }

    public String getRoar() {
        return roar;
    }

    public void setRoar(String roar) {
        this.roar = roar;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Height: " + this.height + " firstName " + this.firstName + " money " + this.money);
    }
}


public class Main {
    static People people = new People(23, "Nikita", 173);
    static Man man = new Man(48, "Chel", 185, "asaa", 11111);
    static Boss boss = new Boss(2, "BOSS", 200, "BOSSES", 99999999, "MONEY");
    static People[] people1 = {people, man, boss};

    public static void massPrint(People[] peoples) {
        for (People person : peoples) {
            person.print();
        }
    }

    public static void main(String[] args) {
        people.print();
        man.print();
        boss.print();
        System.out.println();
        massPrint(people1);
    }
}