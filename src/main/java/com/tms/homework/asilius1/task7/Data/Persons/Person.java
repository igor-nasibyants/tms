package com.tms.homework.asilius1.task7.Data.Persons;

import com.tms.homework.asilius1.task7.Data.Months;
import com.tms.homework.asilius1.task7.Data.Sex;

public abstract class Person {

    private String firstName;
    private String secondName;
    private Integer birthNumber;
    private Months months;
    private Integer yearofBirth;
    private Sex sex;


    public Person(String firstName, String secondName, Integer birthNumber, Months months, Integer yearofBirth, Sex sex) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.birthNumber = birthNumber;
        this.months = months;
        this.yearofBirth = yearofBirth;
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

    public Integer getBirthNumber() {
        return birthNumber;
    }

    public void setBirthNumber(Integer birthNumber) {
        this.birthNumber = birthNumber;
    }

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }

    public Integer getYearofBirth() {
        return yearofBirth;
    }

    public void setYearofBirth(Integer yearofBirth) {
        this.yearofBirth = yearofBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
