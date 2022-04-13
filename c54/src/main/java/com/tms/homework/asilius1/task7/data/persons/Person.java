package com.tms.homework.asilius1.task7.data.persons;

import com.tms.homework.asilius1.task7.data.Sex;

public abstract class Person {

    private String firstName;
    private String secondName;
    private Sex sex;


    public Person(String firstName, String secondName, Integer birthNumber, Integer yearOfBirth, Sex sex) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.sex = sex;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
