package com.tms.homework.artsiom.vladykouski.task8;

public class FootballChamp {
    String country;
    String nameChamp;
    int numberTeam;
    int wins;
    int loss;
    int draw;
    int points;

    public FootballChamp(String country, String nameChamp, int numberTeam) {
        this.country = country;
        this.nameChamp = nameChamp;
        this.numberTeam = numberTeam;
    }

    public FootballChamp(int wins, int loss, int draw) {
        this.wins = wins;
        this.loss = loss;
        this.draw = draw;
    }

    void winner(){
        System.out.print("Победитель чемпионата с количеством очков" + points);
    }
}
