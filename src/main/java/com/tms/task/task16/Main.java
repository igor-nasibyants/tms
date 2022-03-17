package com.tms.task.task16;


import java.time.DayOfWeek;


public class Main {

    public static void main(String[] args) {
        var str = new String(".");

        if (str instanceof String) {
            str.lines();
        }

        var day = DayOfWeek.MONDAY;
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY                -> System.out.println(7);
            case THURSDAY, SATURDAY     -> System.out.println(8);
            case WEDNESDAY              -> System.out.println(9);
        }

    }
}
