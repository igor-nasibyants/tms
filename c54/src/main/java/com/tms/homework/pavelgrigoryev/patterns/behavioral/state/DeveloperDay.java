package com.tms.homework.pavelgrigoryev.patterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 13; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
