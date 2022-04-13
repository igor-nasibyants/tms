package com.tms.homework.han.task18.streamsTest;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(4);
        arr.add(20);
        arr.add(1);
        List<Integer> a = arr.stream().sorted().toList();
        System.out.println(a.get(arr.size() - 2));

        List<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(8);
        array.add(3);
        List<Integer> list = array.stream().distinct().toList();
        System.out.println(list);

        Set<Integer> set = new HashSet<>(arr);
        System.out.println(set);

        System.out.println(arr.stream().findFirst().orElse(-1));

        System.out.println(arr.stream().filter(v -> v > 0).count());

        System.out.println(arr.stream().min(Integer::compareTo).get());

        Map<Boolean, List<Integer>> parts = array.stream().collect(Collectors.partitioningBy((p) -> p % 2 == 0));
        System.out.println("parts = " + parts); // напечатает parts = {false=[1, 3], true=[2, 4]}

    }
}
