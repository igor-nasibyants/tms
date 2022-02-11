package com.tms.homework.pavelgrigoryev.task7.nyalothathewakingcity;

import com.tms.homework.pavelgrigoryev.task7.DamageDealer;

public class FireMage implements DamageDealer {
    @Override
    public void doDamage() {
        System.out.println("FireMage attacks the boss ...");
    }
}
