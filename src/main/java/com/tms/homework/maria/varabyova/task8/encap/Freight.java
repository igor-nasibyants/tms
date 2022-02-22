package com.tms.homework.maria.varabyova.task8.encap;

import java.util.Objects;

public class Freight {
    private String goods;
    private int weight;
    private String consignor;
    private String consignee;

    public Freight(String goods, int weight, String consignor, String consignee) {
        this.goods = goods;
        this.weight = weight;
        this.consignor = consignor;
        this.consignee = consignee;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Freight freight = (Freight) o;
        return weight == freight.weight && goods.equals(freight.goods) && consignor.equals(freight.consignor) && consignee.equals(freight.consignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goods, weight, consignor, consignee);
    }
}
