package com.tms.homework.nikitaelenski.task34.test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    com.tms.homework.nikitaelenski.task34.NextInt test = new com.tms.homework.nikitaelenski.task34.NextInt();

    Scanner scanner = new Scanner("0");
    @Test
    public void name() {
        int secondInt = 0;
        int expected = test.nextInt(scanner);
        assertEquals(expected , secondInt);

    }
    
    
}
