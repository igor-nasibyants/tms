package com.tms.homework.pavelgrigoryev.task7;

import com.tms.homework.pavelgrigoryev.task7.icecrowncitadel.FuryWarriorRL;

public class StartTheIceCrownCitadel {
    public static void main(String[] args) {
        GuildLeader guildLeader = new FuryWarriorRL();
        Healer healer = guildLeader.getHealer();
        Tank tank = guildLeader.getTank();
        DamageDealer damageDealer = guildLeader.getDamageDealer();

        System.out.println("----------------------------------------------------");
        System.out.println("Creating the raid { Ice Crown Citadel } ...");
        tank.tankAGame();
        damageDealer.doDamage();
        healer.healRaiders();
        System.out.println("----------------------------------------------------");
    }
}
