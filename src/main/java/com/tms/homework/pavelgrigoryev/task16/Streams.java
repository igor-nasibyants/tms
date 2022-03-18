package com.tms.homework.pavelgrigoryev.task16;

import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

    }

    private List<Dwarf> dwarves = List.of(
            new Dwarf("Muradin","Bronzebeared",121,56,Role.TANK),
            new Dwarf("Moyra","Taurissan",233,40,Role.HEALER),
            new Dwarf("Falstad","Thunderforge",1212,50,Role.MELEE_DAMAGE_DEALER),
            new Dwarf("Magni","Bronzebeard",70,60,Role.RANGED_DAMAGE_DEALER),
            new Dwarf("Bran","Bronzebeared",127,41,Role.MELEE_DAMAGE_DEALER),
            new Dwarf("Barab","Icebeared",60,30,Role.TANK),
            new Dwarf("Chise","Hammergrim",789,25,Role.HEALER),
            new Dwarf("Ferya","Chunderstout",600,33,Role.RANGED_DAMAGE_DEALER)
    );



    private void print(Stream<Dwarf> stream) {
        stream
                .map(emp -> String.format(
                        "%4d | %-15s %-10s age %s %s",
                        emp.getId(),
                        emp.getLastName(),
                        emp.getFirstName(),
                        emp.getAge(),
                        emp.getRole()
                ))
                .forEach(System.out::println);

        System.out.println();
    }
}
