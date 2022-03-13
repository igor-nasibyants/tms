package com.tms.homework.han.task14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ВсеКотики бай (^˵◕ω◕˵^)");
        System.out.println(getTime());
        Catable.buyCat(getMapCats());
    }

    public static Map<Integer, String> getMapCats() {
        Cat<Integer, String> jula = new Cat<>(10, "Жуля");
        Cat<Integer, String> nik = new Cat<>(15, "Ник");
        Cat<Integer, String> barsik = new Cat<>(4, "Барсик");
        Cat<Integer, String> laska = new Cat<>(11, "Ласка");
        Cat<Integer, String> orya = new Cat<>(3, "Оря");
        Map<Integer, String> cats = new HashMap<>();
        cats.put(jula.getAge(), jula.getName());
        cats.put(nik.getAge(), nik.getName());
        cats.put(barsik.getAge(), barsik.getName());
        cats.put(laska.getAge(), laska.getName());
        cats.put(orya.getAge(), orya.getName());
        return cats;
    }

    public static String getTime() {
        LocalDateTime dateNow = LocalDateTime.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd.MM.yyyy в HH:mm");
        return "Вы пришли " + dateNow.format(formatterDate);
    }
}

