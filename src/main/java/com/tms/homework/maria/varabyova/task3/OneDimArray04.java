package com.tms.homework.maria.varabyova.task3;
/*
4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
 */


public class OneDimArray04 {
    public static void main(String args[]) {
        int a[] = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (0 + (int) (Math.random() * 20));
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Каждый элемент с нечетным индексом заменен на 0: ");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
            System.out.println(a[i]);
        }
    }
}