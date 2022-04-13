package com.tms.homework.artsiom.vladykouski.task12;

public class CostExecption extends Exception {
    public int cost;

    public CostExecption(int cost) {
        this.cost = cost;
    }
    public String toString(){
        return "Слишком дорого, покупать не будем \n";
    }
}
