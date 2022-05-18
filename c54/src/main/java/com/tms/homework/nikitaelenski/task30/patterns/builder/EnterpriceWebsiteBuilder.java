package com.tms.homework.nikitaelenski.task30.patterns.builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Twoi sait");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALFPRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(1998);
    }
}
