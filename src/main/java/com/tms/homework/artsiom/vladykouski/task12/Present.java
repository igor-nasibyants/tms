package com.tms.homework.artsiom.vladykouski.task12;
import java.util.Scanner;

public class  Present  {
    private String flowers;
    private String electronics;
    private String parfums;
    private String clothes;


    Scanner sc = new Scanner(System.in);


    private int cost1 = sc.nextInt();
    private int cost2 = sc.nextInt();
    private int cost3 = sc.nextInt();
    private int cost4 = sc.nextInt();


    public Present(String flowers, String electronics, String parfums, String clothes) {
        this.flowers = flowers;
        this.electronics = electronics;
        this.parfums = parfums;
        this.clothes = clothes;
    }
    public String getFlowers() {
        return flowers;
    }

    public String getElectronics() {
        return electronics;
    }

    public String getParfums() {
        return parfums;
    }

    public String getClothes() {
        return clothes;
    }


        public int getCost1 () {
        return cost1;
    }

        public int getCost2 () {
        return cost2;
    }

        public int getCost3 () {
        return cost3;
    }

        public int getCost4 () {
        return cost4;
    }

    public String toString (){
        return "Стоимость  " + getFlowers()+ " - " + getCost1() + "\n" + "Стоимость  " + getElectronics() +
                " - " + getCost2() + "\n" + "Стоимость  " + getParfums() + " - " + getCost3() + "\n" + "Стоимость  " +
                getClothes() + " - " + getCost4();
     }
}
