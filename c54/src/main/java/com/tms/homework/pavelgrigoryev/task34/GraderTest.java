package com.tms.homework.pavelgrigoryev.task34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    Grader grader = new Grader();

    @Test
    void fiftyNineShouldReturnF() {
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    void ninetyShouldReturnA() {
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    void eightyShouldReturnB() {
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void seventyShouldReturnC() {
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    void sixtyShouldReturnD() {
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void zeroShouldReturnF() {
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> grader.determineLetterGrade(-1));
    }
}
