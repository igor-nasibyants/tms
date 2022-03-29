package com.tms.homework.han.task18.streamsTest;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

//        Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.

        List<Integer> list = new Random().ints(12, 0, 16)
                .boxed()
                .toList();
        System.out.println(list);
        Integer maxNumber = list.stream()
                .max(Comparator.naturalOrder()).orElseThrow();
        System.out.println(list.lastIndexOf(maxNumber));

//    Подсчитать, сколько раз встречается элемент с заданным значением

        System.out.println(list.stream().filter(v -> v == 4).count());
    }
}
