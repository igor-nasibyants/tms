package com.tms.homework.pavelgrigoryev.task7.nyalothathewakingcity;

import com.tms.homework.pavelgrigoryev.task7.DamageDealer;
import com.tms.homework.pavelgrigoryev.task7.GuildLeader;
import com.tms.homework.pavelgrigoryev.task7.Healer;
import com.tms.homework.pavelgrigoryev.task7.Tank;

public class BalanceDruidRL implements GuildLeader {
    @Override
    public Tank getTank() {
        return new BloodDeathKnight();
    }

    @Override
    public Healer getHealer() {
        return new HolyPriest();
    }

    @Override
    public DamageDealer getDamageDealer() {
        return new FireMage();
    }

}
