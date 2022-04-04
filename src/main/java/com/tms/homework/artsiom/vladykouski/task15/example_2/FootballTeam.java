package com.tms.homework.artsiom.vladykouski.task15.example_2;
import java.util.Comparator;

public class FootballTeam <T>  {
    private T name;
    private T points;
    private T goals;

    public  FootballTeam(T name, T points, T goals) {
        this.name = name;
        this.points = points;
        this.goals = goals;
    }

    public T getName() {
        return name;
    }

    public T getPoints() {
        return points;
    }

    public T getGoals() {
        return goals;
    }

}
