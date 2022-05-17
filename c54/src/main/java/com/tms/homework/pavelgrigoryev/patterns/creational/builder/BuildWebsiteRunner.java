package com.tms.homework.pavelgrigoryev.patterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director directorPeter = new Director();
        Director directorSteven = new Director();

        directorPeter.setBuilder(new EnterpriseWebsiteBuilder());
        Website websiteForPeter = directorPeter.buildWebsite();

        System.out.println(websiteForPeter);

        directorSteven.setBuilder(new VisitCardWebsiteBuilder());
        Website websiteForSteven = directorSteven.buildWebsite();

        System.out.println(websiteForSteven);
    }
}
