package com.tms.homework.astakhnovich.task34;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    private static final Logger loggerLog4j = LogManager.getLogger(TestTest.class);
    com.tms.homework.astakhnovich.task34.Test test = new com.tms.homework.astakhnovich.task34.Test();
    List<Integer> list = Arrays.asList(1,2,3,2,3,2,1,2,1,2,3,3,1,2,3,1,1,2);


    @Test
    public void test1() {
        Integer expected  = test.test1(list);

        Integer actual = 7;
        loggerLog4j.debug(expected + " test1");
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Map<Integer, Integer> expected;

        expected  = test.test2(list);

        Map<Integer, Integer> actual = new HashMap<>();
        actual.put(1, 6);
        actual.put(2, 7);
        actual.put(3, 5);
        loggerLog4j.info(expected + " test2");
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        List<Integer> nList = Arrays.asList(1,1,2,2,3,3,3);
        Map<Integer, Integer> expected = test.test3(nList);

        Map<Integer, Integer> actual = new HashMap<>();
        actual.put(1, 2);
        actual.put(2, 2);
        actual.put(3, 3);

        loggerLog4j.info(expected + " test3");
        assertEquals(expected, actual);
    }

    @Test
    public void test3NoNull() {
        Map<Integer, Integer> expected = test.test3(list);
        assertNotNull(expected);
    }

    @Test
    public void test3IsEmpty() {
        Map<Integer, Integer> expected = test.test3(new ArrayList<>());
        if(expected.isEmpty()){
            fail("empty map");
        }
    }
}