package com.tms.homework.astakhnovich.task34;

import java.util.*;

public class Test {

    public Integer test1(List<Integer> list){
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
       return maxCount;
    }

    public Map<Integer, Integer> test2(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        for (var one : list) {
            int count = 0;
            for (var two : list) {
                if(one.equals(two)){
                    map.put(one, ++count);
                }
            }
        }
        return map;
    }

    public Map<Integer, Integer> test3(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
            list.stream()
                    .distinct()
                    .forEach(a -> map.put(a, Collections.frequency(list, a)));
        return map;
    }
}