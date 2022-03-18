package com.tms.homework.pavelgrigoryev.task16;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Streams streams = new Streams();
        streams.terminate();
    }

    private final List<Dwarf> dwarves = List.of(
            new Dwarf("Muradin","Bronzebeared",121,56,Role.TANK),
            new Dwarf("Moyra","Taurissan",233,40,Role.HEALER),
            new Dwarf("Falstad","Thunderforge",1212,50,Role.MELEE_DAMAGE_DEALER),
            new Dwarf("Magni","Bronzebeard",70,60,Role.RANGED_DAMAGE_DEALER),
            new Dwarf("Bran","Bronzebeared",127,41,Role.MELEE_DAMAGE_DEALER),
            new Dwarf("Barab","Icebeared",60,30,Role.TANK),
            new Dwarf("Chise","Hammergrim",789,25,Role.HEALER),
            new Dwarf("Ferya","Chunderstout",600,33,Role.RANGED_DAMAGE_DEALER)
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

    public void sep() {
        System.out.println("==========================================================================================");
    }
}
