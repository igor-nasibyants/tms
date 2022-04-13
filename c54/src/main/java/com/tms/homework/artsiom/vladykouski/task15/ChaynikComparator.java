package com.tms.homework.artsiom.vladykouski.task15;

import java.util.Comparator;

public class ChaynikComparator implements Comparator <Chaynik> {

    public int compare(Chaynik c1, Chaynik c2){
     return  c1.getPrice().toString().compareTo(c2.getPrice().toString()) ;
    }


}
