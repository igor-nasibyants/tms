package com.tms.homework.maria.varabyova.task8.encap;

public class Freight {
    private String goods;
    private int weight;
    private String consignor;
    private String consignee;

    public Freight(String goods, int weight, String consignor, String consignee){
        this.goods = goods;
        this.weight = weight;
        this.consignor = consignor;
        this.consignee= consignee;
    }

    public String getGoods() {
        return goods;
    }
    public void setGoods(String freight) {
        this.goods = goods;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getConsignor() {
        return consignor;
    }
    public void setConsignor(String consignor) {
        this.consignor = consignor;
    }

    public String getConsignee() {
        return consignee;
    }
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }
}
