package com.tms.task3;

public class Task3 {

    public static Boolean validateMonth(Integer days) {
        System.out.println("Input parameter days = " + days);
        if (days < 31) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
