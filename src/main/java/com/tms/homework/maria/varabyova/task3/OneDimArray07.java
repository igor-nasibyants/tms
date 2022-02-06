package com.tms.homework.maria.varabyova.task3;
/*
7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.
 */

public class OneDimArray07 {
    public static void main(String args[]){
        int a[]=new int[12];


        for(int i=0; i<a.length; i++) {
            a[i]=(0+(int)(Math.random()*15));
            System.out.print(a[i]+" ");
        }

        int max=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println();
        System.out.print("Max = "+max);

    }
}
