package com.tms.homework.pavelgrigoryev.task16.ironforged;

public class Dwarf {
    private final String firstName;
    private final String lastName;
    private final int id;
    private final int age;
    private final Role role;

    public String getVersion() {
        return "Dwarf 1.0";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Role getRole() {
        return role;
    }

    public Dwarf(String firstName, String lastName, int id, int age, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Дворф {" +
                "Кличка ='" + firstName + '\'' +
                ", Фамилия ='" + lastName + '\'' +
                ", айди =" + id +
                ", возраст =" + age +
                ",  спек =" + role +
                '}';
    }
}
