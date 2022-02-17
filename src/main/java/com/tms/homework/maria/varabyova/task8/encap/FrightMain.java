package com.tms.homework.maria.varabyova.task8.encap;

public class FrightMain {

    public static void main(String args[]) {
        Freight load=new Freight("Wood", 18300, "Beryozovsky, Sverdlovsk Oblast, RUS", "Padova (PD), I");
        String loadGoods = load.getGoods();
        int loadWeight = load.getWeight();
        String loadConsignor = load.getConsignor();
        String loadConsignee = load.getConsignee();




        Freight load2= new Freight("Household chemicals", 15110, "Cote D'or, Dijon, F", "Novomoskovsk, Tula Oblast, RU");
        String load2Goods = load2.getGoods();
        int load2Weight = load2.getWeight();
        String load2Consignor = load2.getConsignor();
        String load2Consignee = load2.getConsignee();


        System.out.println("============");
        System.out.println(loadGoods+", "+loadWeight+" kg, "+loadConsignor+" --> "+loadConsignee);
        System.out.println("============");
        System.out.println(load2Goods+", "+load2Weight+" kg, "+load2Consignor+" --> "+load2Consignee);
        System.out.println("============");


    }
}
