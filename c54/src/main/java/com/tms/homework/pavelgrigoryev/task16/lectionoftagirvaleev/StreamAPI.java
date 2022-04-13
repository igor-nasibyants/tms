package com.tms.homework.pavelgrigoryev.task16.lectionoftagirvaleev;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        optionalMethod();
        getOneGetTwo();

        Stream.of("foo", "bar", "hello")
                .mapToInt(String::length)
                .forEach(System.out::println);

        Stream.of("foo", "bar")
                .flatMapToInt(String::chars)
                .forEach(x -> System.out.print((char) x));

        System.out.println();

        Stream.of("foo", "bar", "baz")
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        Stream.of("foo", "bar", "baz")
                .peek(System.out::println)
                .filter(x -> x.startsWith("b"))
                .sorted()
                .forEach(x -> System.out.println("Result : " + x));

        List<Integer> list = IntStream.range(1, 50)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(list);
        list.forEach(x -> System.out.print(x + " "));

        System.out.println();

        IntStream.iterate(1, x -> x * 2)
                .limit(10)
                .sorted()
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        long numberOfOptions = Stream.of("dog", "--fast", "--", "alpha", "beta--")
                .filter(x -> x.startsWith("--"))
                .count();
        System.out.println("Number of options: " + numberOfOptions);

        long count = Stream.of(1, 2, 3, 4, 5)
                .peek(System.out::println)
                .count();
        System.out.println("Count: " + count);

        Stream.of("dog", "--fast", "--", "alpha", "beta--")
                .filter(x -> x.startsWith("--"))
                .findFirst()
                .map(x -> x.substring("--".length()))
                .ifPresent(x -> System.out.println("Option supplied: " + x));

        boolean hasOption = Stream.of("dog", "--fast", "--", "alpha", "beta--")
                .anyMatch(x -> x.startsWith("--"));
        System.out.println("Has option: " + hasOption);

        List<List<String>> listOfLists = List.of(List.of("foo", "bar", "baz"),
                List.of("Java", "Kotlin", "Groovy"),
                List.of("Hello", "Good Bye"));
        System.out.println(listOfLists.stream()
                .flatMap(List::stream)
                .peek(System.out::println)
                .anyMatch("Java"::equals));

        String[] strings = {"Hello", "Java", "Course", "Java"};
        Map<String, Integer> lengths = Arrays.stream(strings)
                .collect(Collectors
                        .toMap(x -> x, String::length, (a, b) -> a, LinkedHashMap::new));
        System.out.println("Map: " + lengths);

        System.out.println("Group by length: " + stringsByLength(Arrays.asList("a", "bb", "c", "dd", "eee")));

        System.out.println("Group by length and first letter: " + stringsByLengthAndFirstLetter(Arrays
                .asList("a", "b", "aa", "ab", "ba")));
    }

    static Map<Integer, Map<Character, List<String>>> stringsByLengthAndFirstLetter(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.groupingBy(s -> s.charAt(0))));
    }

    static Map<Integer, List<String>> stringsByLength(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    static Optional<String> getOne() {
        return Optional.empty();
    }

    static Optional<String> getTwo() {
        return Optional.of("foo");
    }

    private static void getOneGetTwo() {
        getOne().or(StreamAPI::getTwo).ifPresent(System.out::println);
    }

    private static void optionalMethod() {
        Optional.of("foo").filter(anObject -> false);
        boolean isFooEqualsBar = false;
        System.out.println(isFooEqualsBar);

        String trimmed = Optional.of(" foo ").map(String::trim).get();
        System.out.println(trimmed);

        Double random = Optional.<Double>empty().orElseGet(Math::random);
        System.out.println(random);
    }
}
