package com.tms.homework.shumchenia.task14;

import java.time.*;
import java.util.function.*;
import java.util.logging.StreamHandler;
import java.util.stream.Stream;

public class Zanyatie {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(ZoneId.of("+" + 12));
        System.out.println(date);

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println(dateFromBase);

        LocalDate day256_2014 = LocalDate.ofYearDay(2014, 256);
        System.out.println(day256_2014);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime timeGmt12 = LocalTime.now(ZoneId.of("+" + 12));
        System.out.println(timeGmt12);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1Gmt12 = LocalDateTime.now(ZoneId.of("+" + 12));
        System.out.println(localDateTime1Gmt12);

    }
}
