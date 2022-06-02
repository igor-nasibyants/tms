package com.tms.homework.pavelgrigoryev.task34;

public class Grader {

    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade cannot be less then zero");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 91) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
