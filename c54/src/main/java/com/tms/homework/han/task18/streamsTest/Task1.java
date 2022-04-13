package com.tms.homework.han.task18.streamsTest;

import java.util.List;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {

        //        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//        созданием массива подумайте, какого он будет размера.

        List<Integer> list = IntStream.range(2, 20)
                .boxed()
                .filter(v -> v % 2 == 0)
                .toList();
        list.forEach(System.out::println);

        //      Найти произведение элементов, кратных 3

        int mul = list.stream()
                .filter(v -> v % 3 == 0)
                .reduce(1, (a, b) -> a * b);
        System.out.println(mul);
    }
}
