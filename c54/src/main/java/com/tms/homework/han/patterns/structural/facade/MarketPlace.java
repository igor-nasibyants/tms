package com.tms.homework.han.patterns.structural.facade;

public class MarketPlace {
    private AccountWoW accountWoW;
    private Auction auction;
    private PercentToGoblins percent;

    public MarketPlace() {
        this.accountWoW = new AccountWoW();
        this.auction = new Auction();
        this.percent = new PercentToGoblins();
    }

    public void productReceive() {
        percent.taxOfEntry(100);
        auction.placement();
        accountWoW.sell();
    }

    public void productRelease() {
        accountWoW.payment();
        percent.percentOfSales(10);
        accountWoW.receive();
        auction.exit();
    }
}
