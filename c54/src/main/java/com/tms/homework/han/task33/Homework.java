package com.tms.homework.han.task33;

import java.util.Objects;

public class Homework {
    Integer countHW;
    String name;
    Task task;

    public Homework(Integer countHW, String name, Task task) {
        this.countHW = countHW;
        this.name = name;
        this.task = task;
    }

    public Homework() {
    }

    public Homework(Homework other) {
        this.countHW = other.countHW;
        this.name = other.name;
        this.task = other.task;
    }

    public Integer getCountHW() {
        return countHW;
    }

    public void setCountHW(Integer countHW) {
        this.countHW = countHW;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Homework)) return false;
        Homework homework = (Homework) o;
        return Objects.equals(getCountHW(), homework.getCountHW()) && Objects.equals(getName(), homework.getName()) && Objects.equals(getTask(), homework.getTask());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountHW(), getName(), getTask());
    }

    @Override
    public String toString() {
        return "Homework{" +
                "countHW=" + countHW +
                ", name='" + name + '\'' +
                ", task=" + task +
                '}';
    }
}
