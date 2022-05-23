package com.tms.homework.nikitaelenski.task30.generative.builder;

public class Director {
    WebsiteBuilder builder;

    public void  setBuilder (WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Director() {

    }

    Website buildWebsite(){
        builder.creatWebsite();
        builder.buildCms();
        builder.buildName();
        builder.buildPrice();
        Website website = builder.getWebsite();
        return website;
    }
}
