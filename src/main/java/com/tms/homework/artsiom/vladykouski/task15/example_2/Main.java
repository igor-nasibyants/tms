package com.tms.homework.artsiom.vladykouski.task15.example_2;

import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {


        Stream <FootballTeam> streamteam = Stream.of(
                new FootballTeam<>("Arsenal",13, 25),
                new FootballTeam<>("Chelsea", 10, 25),
                new FootballTeam<>("Tottenham", 1, 0));
        List <FootballTeam> teams = streamteam.sorted(new FootballTeamComparator()).toList();
        Optional <FootballTeam> arsenal = Optional.of(teams.get(1));
        System.out.print(arsenal);







    }
}
