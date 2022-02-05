package com.tms.homework.maria.varabyova.task2;

public class CycleForTest {
    public static void main(String[] args) {
        int i;
        int b = 0;

        for(i=1;i<10;i++){
            System.out.print(i+" проход цикла");
            b+=i;
            System.out.println("b="+b);
        }
    }
}
