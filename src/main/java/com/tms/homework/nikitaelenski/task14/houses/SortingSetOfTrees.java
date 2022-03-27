package com.tms.homework.nikitaelenski.task14.houses;

import com.tms.homework.nikitaelenski.task14.Houses;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortingSetOfTrees {
    public static void main(String[] args) {
        SortedSet<Houses> House = new TreeSet<>();

        House.add(new Houses(1 , 56.5 ,10 , 12,"ул.Кабушкина"  ));
        House.add(new Houses(2 , 70.0 ,18 , 71,"ул.Славинского"  ));
        House.add(new Houses(3 , 100.0 ,14 , 71,"ул.Славинского1"  ));
        House.add(new Houses(4 , 100.4 ,14 , 44,"ул.Волшебная"  ));
        House.add(new Houses(5 , 77.77 ,11 , 71,"ул.Славинского2"  ));
        House.add(new Houses(6 , 99 ,13 , 70,"Переулок.Святого Антона"));
        House.stream()
                .sorted(Houses::compareTo)
                .forEach(System.out::println);

    }
}
