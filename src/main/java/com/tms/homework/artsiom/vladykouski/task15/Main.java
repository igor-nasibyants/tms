package com.tms.homework.artsiom.vladykouski.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{

    public static void main(String[] args) {
        List <String> model = new ArrayList<>();
        Collections.addAll(model, "Redmond", "Norman", "Scarlett");
        model.stream().sorted().forEach(s->System.out.print("Рассматриваем следующие модели " +
                "электрочайников: " +s + "\n"));

        Stream <Chaynik> chaynikStream  = Stream.of(
                new Chaynik<>(model.get(0), 50, 4.5),
                new Chaynik<>(model.get(1), 65, 4.8 ),
                new Chaynik<>(model.get(2),40, 4.0 ));
        chaynikStream.sorted(new ChaynikComparator()).forEach(p ->
                System.out.printf("Следующие варианты по приобретению электрочайника: %s, стоимость чайника -  " +
                        "%s рублей, средняя оценка по отзывам потребитлей - %s из 5 \n ", p.getModel(), p.getPrice(),
                        p.getResponses()));
        Map<Object,Object> chaynikMap = chaynikStream.collect(Collectors.
                toMap(d -> d.getModel(), s -> s.getPrice()));
        chaynikMap.forEach((s,v)->System.out.print(s+ " - " + v));







    }
}
