package com.tms.homework.nikitaelenski.task14;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<Houses> housesList = new ArrayList<>();
       housesList.add(new Houses(1 , 56.5 ,10 , 12,"ул.Кабушкина"  ));
       housesList.add(new Houses(2 , 70.0 ,18 , 71,"ул.Славинского"  ));
       housesList.add(new Houses(3 , 100.0 ,14 , 71,"ул.Славинского"  ));
       housesList.add(new Houses(4 , 100.4 ,14 , 44,"ул.Волшебная"  ));
       housesList.add(new Houses(5 , 77.77 ,11 , 71,"ул.Славинского"  ));
       housesList.add(new Houses(6 , 99 ,13 , 70,"Переулок.святогоАнтона"));
                housesList.stream()
                .sorted(Houses::compareTo)
                .forEach(System.out::println);

       houseMap(housesList);
    }
    public static void houseMap(List<Houses> housesList){
        HashMap<Integer , Integer> hashMap = new HashMap<>(housesList.stream()
                .filter((a) -> (a.getAddress().equals("ул.Славинского")))
                .filter((a) -> (a.getNumberOfApartments() <90))
                .collect(Collectors.toMap(Houses::getId, Houses::getUmberOfFloors)));
        hashMap.forEach((s , k )->System.out.println( s + " " +  k ));
    }
}
