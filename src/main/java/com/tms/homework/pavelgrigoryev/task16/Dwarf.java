package com.tms.homework.pavelgrigoryev.task16;

public class Dwarf {
    private final String firstName;
    private final String lastName;
    private final int id;
    private final int age;
    private final Role role;

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
        return "Dwarf{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", role=" + role +
                '}';
    }
}
