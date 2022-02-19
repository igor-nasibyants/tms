package com.tms.homework.maria.varabyova.task6;

public class Person {
    private String name;
   private int age;

    Person()    {this("Undefined", 18); }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(String name)   {this(name, 18); }

    Person(String name, int age)    {this.name = name; this.age = age;}


    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
