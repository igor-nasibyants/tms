package com.tms.homework.han.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Place> places = new ArrayList<>();
        places.add(new HanWorkShop());
        places.add(new TeslaWorkShop());
        places.add(new GrigorWorkShop());
        places.add(new SergeyWorkShop());

        places.forEach(place -> {
            Man man = new Man();
            place.accept(man);
            System.out.println(man.value);
        });
    }
}
