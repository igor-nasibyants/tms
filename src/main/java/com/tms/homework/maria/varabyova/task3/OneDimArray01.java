package com.tms.homework.maria.varabyova.task3;

/* 1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
 */
public class OneDimArray01 {
    public static void main(String args[]) {
        /*int a[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Значения массива ");
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i] + " ");
        }
        for(int i=1;i<a.length; i++){
            System.out.print(a[i]+" ");
        }*/
        anotherWay();
    }

    private static void anotherWay() {
        int a[] = new int[10];
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                a[i / 2 - 1] = i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}