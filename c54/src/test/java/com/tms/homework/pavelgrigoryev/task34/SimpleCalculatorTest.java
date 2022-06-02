package com.tms.homework.pavelgrigoryev.task34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator = new SimpleCalculator();

    @Test
    void twoPlusTwoShouldEqualFour() {
        assertEquals(4, calculator.sum(2, 2));
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        assertEquals(10, calculator.sum(3, 7));
    }
}
