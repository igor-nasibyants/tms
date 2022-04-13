package com.tms.homework.nikitaelenski.task9;

public abstract class Shop {
    private  String adress;
    private Integer quantityGoods;
    private Integer range;
    private String  salesMArket;

    public Shop(String adress, Integer quantityGoods, Integer range, String salesMArket) {
        this.adress = adress;
        this.quantityGoods = quantityGoods;
        this.range = range;
        this.salesMArket = salesMArket;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getQuantityGoods() {
        return quantityGoods;
    }

    public void setQuantityGoods(Integer quantityGoods) {
        this.quantityGoods = quantityGoods;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public String getSalesMArket() {
        return salesMArket;
    }

    public void setSalesMArket(String salesMArket) {
        this.salesMArket = salesMArket;
    }

    public String timeJob() {
        return "Время работы ";
    }
}
