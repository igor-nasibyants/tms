package com.tms.homework.staryyo.task7;

import static com.tms.homework.staryyo.task7.RifleType.AK47;
import static com.tms.homework.staryyo.task7.RifleType.AK74;

public class Main implements Fire {
    public static void main(String[] args) {
        System.out.println();
        Rifle ak47 = new Rifle(AK47, 7.62, 1947);
        System.out.println(ak47.RifleType);
        ak47.type();
        ak47.defeatedTheEnemy();

        System.out.println();
        Rifle ak74 = new Rifle(AK74, 5.45, 1974);
        System.out.println(ak74.RifleType);
        ak74.RifleType = AK74;
        ak74.type();
        ak74.defeatedTheEnemy();
    }
}
