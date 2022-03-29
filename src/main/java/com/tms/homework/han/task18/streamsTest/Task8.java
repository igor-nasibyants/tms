package com.tms.homework.han.task18.streamsTest;

import java.util.*;
import java.util.stream.IntStream;

public class Task8 {
    public static void main(String[] args) {

        //        Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//        массива должен равняться отношению элемента из первого массива с i-ым
//        индексом к элементу из второго массива с i-ым индексом. Вывести все три
//        массива на экран (каждый на отдельной строке), затем вывести количество
//        целых элементов в третьем массиве.

        List<Integer> firstArr = new Random().ints(10, 1, 10)
                .boxed()
                .toList();
        List<Integer> secondArr = new Random().ints(10, 1, 10)
                .boxed()
                .toList();
        List<Double> resultArr = new ArrayList<>();
        IntStream.iterate(0, i -> i < 10, i -> i + 1)
                .forEach(i -> resultArr.add(i, (double) firstArr.get(i) / (double) secondArr.get(i)));
        System.out.println(firstArr);
        System.out.println(secondArr);
        resultArr.forEach(s -> System.out.printf("%.2f ", s));

        //        Найти второй по величине (т.е. следующий по величине за максимальным)
//        элемент в массиве
        System.out.println();
        int max = IntStream.range(0, firstArr.size()).max().orElseThrow();
        int preMax = Integer.MIN_VALUE;
        for (Integer integer : firstArr) {
            if (integer > preMax && integer < max) {
                preMax = integer;
            }
        }
        System.out.println(firstArr);
        System.out.println(preMax);
    }
}
