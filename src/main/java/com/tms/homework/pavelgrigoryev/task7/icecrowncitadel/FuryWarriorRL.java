package com.tms.homework.pavelgrigoryev.task7.icecrowncitadel;

import com.tms.homework.pavelgrigoryev.task7.DamageDealer;
import com.tms.homework.pavelgrigoryev.task7.GuildLeader;
import com.tms.homework.pavelgrigoryev.task7.Healer;
import com.tms.homework.pavelgrigoryev.task7.Tank;

public class FuryWarriorRL implements GuildLeader {
    @Override
    public Tank getTank() {
        return new ProtectionPaladin();
    }

    @Override
    public Healer getHealer() {
        return new ShamanHealer();
    }

    @Override
    public DamageDealer getDamageDealer() {
        return new BeastMasteryHunter();
    }
}
