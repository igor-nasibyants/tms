package com.tms.homework.han.task18.streamsTest;

import java.util.*;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) {

        //        Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.

        List<Integer> arr = new Random()
                .ints(4, 0, 11)
                .boxed()
                .toList();
        arr.forEach(s -> System.out.print(s + " "));
        boolean isInc = IntStream.iterate(0, i -> i < arr.size() - 1, i -> i + 1)
                .allMatch(i -> arr.get(i) < arr.get(i + 1));
        System.out.println("\n" + isInc);

//        Проверить, различны ли все элементы массива

    }
}
