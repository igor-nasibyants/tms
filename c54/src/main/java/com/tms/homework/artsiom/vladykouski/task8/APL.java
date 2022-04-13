package com.tms.homework.artsiom.vladykouski.task8;
import java.util.Arrays;
import java.util.Random;

public class APL extends FootballChamp implements Countable {

    private APL(String country, String nameChamp, int numberTeam) {
        super(country, nameChamp, numberTeam);
    }

    private APL(int wins, int loss, int draw) {
        super(wins, loss, draw);
    }
    @Override
    void winner() {
    }

    @Override
    public void point() {
        points = wins *3;
        points = draw*1;
        points = loss *0;
    }

    public static void main(String [] args){
        APL c = new APL("England", "APL", 20);
        Random v = new Random();
        APL21_22 a = APL21_22.ARSENAL;
        APL21_22 b = APL21_22.CHELSY;
        APL21_22 d = APL21_22.NEWCASTLE;
        APL21_22 e = APL21_22.CRYSTALPALACE;
        APL21_22 f = APL21_22.ASTONVILLA;
        APL21_22 g = APL21_22.LEEDS;
        APL21_22 h = APL21_22.LESTER;
        APL21_22 j = APL21_22.LIVERPOOL;
        APL21_22 k = APL21_22.BRANDFORD;
        APL21_22 l = APL21_22.BRAYTON;
        APL21_22 q = APL21_22.BYRNLEY;
        APL21_22 w = APL21_22.MANCITY;
        APL21_22 r = APL21_22.MANUNATED;
        APL21_22 t = APL21_22.TOTTENHAM;
        APL21_22 y = APL21_22.WESTHAM;
        APL21_22 u = APL21_22.SOUTHHAMPTON;
        APL21_22 i = APL21_22.NORWICH;
        APL21_22 o = APL21_22.WOLVES;
        APL21_22 p = APL21_22.EVERTON;
        APL21_22 s = APL21_22.WATFORD;
        APL21_22 [] arr = APL21_22.values();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(arr)+"\n");
        int [][] arrays = new int[20][5];
        c.wins = v.nextInt();
        System.out.print(c.numberTeam);



            }
        }




