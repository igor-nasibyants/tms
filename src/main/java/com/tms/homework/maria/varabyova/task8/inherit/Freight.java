package com.tms.homework.maria.varabyova.task8.inherit;

public class Freight extends Consignor {

    private String freightName;

    public Freight(String freightName, String consignorName) {
        super(consignorName);
        this.freightName = freightName;
    }

    public String getFreightName() {
        return freightName;
    }

}