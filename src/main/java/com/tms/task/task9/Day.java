package com.tms.task.task9;

public enum Day {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String value;
    private int number;

    Day(String value, int number) {
        this.value = value;
        this.number = number;
    }

    public Day fromValue(String value) {
        Day result = Day.MONDAY;
        for (Day day: Day.values()) {
            if (day.value.equals(value)) {
                result = day;
            }
        }
        return result;
    }
}
