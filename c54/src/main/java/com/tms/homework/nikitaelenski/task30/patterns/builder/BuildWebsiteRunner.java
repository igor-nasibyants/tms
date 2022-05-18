package com.tms.homework.nikitaelenski.task30.patterns.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCartWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
