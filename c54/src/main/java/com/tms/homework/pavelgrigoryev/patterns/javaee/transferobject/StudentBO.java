package com.tms.homework.pavelgrigoryev.patterns.javaee.transferobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentBO {
    private final List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();
        Collections.addAll(students,
                new StudentVO("Robert",0),
                new StudentVO("John", 1));
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }
}
