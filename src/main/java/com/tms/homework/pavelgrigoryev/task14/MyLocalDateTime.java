package com.tms.homework.pavelgrigoryev.task14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class MyLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime dayWhenThisWasStarted = LocalDateTime.of(2017,7,30,12,30);
        LocalDateTime funTime = LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
        LocalDateTime april = LocalDateTime.of(2033,Month.APRIL,15,15,44);
        LocalDateTime dayWhenThisWillEnd = LocalDateTime.of(2050,11,7,20,51);

        Map<Integer,LocalDateTime> dateTimes = new HashMap<>();
        dateTimes.put(2,today);
        dateTimes.put(1,dayWhenThisWasStarted);
        dateTimes.put(5,dayWhenThisWillEnd);
        dateTimes.put(3,funTime);
        dateTimes.put(4,april);

        dateTimes.forEach((number, date) -> System.out.println("Number : " + number + ", Date : " + date));
    }
}
