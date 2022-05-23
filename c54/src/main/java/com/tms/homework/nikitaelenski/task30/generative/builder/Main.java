package com.tms.homework.nikitaelenski.task30.generative.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        int random = (int) (1+Math.random()*2);
        if(random ==1) {
            director.setBuilder(new VisitCartWebsiteBuilder());
            Website website = director.buildWebsite();
            System.out.println(website);
        } else if (random ==2) {
            director.setBuilder(new EnterpriceWebsiteBuilder());
            Website website = director.buildWebsite();
            System.out.println(website);
        }
    }
}
