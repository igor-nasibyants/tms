package com.tms.homework.nikitaelenski.task14;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortingSetOfTrees {
    public static void main(String[] args) {
        SortedSet<Houses> Home = new TreeSet<>();
        Home.add(new Houses(1 , 56.5 ,10 , 12,"ул.Кабушкина"  ));
        Home.add(new Houses(2 , 70.0 ,18 , 71,"ул.Славинского"  ));
        Home.add(new Houses(3 , 100.0 ,14 , 71,"ул.Славинского1"  ));
        Home.add(new Houses(4 , 100.4 ,14 , 44,"ул.Волшебная"  ));
        Home.add(new Houses(5 , 77.77 ,11 , 71,"ул.Славинского2"  ));
        Home.add(new Houses(6 , 99 ,13 , 70,"Переулок.Святого Антона"));
        Home.stream()
                .sorted(Houses::compareTo)
                .forEach(System.out::println);

    }
}
