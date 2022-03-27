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

        String maximum = Stream.of("Никита" , "Галина" ).max(Comparator.comparing(x -> x)).get();
        System.out.println(maximum);

        System.out.println(povtori);

        list.stream().distinct()
                .forEach(System.out::println);

        System.out.println(povtori);

        list.stream().skip(2)
                .forEach(System.out::println);

        System.out.println(povtori);

        String str = list.stream().filter(x->x.equals("six")).findAny().get();
        System.out.println(str);

        System.out.println(povtori);

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

        List<Home> Homes = new ArrayList<>();

        Homes.add(new Home(6 ,"ул.Славинского"));
        Homes.add(new Home(5 ,"ул.Ветра"  ));
        Homes.add(new Home(4 ,"ул.Славинского"  ));
        Homes.add(new Home(3 ,"ул.Волшебная"  ));
        Homes.add(new Home(2 ,"ул.Славинского"  ));
        Homes.add(new Home(8 ,"Переулок.Святого Антона"));

        List<Home> sortedHome = Homes.stream()
                .filter(p->p.getAddress().startsWith("ул.С"))
                .collect(Collectors.toList());
        System.out.println(sortedHome);

        System.out.println(povtori);

        Map<Integer , List<Home>>  idHomes = Homes.stream()
                .collect(Collectors.groupingBy(p->p.getId()));

        System.out.println(povtori);


    }



}
