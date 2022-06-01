package com.tms.homework.astakhnovich.task34;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    com.tms.homework.astakhnovich.task34.Test test = new com.tms.homework.astakhnovich.task34.Test();
    List<Integer> list = Arrays.asList(1,2,3,2,3,2,1,2,1,2,3,3,1,2,3,1,1,2);


    @Test
    void test1() {
        Integer actual  = test.test1(list);

        Integer expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        Map<Integer, Integer> actual;

        actual  = test.test3(list);

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 6);
        expected.put(2, 7);
        expected.put(3, 5);

        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        Map<Integer, Integer> actual;
        List<Integer> nList = Arrays.asList(1,1,2,2,3,3,3);
        actual  = test.test3(nList);

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(2, 2);
        expected.put(3, 3);

        assertEquals(expected, actual);
    }
}