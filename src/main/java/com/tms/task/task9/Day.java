package com.tms.task.task9;

public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String value;

    Day(String value) {
        this.value = value;
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
