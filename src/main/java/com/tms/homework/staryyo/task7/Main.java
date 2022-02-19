package com.tms.homework.staryyo.task7;
import static com.tms.homework.staryyo.task7.RifleType.AK47;
import static com.tms.homework.staryyo.task7.RifleType.AK74;

public class Main {
    public static void main(String[] args) {
        System.out.print(AK47);
        Rifle ak47 = new Rifle(AK47, 7.62, 1947);
        System.out.println(AK47.toString());
        ak47.type();
        ak47.defeatedTheEnemy();

    }
}
