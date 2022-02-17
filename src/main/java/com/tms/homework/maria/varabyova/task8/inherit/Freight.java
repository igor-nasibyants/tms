package com.tms.homework.maria.varabyova.task8.inherit;

public class Freight extends Consignor{

    private String FreightName;

    public Freight (String FreightName, String ConsignorName){
        super(ConsignorName);
        this.FreightName = FreightName;
    }

    public String getFreightName() {
        return FreightName;
    }




}
