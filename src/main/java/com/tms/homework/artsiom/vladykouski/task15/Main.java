package com.tms.homework.artsiom.vladykouski.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> model = new ArrayList<>();
        Collections.addAll(model, "Redmond", "Norman", "Scarlett");
        model.stream().sorted().forEach(s -> System.out.print("Рассматриваем следующие модели " +
                "электрочайников: " + s + "\n"));

        Stream.of(
            new Chaynik<>(model.get(0), 50, 4.5),
            new Chaynik<>(model.get(1), 65, 4.8),
            new Chaynik<>(model.get(2), 40, 4.0))
        .collect(Collectors.toMap(Chaynik::getModel, s -> s))
        .forEach((k, v) ->
                System.out.printf("Следующие варианты по приобретению электрочайника: %s, стоимость чайника -  " +
                                "%s рублей, средняя оценка по отзывам потребитлей - %s из 5 \n ", k, v.getPrice(),
                        v.getResponses()));
    }
}
