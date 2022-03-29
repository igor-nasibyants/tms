package com.tms.homework.han.task18.streamsTest;

import java.util.*;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {

//        Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//        массив на экран в строку. Замените каждый элемент с нечётным индексом на
//        ноль. Снова выведете массив на экран на отдельной строке.

        List<Integer> list =
                new Random().ints(20, 0, 21)
                        .boxed()
                        .toList();
        List<Integer> randomArr = new ArrayList<>(list);
        System.out.println(randomArr);
        IntStream.range(0, randomArr.size())
                .filter(i -> i % 2 != 0)
                .forEach(i -> randomArr.set(i, 0));
        randomArr.forEach(v -> System.out.print(v + " "));

//        Найти наименьший нечетный элемент.

        int a = list.stream()
                .filter(v -> v % 2 != 0)
                .min(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println("\n" + a);
    }
}
