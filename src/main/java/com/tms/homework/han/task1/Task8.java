package com.tms.homework.han.task1;

//        Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//        массива должен равняться отношению элемента из первого массива с i-ым
//        индексом к элементу из второго массива с i-ым индексом. Вывести все три
//        массива на экран (каждый на отдельной строке), затем вывести количество
//        целых элементов в третьем массиве.

public class Task8 {
    public static void main(String[] args) {
        int[] firstArr = new int[10];
        int[] secondArr = new int[10];
        double[] thirdArr = new double[10];
        int count = 0;
        System.out.print("Первый массив: ");
        printArr(firstArr);
        System.out.print("Второй массив: ");
        printArr(secondArr);
        System.out.print("Третий массив: ");
        for (int i = 0; i < thirdArr.length; i++) {
            if (firstArr[i] == 0 && secondArr[i] == 0) {
                thirdArr[i] = 0;
            }
            else {
                thirdArr[i] = (double)firstArr[i] / secondArr[i];
            }
            System.out.print(thirdArr[i] + " ");
            if (thirdArr[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество целых элементов в 3 массиве: " + count);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 9));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
