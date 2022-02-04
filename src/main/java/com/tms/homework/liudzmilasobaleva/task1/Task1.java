package com.tms.homework.liudzmilasobaleva.task1;

public class Task1 {
    public static void main(String[] args) {

// 1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//созданием массива подумайте, какого он будет размера.
        int[] array = new int[10];
        array[0] = 2;

        for (int i = 0; i < array.length - 1; i++) {
            array[i + 1] = array[i] + 2;
        }
        for (int s = 0; s < array.length; s++) { //печатаем массив в строку
            System.out.print(array[s] + " ");
        }
        System.out.println();
        for (int c = 0; c < array.length; c++) { //печатаем массив в столбик(отделяя один элемент от другого началом новой строки)
            System.out.println(array[c]);
        }
    }
}
