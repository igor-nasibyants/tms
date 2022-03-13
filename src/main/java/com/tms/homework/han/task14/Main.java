package com.tms.homework.han.task14;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("ВсеКотики бай (^˵◕ω◕˵^)");
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Вы пришли " + dateNow.format(formatterDate) + " в " + timeNow.format(formatterTime));
        Catable.buyCat(cats);
    }
}

