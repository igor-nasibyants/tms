package com.tms.homework.maria_varabyova.HW02;

public class CycleOperators {
    public static void main (String args[]) {
        int x=1;
        while(x<100){ //Посчитать от 1 до 100 с пом-ю цикла While
            System.out.print (+x+" ");
            x++;
        }

        do { //Посчитать от 1 до 100 с пом-ю цикла Do While
            System.out.print(x+" ");
            x++;
        }while(x<0);

        for(x=1; x<=100; x++){    //Посчитать от 1 до 100 с пом-ю цикла For

            System.out.print(x+" ");
        }
    }
}
