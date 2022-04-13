package com.tms.homework.pavelgrigoryev.task16;

import com.tms.homework.pavelgrigoryev.task16.ironforged.Dwarf;
import com.tms.homework.pavelgrigoryev.task16.ironforged.Role;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Streams streams = new Streams();
        streams.terminate();
        streams.transform();
        streams.real();
    }

    private final List<Dwarf> dwarves = List.of(
            new Dwarf("Muradin", "BronzeBeard", 121, 56, Role.TANK),
            new Dwarf("Moyra", "Taurissan", 233, 40, Role.HEALER),
            new Dwarf("Falstad", "Thunderforge", 1212, 50, Role.MELEE_DAMAGE_DEALER),
            new Dwarf("Magni", "BronzeBeard", 70, 60, Role.RANGED_DAMAGE_DEALER),
            new Dwarf("Bran", "BronzeBeard", 127, 41, Role.MELEE_DAMAGE_DEALER),
            new Dwarf("Barab", "IceBeard", 60, 30, Role.TANK),
            new Dwarf("Chise", "Hammergrim", 789, 25, Role.HEALER),
            new Dwarf("Ferya", "Chunderstout", 600, 33, Role.RANGED_DAMAGE_DEALER)
    );

    public void terminate() {
        sep();
        Stream<Dwarf> stream = dwarves.stream();
        System.out.println(stream.count());
        sep();

        dwarves.forEach(dwarf -> System.out.print(dwarf.getAge() + " "));
        System.out.println();
        sep();

        Map<Integer, String> collect = dwarves.stream().collect(Collectors.toMap(
                Dwarf::getId,
                dwarf -> String.format("%s %s", dwarf.getLastName(), dwarf.getFirstName())
        ));
        System.out.println(collect);
        sep();

        System.out.println(dwarves.stream().max(Comparator.comparingInt(Dwarf::getAge)));
        sep();

        System.out.println(dwarves.stream().findAny());
        sep();
        System.out.println(dwarves.stream().findFirst());
        sep();

        System.out.println(dwarves.stream().noneMatch(dwarf -> dwarf.getAge() > 60));
        sep();
        System.out.println(dwarves.stream().anyMatch(dwarf -> dwarf.getRole() == Role.TANK));
        sep();
        System.out.println(dwarves.stream().allMatch(dwarf -> dwarf.getAge() > 18));
        sep();
    }

    public void transform() {
        Stream<Dwarf> dwarfStream = dwarves.stream().filter(dwarf -> dwarf.getRole() != Role.TANK);
        System.out.println(dwarfStream);
        sep();

        dwarves.stream().takeWhile(dwarf -> dwarf.getAge() > 30).forEach(System.out::println);
        sep();
        dwarves.stream().dropWhile(dwarf -> dwarf.getAge() > 30).forEach(System.out::println);
        sep();

        IntStream.of(100, 200, 300, 400)
                .flatMap(value -> IntStream.of(value - 50, value))
                .forEach(System.out::println);
        sep();
    }

    public void real() {
        Stream<Dwarf> dwarfStream = dwarves.stream()
                .filter(dwarf ->
                        dwarf.getAge() <= 30 && dwarf.getRole() != Role.MELEE_DAMAGE_DEALER
                )
                .sorted(Comparator.comparing(Dwarf::getLastName));

        print(dwarfStream);

        Stream<Dwarf> sorted = dwarves.stream()
                .filter(dwarf -> dwarf.getAge() > 40)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(4);

        print(sorted);

        IntSummaryStatistics statistics = dwarves.stream()
                .mapToInt(Dwarf::getAge)
                .summaryStatistics();

        System.out.println(statistics);
        sep();
    }

    private void print(Stream<Dwarf> stream) {
        stream
                .map(dwarf -> String.format(
                        "%4d | %-15s %-10s age %s %s",
                        dwarf.getId(),
                        dwarf.getLastName(),
                        dwarf.getFirstName(),
                        dwarf.getAge(),
                        dwarf.getRole()
                ))
                .forEach(System.out::println);

        sep();
    }

    public static void sep() {
        System.out.println("===============================O==(--------|||---------)==O===================================");
    }
}
