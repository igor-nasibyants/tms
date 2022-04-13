package com.tms.homework.han.task20;

public class Student {
    private int id;
    private String name;
    private int age;
    private int homework;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getHomework() {
        return homework;
    }

    public void setHomework(int homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Студент: " + id + ", имя: "
                + name + ", лет: " + age +
                " - выполнил " + homework + " дз";
    }
}
