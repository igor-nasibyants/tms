package com.tms.homework.staryyo.task7;
import static com.tms.homework.staryyo.task7.rifletype.AK47;
import static com.tms.homework.staryyo.task7.rifletype.AK74;

public class main {
    public static void main(String[] args) {
        System.out.print(AK47);
        rifle AK47 = new rifle ("AK47", 7.62, 1947);
        System.out.println(AK47.toString());
        AK47.type();
        AK47.defeatedTheEnemy();

    }
}
