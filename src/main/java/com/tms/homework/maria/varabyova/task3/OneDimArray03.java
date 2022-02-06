package com.tms.homework.maria.varabyova.task3;
/*
3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.
 */

import java.util.Random;
public class OneDimArray3 {
    public static void main(String args[]){
        int count = 0;
        int a[] = new int[15];
        for (int key : a) {
            key= (0+(int)(Math.random() * 99));
            System.out.print(key+ " ");
            if (key % 2 ==0) {
                count++;
            }
        }
        System.out.println();
        System.out.print("Количество чётных значений: "+count);
    }
}
