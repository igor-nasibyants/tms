package com.tms.homework.han.task14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class FunctionProgram {
    public static void main(String[] args) {
        Cat<Integer, String> jula = new Cat<>(10, "Jula");
        Cat<Integer, String> nik = new Cat<>(15, "Nik");
        Cat<Integer, String> barsik = new Cat<>(4, "Barsik");
        Cat<Integer, String> laska = new Cat<>(1, "Laska");
        Cat<Integer, String> orya = new Cat<>(3, "Orya");
        ArrayList<String> catsName = new ArrayList<>();
        catsName.add(jula.getName());
        catsName.add(nik.getName());
        catsName.add(barsik.getName());
        catsName.add(laska.getName());
        catsName.add(orya.getName());
        ArrayList<Integer> catsAge = new ArrayList<>();
        catsAge.add(jula.getAge());
        catsAge.add(nik.getAge());
        catsAge.add(barsik.getAge());
        catsAge.add(laska.getAge());
        catsAge.add(orya.getAge());
        System.out.println("Больше 3 лет:");
        Collection<Integer> ageCats = check(catsAge, (n) -> n > 3);
        ageCats.forEach(age -> System.out.print(age + " "));
    }

    public static <T> Collection<T> check(Collection<T> arr, Predicate<T> predicate) {
        Collection<T> list = new ArrayList<>();
        for (T obj : arr) {
            if (predicate.test(obj)) {
                list.add(obj);
            }
        }
        return list;
    }
}
