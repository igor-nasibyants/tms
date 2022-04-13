package com.tms.homework.nikitaelenski.task15;

import com.tms.homework.nikitaelenski.task15.adressSorted.Home;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testStreaAndOptionals {

    public static void main(String[] args) {
    var name = "=";
    String povtori = name.repeat(25);
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

//      Set<String> set = list.stream().collect(Collectors.toSet());
        Set<String> set = new HashSet<>(list);

        list.stream().map(x->x.toUpperCase())
                .filter(x-> x.startsWith("F") && x.endsWith("E"))
                .map(y -> y.replace("IV", "XX"))
                .forEach(x-> System.out.println(x + ": и это все "));

        System.out.println(povtori);

//выбираем максимальное
        String maximum = Stream.of("Никита" , "Галина" )
                .max(Comparator.comparing(x -> x)).get();
        System.out.println(maximum);

        System.out.println(povtori);

//убираем все повторяющиеся
        list.stream().distinct()
                .forEach(System.out::println);

        System.out.println(povtori);

//пропускаем первые 2 элемента в списке
        list.stream().skip(2)
                .forEach(System.out::println);

        System.out.println(povtori);

//сравним и выберем первый элемент который нужно найти
        String str = list.stream().filter(x->x.equals("six")).findAny().get();
        System.out.println(str);

        System.out.println(povtori);

//важна последовательность
        Stream.of("aa1","aa2","bb1","bb2","cc1","cc2")
                .filter(s->{
                    System.out.println("filter ; " + s);
                    return s.startsWith("a");
                })
                .sorted((s1,s2)->{
                    System.out.printf("sort %s ; %s " , s1 , s2);
                    System.out.println(" ");
                     return s1.compareTo(s2);
                })
                .map(s->{
                    System.out.print("map ; ");
                    return s.toUpperCase();
                })
                .forEach(System.out::println);

        System.out.println(povtori);

//новый лист
        List<Home> Homes = new ArrayList<>();

        Homes.add(new Home(6 ,"ул.Славинского"));
        Homes.add(new Home(5 ,"ул.Ветра"  ));
        Homes.add(new Home(4 ,"ул.Славинского"  ));
        Homes.add(new Home(3 ,"ул.Волшебная"  ));
        Homes.add(new Home(2 ,"ул.Славинского"  ));
        Homes.add(new Home(8 ,"Переулок.Святого Антона"));

//фильтруем
        List<Home> filterHome = Homes.stream()
                .filter(p->p.getAddress().startsWith("ул.С"))
                .collect(Collectors.toList());
        System.out.println(filterHome);

        System.out.println(povtori);

//из листа в мапу
        Map<Integer, String>  idHomes = Homes.stream()
                .collect(Collectors.toMap(Home::getId , Home::getAddress));

        idHomes.entrySet().stream()
                .map(elem -> elem.getKey() + " = " + elem.getValue())
                .forEach(System.out::println);

        System.out.println(povtori);

//Статистика по id
        IntSummaryStatistics theAverageId = Homes.stream()
                .collect(Collectors.summarizingInt(p-> p.getId()));
        System.out.println(theAverageId);

        System.out.println(povtori);

//Обьединение
        String phores = Homes.stream().filter(p->p.getAddress().startsWith("ул.С"))
                .map(Home::getAddress)
                .collect(Collectors.joining(" и ","В Минске адреса ", " присутствуют"));
        System.out.println(phores);

        System.out.println(povtori);

        Optional<String> hello = Optional.ofNullable(null);

        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());

        hello.ifPresentOrElse(System.out::println,()->{
            System.out.println("World");
        });



//




    }



}
