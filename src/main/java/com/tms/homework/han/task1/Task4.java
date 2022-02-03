package com.tms.homework.han.task1;

//        Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//        массив на экран в строку. Замените каждый элемент с нечётным индексом на
//        ноль. Снова выведете массив на экран на отдельной строке.


public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 20));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Массив с 0: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
