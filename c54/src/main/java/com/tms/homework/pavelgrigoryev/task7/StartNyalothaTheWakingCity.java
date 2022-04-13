package com.tms.homework.pavelgrigoryev.task7;

import com.tms.homework.pavelgrigoryev.task7.nyalothathewakingcity.BalanceDruidRL;

public class StartNyalothaTheWakingCity {
    public static void main(String[] args) {
        GuildLeader guildLeader = new BalanceDruidRL();
        Healer healer = guildLeader.getHealer();
        Tank tank = guildLeader.getTank();
        DamageDealer damageDealer = guildLeader.getDamageDealer();

        System.out.println("----------------------------------------------------");
        System.out.println("Creating the raid { Ny'alotha, the Waking City } ...");
        tank.tankAGame();
        damageDealer.doDamage();
        healer.healRaiders();
        System.out.println("----------------------------------------------------");
    }
}
