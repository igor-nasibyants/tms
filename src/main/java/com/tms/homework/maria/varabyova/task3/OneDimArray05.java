package com.tms.homework.maria.varabyova.task3;
/*
5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
 */
public class OneDimArray05 {
    public static void main(String args[]) {
        int a1[] = new int [5];
        int a2[] = new int [5];

        for(int i=0; i<a1.length; i++) {
            a1[i]=(0+(int)(Math.random()*15));
            System.out.print(a1[i]+" ");
        }

        for(int j=0; j<a2.length; j++) {
            a2[j]=(0+(int)(Math.random()*15));
            System.out.print(a2[j]+" ");
        }
    }
}
