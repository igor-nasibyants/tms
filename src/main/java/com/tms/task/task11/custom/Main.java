package com.tms.task.task11.custom;

public class Main {

    public static void main(String[] args) {
        try {
            testException(0);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void testException(int i) throws MyException {
        if (i < 2) {
            throw new MyException("i less than two");
        }
    }
}
