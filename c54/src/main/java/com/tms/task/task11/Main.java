package com.tms.task.task11;

import com.tms.task.task11.exception.MyCheckPositiveException;

public class Main {

    public static void main(String[] args) {
        try {
            checkPositive("asdf");
        } catch (MyCheckPositiveException e) {
            e.printStackTrace();
        } finally {
            System.out.println("print finally");
        }
    }

    private static void checkPositive(String s) throws MyCheckPositiveException {
        try {
            Integer i = Integer.parseInt(s);
        } catch (Exception e) {
            throw new MyCheckPositiveException(e.getMessage());
        }
    }
}
