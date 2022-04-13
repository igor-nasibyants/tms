package com.tms.homework.artsiom.vladykouski.task15.example_2;

import java.util.Comparator;


public class FootballTeamComparator implements Comparator<FootballTeam> {
    public int compare (FootballTeam c1, FootballTeam c2){
        return c1.getPoints().toString().compareTo(c2.getPoints().toString());
    }
}
