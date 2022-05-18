package com.tms.homework.nikitaelenski.task30.patterns.builder;

public abstract class WebsiteBuilder {
    Website website;
    void creatWebsite(){
        website = new Website();
    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }
}
