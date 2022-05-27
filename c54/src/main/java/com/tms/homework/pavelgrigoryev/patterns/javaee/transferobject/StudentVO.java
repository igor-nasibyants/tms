package com.tms.homework.pavelgrigoryev.patterns.javaee.transferobject;

public class StudentVO {
    private String name;
    private final int rollNo;

    public StudentVO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

}
