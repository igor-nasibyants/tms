package com.tms.homework.han.task33;

public class Main {

    public static void main(String[] args) {
        Task task = new Task(10, new String[]{"learn js", "fly to home"});
        Homework hw = new Homework(2, "java", task);
        Student nik = new Student(22, "Nik", hw);
        System.out.println(nik);
        Student nikClone = new Student(nik);
        System.out.println(nikClone);
    }
}
