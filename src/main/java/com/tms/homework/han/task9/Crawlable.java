package com.tms.homework.han.task9;

public interface Crawlable {
    default String crawl() {
        return null;
    }
}
