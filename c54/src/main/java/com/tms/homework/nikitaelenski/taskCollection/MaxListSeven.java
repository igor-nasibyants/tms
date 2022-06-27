package com.tms.homework.nikitaelenski.taskCollection;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxListSeven implements MaximumLengthCalculation{
    @Override
    public String Max(List<String> list) {
        String st1 = list.stream().filter(x->x.length()>7).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("NO");
        return st1;
    }
}
