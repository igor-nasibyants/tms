package com.tms.homework.artsiom.vladykouski.task11.ownTask;

public class Main {
    public static void main (String [] args) throws NotEatDeathlyMashroomsException {

        SomeMashrooms[] values = SomeMashrooms.values();
        int i;
        for (i = 0; i < SomeMashrooms.values().length; i++) {
            try {
                if (i <= 3)
                    throw new NotEatDeathlyMashroomsException(SomeMashrooms.values()[i]);
                System.out.println("Вот такие грибы можно собирать:  " + SomeMashrooms.values()[i]);
                }
            catch(NotEatDeathlyMashroomsException exc){
                    System.out.println(exc);

                }
            }
        }
    }
