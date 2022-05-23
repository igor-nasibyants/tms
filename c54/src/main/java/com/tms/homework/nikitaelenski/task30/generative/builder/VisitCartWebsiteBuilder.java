package com.tms.homework.nikitaelenski.task30.generative.builder;

public class VisitCartWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("My Sait");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(1997);
    }
}
