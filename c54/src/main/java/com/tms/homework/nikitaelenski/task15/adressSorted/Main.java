package com.tms.homework.nikitaelenski.task15.adressSorted;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Home> BuildingAddresses = new ArrayList<>();

        BuildingAddresses.add(new Home(6 ,"ул.Славинского"));
        BuildingAddresses.add(new Home(5 ,"ул.Ветра"  ));
        BuildingAddresses.add(new Home(4 ,"ул.Славинского"  ));
        BuildingAddresses.add(new Home(3 ,"ул.Волшебная"  ));
        BuildingAddresses.add(new Home(2 ,"ул.Славинского"  ));
        BuildingAddresses.add(new Home(8 ,"Переулок.Святого Антона"));

        BuildingAddresses.stream()
                .sorted(Home::compareTo)
                .filter(o -> o.getAddress().equals("ул.Славинского"))
                .forEach(System.out::println);
    }


}
