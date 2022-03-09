package com.tms.homework.artsiom.vladykouski.task11.ownTask;

public class NotEatDeathlyMashroomsException extends Exception {
    int i;
    SomeMashrooms [] values = SomeMashrooms.values();
    NotEatDeathlyMashroomsException (SomeMashrooms m){
        SomeMashrooms.values()[0] = m;
        SomeMashrooms.values()[1] = m;
        SomeMashrooms.values()[2] = m;
        SomeMashrooms.values()[3] = m;
     }
     public String toString(){
        return "Эти грибы есть нельзя";
     }

}
