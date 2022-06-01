package com.tms.homework.astakhnovich.task34;

import java.util.*;

public class Test {

    List<Integer> list = Arrays.asList(1,2,3,2,3,2,1,2,1,2,3,3,1,2,3,1,1,2);
    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Test t = new Test();
        t.test3();
    }

    void test1(){
        int maxCount = 0;
        for (var numberOne : list) {
            int count = 0;
            for (var numberTwo: list) {
                if(numberOne.equals(numberTwo)){
                    count++;
                }
            }
            maxCount = Math.max(count, maxCount);
        }
        System.out.println(maxCount);
    }

    void test2(){
        for (var one : list) {
            int count = 0;
            for (var two : list) {
                if(one.equals(two)){
                    map.put(one, ++count);
                }
            }
        }
        map.forEach((k,v) -> System.out.println("k - " + k + ", v - " + v));
    }

    void test3(){
        list.stream()
                .distinct()
                .forEach(a -> map.put(a, Collections.frequency(list, a)));
        map.forEach((k,v) -> System.out.println("k - " + ", v - " + v));
    }
}