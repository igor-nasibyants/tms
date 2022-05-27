package com.tms.homework.han.task33;

import java.util.Arrays;
import java.util.Objects;

public class Task {
    Integer number;
    String[] nameTasks;

    public Task(Integer number, String[] nameTasks) {
        this.number = number;
        this.nameTasks = nameTasks;
    }

    public Task() {
    }

    public Task(Task other) {
        this.number = other.number;
        this.nameTasks = other.nameTasks;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String[] getNameTasks() {
        return nameTasks;
    }

    public void setNameTasks(String[] nameTasks) {
        this.nameTasks = nameTasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return getNumber().equals(task.getNumber()) && Arrays.equals(getNameTasks(), task.getNameTasks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNumber());
        result = 31 * result + Arrays.hashCode(getNameTasks());
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "number=" + number +
                ", nameTasks=" + Arrays.toString(nameTasks) +
                '}';
    }
}