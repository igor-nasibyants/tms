package com.tms.homework.han.task1;

//        Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.


public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        String answer = "";
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                answer = "Массив является строго возрастающей последовательностью";
            }
            else {
                answer = "Массив не является строго возрастающей последовательностью";
                break;
            }
        }
        System.out.println();
        System.out.println(answer);
    }
}
