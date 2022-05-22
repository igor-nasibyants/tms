package com.tms.homework.pavelgrigoryev.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) throws InterruptedException {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Pavel Grigoryev");
        Observer secondSubscriber = new Subscriber("Nikita Han");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");
        Thread.sleep(5000);

        jobSite.removeVacancy("First Java Position");
        Thread.sleep(5000);

        jobSite.removeObserver(secondSubscriber);
        jobSite.removeVacancy("Third Java Position");
    }
}
