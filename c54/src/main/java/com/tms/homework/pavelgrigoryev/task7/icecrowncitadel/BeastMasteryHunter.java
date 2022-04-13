package com.tms.homework.pavelgrigoryev.task7.icecrowncitadel;

import com.tms.homework.pavelgrigoryev.task7.DamageDealer;

public class BeastMasteryHunter implements DamageDealer {
    @Override
    public void doDamage() {
        System.out.println("BeastMasteryHunter attacks the boss ...");
    }
}
